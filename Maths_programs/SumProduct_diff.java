package Maths_programs;

public class SumProduct_diff {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(123));


    }

    public static int subtractProductAndSum(int n) {
        int S = 0, P = 1, D, r;
        while (n != 0) {
            r = n % 10;
            P = P * r;
            S = S + r;
            n = n / 10;
        }
        return P-S;
    }
}
