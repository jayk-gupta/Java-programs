package com.jay;

import java.util.Scanner;

public class CountPrimesLetCode {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        System.out.println(CountingPrimes(n));
    }

    static int CountingPrimes(int n){
        int count=0;
        //print all primes less than N
        for (int i = 2; i < n; i++) {
            if (CheckPrime(i)){
                count++;
            }
        }
        return count;
    }


    static boolean CheckPrime(int num){
        if (num<= 1) return false;
        for (int i = 2; i*i<=num; i++) {
            if (num % i ==0){
                return false;
            }
        }
        return true;
    }
}
