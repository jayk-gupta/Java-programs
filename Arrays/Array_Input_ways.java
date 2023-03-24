package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Input_ways {
    public static void main(String[] args) {
        System.out.println("enter elements of array: ");
        Scanner in = new Scanner(System.in);
        //PRIMITIVES
        int[] arr = new int[5]; // array declaration and initialization
//
//        // taking array input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        // printing using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        // printing using for-each loop
            for (int num : arr) {             //for every element in array, print the element
                System.out.print(num + " "); //here num represents element of the array
            }
//        System.out.println();
//        //Printing using Arrays.toString method
//        System.out.print(Arrays.toString(arr));

            //Array of Objects
            System.out.println("enter string:");
            String[] str = new String[5];
            for (int j= 0; j < str.length; j++) {
                str[j] = in.next();
            }
            str[2] = "Preksha"; // modifying str[2]
            System.out.println(Arrays.toString(str));


        }
    }
}
