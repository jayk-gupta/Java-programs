package Maths_programs;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in. nextInt();
        int number = n;
        int r,ans=0;
        while (n!=0){
            r=n%10;
            n=n/10;
            ans = ans*10+r;
        }
        System.out.println(ans);
        if (ans==number){
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("not palindrome number");
        }

    }
}
