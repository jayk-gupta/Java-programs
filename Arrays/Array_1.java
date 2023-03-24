package Arrays;

public class Array_1 {
    public static void main(String[] args) {
        //syntax
        /* data-type[] array_name = new data-type[size];
        * eg: int      sample[]  = new int [10];
        *      int sample[]; //declaring an array reference variable
        *      sample = new  int [10]; //allocating memory
        * */
        /*
        1. data-type declares the element type of the array
        2.number of elements is determined by the size
        3.Arrays are implemented as objects.
        4.Creation of array is a two-step process
           1.Declare an array reference variable
           2.allocate memory for array.
        5.Arrays in java are dynamically allocated using the new operator
*/
        //store 5 roll-nos
        int[] rnos = new int[5];
                 //or another method
        int [] rno2= {23,34,5,2,34};

        int[] rollno;// declaration of array, rollno is reference var which is defined in the stack memory
        rollno = new int [5];//actual creation of object in heap
          //string array
        String[] name = new String[20];
        System.out.println("default value of integer array is :"+rnos[2]);
        System.out.println("default value of string array is: "+name[3]);


    }
}
