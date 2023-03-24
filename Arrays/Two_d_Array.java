package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Two_d_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array declaration and initialization
        int [][]arr = new int [3][3];
        //inputting array
        System.out.println("length of the array is: "+arr.length); //length of row
               //for each row
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column]=in.nextInt();
            }
        }
        //printing array using for loop
        for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        //printing using Arrays.toString
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
       //printing using for-each loop
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
