package Strings;

public class Str_syntax {
    public static void main(String[] args) {
      //syntax:
        // String str_name = new String("");
        String str = new String("Communication");
       int result, indx;
       char ch;
        //find length of string
        System.out.println("Length of "+str+" "+str.length());

        //display one char at a time
        for (int i = 0; i <str.length() ; i++) {
            System.out.println("character at "+i+" index is "+str.charAt(i));
        }

        String str2 = new String(str);
        //check the sequence of the characters of the string
        if (str.equals(str2)){
            System.out.println("str equals str2");
        }
        else{
            System.out.println("str is not equal to str2");
        }
        //second way to declare string
        String str3 = "This is quoted String";
        System.out.println(str2);
        System.out.println(str3);

        //compares the two strings
        result = str.compareTo(str3);
        if (result==0){
            System.out.println("strings are equal");
        }
        else if (result<0){
            System.out.println("str  is less than str2");
        }
        else{
            System.out.println("str  is greater than str2");
        }
        str3 ="one thirty one";
        //returns the index of the first match
        indx = str3.indexOf("t");
        System.out.println("index of first occurence of t is : "+indx);
        //returns the index of last match
        indx = str3.lastIndexOf("t");
        System.out.println("index of last occurence  of t is :"+indx);

        String s1="jay";
        //concatenate two strings together by "+" operator
        String s2="kumar";
        String s3 ="gupta";
        String s4 = s1+s2+s3;
    }
}
