package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name1= "Saumya";
        String name2 = "Sakshi";
        String name3 = "Sam";
        String name4 = "Arjun";
        String s1= new String("kajal");
        String s2= new String("kajal");
        String s3 = "kajal";
        String s4 ="kajal";
        //== and .equals
        System.out.println(s1==s2);//checks if variable are pointing to the same object
        System.out.println(s4==s3); //s3 and s4 are pointing to the same object
        System.out.println(s1.equals(s2));//checks the value only

        //CompareTo:
        /*if (string1 > string2) it returns a positive value.
          if both the strings are equal lexicographically
          i.e.(string1 == string2) it returns 0.
          if (string1 < string2) it returns a negative value.
            (int)str1.charAt(i) – (int)str2.charAt(i)
            It returns the difference of the first different character of both the strings
         */
        System.out.println(name1.compareTo(name2));
        System.out.println(name1.compareTo(name3));
        System.out.println(name1.compareTo(name4));

        //different String methods
        String name= "jay kumar gupta";
        System.out.println(name.substring(4,9));//extract part of a string
        System.out.println(Arrays.toString(name.toCharArray()));// coverts to char array
        System.out.println(name.toUpperCase()); //changes to upper-case

      //** The original String is not changed, whatever method is applied, it every-time creates a new Object **
        System.out.println(name); // name is as it is

        //returns index of p
        System.out.println(name.indexOf('p'));

        // strip removes the spaces before and after the string
        System.out.println("        Hello My name is Rocky     ".strip()+" and I am 20yrs old");

//        String [ ] split ( String regex, int limit )
//       ->  regex - the string is divided at this regex (can be strings)
//        -> limit (optional) - controls the number of resulting substrings
//        If the limit parameter is not passed, split() returns all possible substrings.

        System.out.println(Arrays.toString(name.split(" ",3)));
    }
}
