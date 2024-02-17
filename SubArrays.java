package Java;


public class SubArrays {

  public static void printSubArrays(int numbers[]){
    for(int i=0;i<numbers.length;i++){
      for(int j = i;j<numbers.length;j++){
        int count = 0;
        for(int k = i;k<=j;k++){
          count+=numbers[k];
          System.out.print(numbers[k]+" ");
        }
        System.out.println("count = "+count);
      }
      System.out.println();
    }
  }


  public static void printSubArraysMinMaxValue(int numbers[]){
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;

    for(int i=0;i<numbers.length;i++){
      for(int j = i;j<numbers.length;j++){
        int count = 0;
        for(int k = i;k<=j;k++){
          count+=numbers[k];
        }
        if(min>count){
          min = count;
        }
        if(max<count){
          max = count;
        }
        
      }

    }

    System.out.println("Min value is : "+min);
    System.out.println("Max value is : "+max);
  }


  public static void main(String[] args) {
    int numbers[] = {2, 4, 6, 8, 10};
    printSubArrays(numbers);
    printSubArraysMinMaxValue(numbers);
  }
}
