package Java;

public class ThraedsInJava extends Thread {

  public void run(){
    for(int i=1;i<10000;i++){
      System.out.print("# ");
    }
  }


  


  public static void main(String[] args) {
   ThraedsInJava t1 = new ThraedsInJava();
   t1.start();
  }



}
