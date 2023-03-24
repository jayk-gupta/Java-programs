package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int [] arr = {1,4,5,12,4,9,6};
        Array(arr);
//        String();

    }
     static void Array(int[] arr){
         int sum=0;
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+" ");
         }
         //sorting array
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
         //sum
         for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
         }
         System.out.println(sum);


    }

     //String Array
      static void String(){
          Scanner in = new Scanner(System.in);
          System.out.println("Enter size of Array");
          int n = in.nextInt();
        String [] s = new String[n];
          System.out.println("Enter the string");
          for (int i = 0; i < s.length; i++) {
              s[i]=in.next();
          }
          System.out.println(Arrays.toString(s));
          Arrays.sort(s);
          System.out.println(Arrays.toString(s));
      }

}
