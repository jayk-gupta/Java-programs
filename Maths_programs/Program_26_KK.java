package Maths_programs;

import java.util.Scanner;

public class Program_26_KK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,N=0,PE=0,PO=0;
        for (int i = 0; ; i++) {
            n= in.nextInt();
            //to exit
            if (n==0){
                break;
            }
            //n<0
            if (n<0){
                N +=n;
            }
            //n>0
            else {
                if (n%2==0){
                    PE+=n;
                }
                else {
                    PO+=n;
                }
            }

        } //end of for loop
        System.out.println("sum of negative number is:"+N);
        System.out.println("sum of positive even number is :"+PE);
        System.out.println("sum of positive odd number is :"+ PO);





    }
}
