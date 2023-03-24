package Arrays.ArrayQuestions;
import java.util.Scanner;
// 1. To find pairs of element in array whose sum is = input number
//   2.To check duplicate values of an element
public class Target_element_sum {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        //Array declaration and initialization
        int[] arr = {2,3,5,7,9,10,2,3};
        int sum;
        //logic to find pairs
        for (int i =0; i< arr.length ; i++) {
            for (int j =i+1; j < arr.length ; j++) {
                sum=arr[i]+arr[j];
                if (sum==n){
                    System.out.println(arr[i]+","+arr[j]);
                    }
            }
        }
      checkDuplicate(arr);
    }
    //to check duplicate values of an element
    static void checkDuplicate(int[] arr){
        for (int i =0; i< arr.length ; i++) {
            for (int j =i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println(arr[i]+" is duplicate at: "+j);
                }

            }
        }




    }

}
