package Arrays.ArrayQuestions;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9};
        System.out.println(ar.length);
        System.out.println(Arrays.toString(ar));
        swap(ar,1,3);
        System.out.println(Arrays.toString(ar));
    }

     static void swap(int[] ar,int index1, int index2) {
         int temp;
                temp = ar[index1];
               ar[index1] = ar[index2];
               ar[index2] = temp;

    }
}
