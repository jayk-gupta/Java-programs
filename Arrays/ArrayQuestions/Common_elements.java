package Arrays.ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Common_elements {
    public static void main(String[] args) {
        //To find common elements in two Arrays
        int[] ar1 = {1, 23, 4, 5, 6, 7, 89, 10, 11, 23};
        int[] ar2 = {23, 4, 5, 67, 89, 10, 20, 35};
        int[] ar3 = new int[10];
        //ArrayList
        ArrayList <Integer> list = new ArrayList<>(5);
        int k=0;
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        //logic
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar2.length; j++) {
                if (ar1[i]==ar2[j]){
                    ar3[k]=ar1[i];
                    list.add(ar1[i]);
                    k++;
                }
            }
        }

        System.out.println(Arrays.toString(ar3));
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.print(list.get(i)+" ");
//        }
        System.out.println(list);


    }
}
