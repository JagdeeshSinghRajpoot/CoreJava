
public class MeargSort {

  public static void meargSort(int[] arr , int si, int ei){
    if(si >= ei){
      return;
    }
    int mid = si + (ei - si)/2;
    meargSort(arr, si, mid); //left
    meargSort(arr, mid+1, ei);//right
    mearg(arr, si, mid, ei);

  }

  public static void mearg(int[] arr, int si, int mid, int ei){
    int[] temp = new int[ei - si + 1];
    int i = si;
    int j = mid+1;
    int k = 0;

    while(i <= mid && j <= ei){
      if(arr[i] < arr[j]){
        temp[k] = arr[i];
        i++;
      }else{
        temp[k] = arr[j];
        j++;
      }
      k++;
    }

    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    
    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    for(k = 0, i = si; k<temp.length; k++, i++){
      arr[i] = temp[k];
    }
    printArray(temp);
  }

  public static void printArray(int arr[]){
    System.out.print("[");
    for (int i : arr) {
      System.out.print(i +" ");
    }
    System.out.print("]");
  }

  public static void main(String[] args) {
    int arr[] = {1,2,8,5};
    
    meargSort(arr, 0, arr.length-1);
    
  }
}
