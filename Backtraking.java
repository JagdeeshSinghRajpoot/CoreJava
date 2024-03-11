public class Backtraking {


  // Back traking 
  public static boolean BackT(int i){
    if(i == 2  || i==1){
      return true;
    }
    if(i%2 != 0){
      return false;
    }
    
    return BackT(i/2);
  }


  public static void main(String[] args) {
    int[] arr = new int[5];
    int i = 17;
    System.out.println(BackT(i));
  }
  
}
