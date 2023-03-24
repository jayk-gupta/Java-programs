package Maths_programs;

import java.util.Scanner;

public class Number_Input {
    //KK program 24
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0 , max=0;
        for (int i=0;  ; i++) {
            int n = in.nextInt();
            if (n==0){
                break;
            }
            sum+=n;
            if (n>max){
                max=n;
            }
        }
        System.out.println("sum is "+sum);
        System.out.println("Largest number is:"+max);


    }
}
