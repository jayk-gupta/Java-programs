package Arrays.ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayTo_ArrayList {
    public static void main(String[] args) {
        int [] arr = {1,2,34,56,76,23};
        ArrayList<Integer> list = new ArrayList(Arrays.asList(arr));
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i]);
//        }
        System.out.println(list);
    }
}
