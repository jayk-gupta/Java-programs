package Arrays.ArrayQuestions;

import java.util.Arrays;

public class Copy1ArrayInAnotherArray {
    public static void main(String[] args) {
        int[] A ={2,4,6,8,10,12} ;
        int[] a = new int[6];
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(a));
        //copying
        for (int i = 0; i <A.length ; i++) {
                 a[i]=A[i];
        }
        System.out.println(Arrays.toString(a));

    }
}
