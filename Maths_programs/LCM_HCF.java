package Maths_programs;

import java.util.Scanner;

public class LCM_HCF {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("input two numbers");
        System.out.println("Enter number1");
        int n1=in.nextInt();
        System.out.println("Enter number2");
        int n2= in.nextInt();
        Lcm(n1,n2);
        Hcf(n1,n2);
    }

    private static void Lcm(int a, int b) {
        for (int j = 2;  ; j++) {
            if (j%a==0 && j%b==0){
                System.out.println("Lcm is: "+j);
                break;
            }
        }

    }
    //Highest possible number that divides both a and b
    static void Hcf(int a, int b){
        int min = Math.min(a, b);
        for (int i = min; i >1 ; i--) {
             if (a%i==0 && b%i==0){
                 System.out.println("HCF is: "+i);
                 break;
             }

        }


    }
}
