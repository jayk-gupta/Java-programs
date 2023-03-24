package Arrays;

import java.util.Arrays;

public class Array_functions {
    public static void main(String[] args) {
        int[] a ={1,5,743,211,45,78,81,21,20};
        int[] b={1,2,3,4};
        int[] c={1,2,3,4};
        int[] d ;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.equals(b,c));
        d = Arrays.copyOf(c,6);
        d[4]=5;
        d[5]=6;
        System.out.println(Arrays.toString(d));
    }
}
