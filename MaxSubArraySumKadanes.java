
/**
 * MaxSubArraySumKadanes
 */
public class MaxSubArraySumKadanes {

  public static int kadnes(int numbers[]) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;

    for (int i = 0; i < numbers.length; i++) {
      currSum = currSum + numbers[i];
      if (currSum < 0) {
        currSum = 0;
      }
      maxSum = Math.max(currSum, maxSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    System.out.println("Max sum is : "+kadnes(numbers));
  }

}