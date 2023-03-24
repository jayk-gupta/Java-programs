package Maths_programs;

import java.util.Scanner;

public class program12_vsLab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cp = 0;
        int np = 0;
        for (int i = 0; ; i++) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            if (n > 0) {
                cp = 0;
                cp++;
            }
            if (n < 0) {
                np = 0;
                np++;
            }
        }
        System.out.println("positive numbers: " + cp);
        System.out.println("negative numbers: " + np);


    }
}
