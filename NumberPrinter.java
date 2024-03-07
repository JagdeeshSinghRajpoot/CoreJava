
class NumberPrinter implements Runnable {
    private final int start;
    private final int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            
            if(Thread.currentThread().getName() == "Thread 1" && i == 5){
                Thread.currentThread();
                try {
                    Thread.sleep(System.currentTimeMillis()+10);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }



    public static void main(String[] args) {
        // Create two instances of NumberPrinter
        NumberPrinter printer1 = new NumberPrinter(1, 10);
        NumberPrinter printer2 = new NumberPrinter(2, 20); // 2 times table

        // Create threads
        Thread thread1 = new Thread(printer1, "Thread 1");
        Thread thread2 = new Thread(printer2, "Thread 2");

        // Start threads
        thread1.start();
        thread2.start();
    }
}



