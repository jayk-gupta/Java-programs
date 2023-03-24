package Arrays.ArrayQuestions;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
      int  start =0;
      int end= arr.length-1;
      while (start<end){
          //swap
          swap(arr,start,end);
          start++;
          end--;
                }
    }
    static void swap(int[] ar,int index1, int index2) {
        int temp;
        temp = ar[index1];
        ar[index1] = ar[index2];
        ar[index2] = temp;

    }


}
