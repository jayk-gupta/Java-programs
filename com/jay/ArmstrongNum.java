package com.jay;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        System.out.println("Enter a three digit number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r , sum = 0;
        while (n!=0){
            r = n % 10;
            n = n / 10;
            sum += r * r * r;
        }
        System.out.println(sum);
        if (sum==n) {
            System.out.println("armstrong number");
        }
        else {
            System.out.println("not armstrong number");
        }



        }
    }

