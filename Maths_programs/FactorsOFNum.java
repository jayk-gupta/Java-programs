package Maths_programs;

import java.util.Scanner;

public class FactorsOFNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <=n ; i++) {
            int r = n%i;
            if (n%i==0){
                System.out.println(i);
            }
        }



    }
}
