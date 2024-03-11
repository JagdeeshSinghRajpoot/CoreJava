public class StringTest {

  public static int sum(int[] a, int[] b){
    int i = a.length-1;
    int j = b.length-1;
    
    int sum = 0;

    while(i >= 0 && j >= 0 && i == j){
      
      if(i != a.length-1 && j != a.length-1){
        sum += (int) (a[i] + b[j] * Math.pow(10, (a.length-1) - i));
        System.out.println((a.length) - i);
        i--;
        j--;
      } else {
        sum += a[i] + b[j];
        i--;
        j--;
      }
      System.out.println(i +" sum is : "+ sum);
    }
    return sum;
  }

  public static void printArr(int[] a){
    for (int i : a) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    // String s = "Jagdeesh is a great ,: 1Aman";
    // s = s.toLowerCase().replaceAll("[^a-z]", "");;
    // System.out.println(s);
  //   int i = 1;

  //   int a = (int) Math.pow(10, 0);
  //   //5
  //   System.out.println(a + 5);
  //   a = (int) Math.pow(10, 1);
  //   //15
  //   System.out.println(a + 5);

  //   a = (int) Math.pow(10, 2);
  //   //105
  //   System.out.println(a + 5);
  int[] arr = {2, 4, 3};
  int[] brr = {5, 5, 4};

  System.out.println(sum(arr, brr));
  }
  
}
