package Maths_programs;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // P is the principal amount
        //r is the rate of interest(decimal)
        //n is frequency or no. of  times the interest is compounded annually
        //t is the overall tenure.
        System.out.println("enter principal:");
        float p= in.nextFloat();
        System.out.println("enter rate of interest");
        float r= in.nextFloat();
        System.out.println("enter frequency:");
        float n= in.nextFloat();
        System.out.println("enter time ");
        float t= in.nextFloat();
        // formula
        double CI = p*Math.pow((1+r/n),n*t)-p;
        System.out.println(CI);
    }
}
