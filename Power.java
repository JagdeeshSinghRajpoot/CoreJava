
public class Power{
  public static void Numbers(int n){
    if (n==0) {
      return ;
    }
    
    Numbers(n-1);
    System.out.print(" " + n + " ");
  }
  
  public static int Power1(int a, int n){
    if(n==0){
      return 1;
    }
    
    return a * Power1(a, n-1);
  }

  public static int Power2(int a, int n){
    if(n==0){
      return 1;
    }

    int HalfPower = Power2(a, n/2) * Power2(a, n/2);

    if (n%2 != 0) {
      HalfPower *= a; 
    }
    return HalfPower;
  }

  public static int Power3(int a, int n){
    if(n==0){
      return 1;
    }

    int HalfPower = Power3(a, n/2);
    int HalfPowerSq = HalfPower * HalfPower;

    if (n%2 != 0) {
      HalfPowerSq *= a; 
    }
    return HalfPowerSq;
  }

  public static void test(){
      int[][] A2D = new int[5][10];
      System.out.println(A2D[3].length);
      Math
  }


  public static void main(String[] args) {
    // Numbers(10);
    System.out.println(Power1(2,5));
    // System.out.println(Power2(2,8));
    System.out.println(Power3(2, 5));
    // test();
  }
}