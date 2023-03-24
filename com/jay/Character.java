package com.jay;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        char ch;
//        ch ='A';
        char ch = 'a';
        System.out.println("ch contains "+ ch);
        ch++;//increment ch(A char can be incremented)
        System.out.println("ch now is "+ch);
        ch=90;//A char can be assigned an integer value
        System.out.println("ch now is "+ch);
        ch=68;
        System.out.println(ch);



        char ch1 = in.next().trim().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("uppercase");
        }





    }
}
