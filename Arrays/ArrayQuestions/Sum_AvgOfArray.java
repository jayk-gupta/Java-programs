package Arrays.ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_AvgOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        int sum=0;
        float avg;
        System.out.println("enter 5 numbers: ");
        //input
        for (int i = 0; i <a.length ; i++) {
            a[i]= in.nextInt();
            sum+=a[i];
        }
        avg = sum/a.length;
        System.out.println(Arrays.toString(a));
        System.out.println("Sum is: "+sum);
        System.out.println("average is: "+avg);
        boolean ans= checkNum(a);
        System.out.println(ans);

    }
    //To check whether a given number is present in the array or not
    static boolean checkNum(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int num = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("index of element is: "+i);
                return true;
            }
        }
      return  false;

    }

}
