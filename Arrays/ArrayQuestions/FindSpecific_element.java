package Arrays.ArrayQuestions;

import java.util.Scanner;

public class FindSpecific_element {
    public static void main(String[] args) {
        int[] arr = {11,12,34,56,7,0,9,19,34};
        System.out.println("Enter an element:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        findElement(arr,n);

    }

    static void findElement(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            if (n==arr[i]){
                System.out.println("Element is found at: "+i+ " position");
            }
        }

    }

















}
