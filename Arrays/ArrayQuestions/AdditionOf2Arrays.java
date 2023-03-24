package Arrays.ArrayQuestions;

import java.util.Arrays;

public class AdditionOf2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 ={6,7,8,9,10};
        int [] arr3 = new int[5];
        add(arr1,arr2,arr3);
        System.out.println("arr3 is: "+Arrays.toString(arr3));
    }
     static void add(int[] arr1,int[] arr2,int[] arr3) {
         for (int i = 0; i < 5; i++) {
             arr3[i]=arr1[i]+arr2[i];
         }



    }
}
