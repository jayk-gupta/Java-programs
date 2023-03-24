package Strings.StringQuestions;

import java.util.Arrays;

public class LastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));




    }


    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        return str[str.length - 1].length();
    }

}
