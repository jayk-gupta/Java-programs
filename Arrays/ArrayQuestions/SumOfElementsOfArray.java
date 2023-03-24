package Arrays.ArrayQuestions;

import java.util.Scanner;

public class SumOfElementsOfArray {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr= new int[10];
    int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("sum is:"+sum);

}
}
