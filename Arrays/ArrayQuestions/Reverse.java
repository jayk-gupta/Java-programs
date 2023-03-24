package Arrays.ArrayQuestions;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={12,2,5,8,23,56,62,16};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void  swap(int[] ar,int index1,int index2){
        int temp;
       temp = ar[index1];
       ar[index1]=ar[index2];
       ar[index2]=temp;
    }
}
