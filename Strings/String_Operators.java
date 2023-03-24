package Strings;

import java.util.ArrayList;

public class String_Operators {
    public static void main(String[] args) {
        System.out.println("web"+"-Development"); //string concatenation
        System.out.println("a+b = "+('a'+'b')); //97-a,98-b
        System.out.println("a+b = "+'a'+'b'); //97-a,98-b

        System.out.println("A+B ="+'A'+'B'); //A-65,B-66
        System.out.println("A+B ="+('A'+'B')); //A-65,B-66

        System.out.println("a ="+'a');
        System.out.println("A"+'a'); System.out.println("A"+"a"); //Aa

        System.out.println('a'+1);//98
        System.out.println('a'+'1');//a(97)+1(49)

        System.out.println("a"+1); //string concatenation
        //after a few steps it is same as "a"+"1";
        System.out.println((char)('a'+3));//casting
        System.out.println("jay"+ new ArrayList<>());
        System.out.println(""+new Integer(5));
        String ans = new ArrayList<>()+""+new Integer(6);
        System.out.println(ans);
    }
}
