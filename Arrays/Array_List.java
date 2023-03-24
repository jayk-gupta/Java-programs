package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        //cannot use :  ArrayList<int> list = new ArrayList<Integer>;
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        //adding elements:(.add) Appends the specified element to the end of this list
        list.add(1); list.add(2); list.add(22); list.add(5);
        list.add(6767);list.add(45);list.add(46);list.add(34);

        //Prints the list
        System.out.println(list);

        System.out.println(list.contains(22));
        System.out.println(list.contains(221));
        //Replaces the element at the specified position in this list with the specified element.
        list.set(0,32);

        list.remove(3);
        System.out.println(list);

        //String array list
        Scanner in = new Scanner(System.in);
        ArrayList<String> List = new ArrayList<String>(5);
        System.out.println("Enter String elements: ");

        //input
        for (int i = 0; i < 5; i++) {
            List.add(in.next());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(List.get(i)); //GET: Returns the element at the specified position in this list
        }
        System.out.println(List);
        //Sublist returns a part of arrayList
        System.out.println(List.subList(0,2));
        //Sorting elements
        //Ascending order
        Collections.sort(List);
        System.out.println(List);
        //Descending order
        List.sort(Collections.reverseOrder());
        System.out.println(List);

    }
}
