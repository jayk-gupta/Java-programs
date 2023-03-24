package com.jay;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        //Take Input from user till user does not press x or X
        while (true) {
            //take the operator as input
            System.out.println("Enter the operator ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //input two numbers
                System.out.println("Enter two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                 if (op=='+') {
                     ans = num1 + num2;
                 }
                 if (op=='-') {
                     ans = num1 - num2;
                 }
                 if (op=='*') {
                     ans = num1 * num2;
                 }
                 if (op=='/') {
                     ans = num1 / num2;
                 }
                 if (op=='%') {
                     ans = num1 % num2;
                 }

                else {
                     System.out.println("invalid operator!!");
                 }
                System.out.println(ans);
            }
        }




    }
}
