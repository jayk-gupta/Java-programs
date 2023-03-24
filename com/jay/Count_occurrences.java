package com.jay;

import java.util.Scanner;

public class Count_occurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long r, count = 0;
        System.out.println("enter the number");
        long n = in.nextInt();
        for (int i = 0; i < 20; i++) {
            r = n % 10;
            if (r == 7) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("The number of 7s are: " + count);


    }
}

