package Maths_programs;

import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the figure name to calculate area:");
        String figure = in.next();
        //switch
        switch (figure) {
            case "circle" -> Circle();
            case "triangle" -> triangle();
            case "square" -> square();
            case "rectangle" -> rect();
        }

    }
    //circle
    static void Circle(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        float r = in.nextFloat();

        final float pi = 3.14f;
        float area = pi*r*r;
        System.out.println(area);
    }
    //triangle
    static void triangle(){
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three sides of the triangle");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        float s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);
    }
    //square
    static void square(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter side:");
        int s =in.nextInt();
        float area = s*s;
        System.out.println(area);
    }

    //rectangle
    static void rect(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter length");
        int l = in.nextInt();
        System.out.println("Enter breadth");
        int b = in.nextInt();
        System.out.println("The area of rectangle is :"+l*b);


    }


}
