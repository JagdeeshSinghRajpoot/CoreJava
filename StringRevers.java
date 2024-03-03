package Java;

public class StringRevers {
  public static void revers(String s){
    char c[] = s.toCharArray();
    int start = 0;
    int end = s.length() - 1;
    char temp = 0;
    while (start < end) {
      temp = c[start];
      c[start] = c[end];
      c[end] = temp;
      start++;
      end--;
    }

    for (char d : c) {
      System.out.print(d);
    }
  }

  // String str = c.toString();
  // return str;

  public static void main(String[] args) {
    String s = "jagdeesh";
    System.out.println(s);
    revers(s);
  }
}