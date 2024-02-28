import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PhotoServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(8080), 0);
        server.createContext("/", new MyHandler());
        server.setExecutor(null);
        server.start();
    }

    static class MyHandler implements HttpHandler {
        private final List<String> photos = List.of("/images/photo.jpg", "/images/another_photo.jpg");
        private int currentPhotoIndex = 0;

        @Override
        public void handle(HttpExchange t) throws IOException {
            String uri = t.getRequestURI().toString();
            t.getResponseHeaders().add("Content-Type", "text/html");
            OutputStream os = t.getResponseBody();

            if (uri.equals("/")) {
                serveHtmlPage(os);
            } else if (uri.equals("/next")) {
                nextPhoto();
                serveImage(os);
            } else if (uri.equals("/prev")) {
                prevPhoto();
                serveImage(os);
            } else {
                serveImage(os);
            }

            os.close();
        }

        private void serveHtmlPage(OutputStream os) throws IOException {
            Path htmlFilePath = Paths.get("index.html");
            byte[] htmlBytes = Files.readAllBytes(htmlFilePath);
            os.write(htmlBytes);
        }

        private void serveImage(OutputStream os) throws IOException {
            Path imageFilePath = Paths.get("images", photos.get(currentPhotoIndex));
            byte[] imageBytes = Files.readAllBytes(imageFilePath);
            os.write(imageBytes);
        }

        private void nextPhoto() {
            if (currentPhotoIndex < photos.size() - 1) {
                currentPhotoIndex++;
            }
        }

        private void prevPhoto() {
            if (currentPhotoIndex > 0) {
                currentPhotoIndex--;
            }
        }
    }
}
