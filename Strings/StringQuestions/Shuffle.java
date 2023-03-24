package Strings.StringQuestions;

public class Shuffle {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] a = {4,5,6,7,0,2,1,3};
        String ans = restoreString(s,a);
        System.out.println(ans);
    }
    public static String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()] ;
        for (int i = 0; i <s.length() ; i++) {
            ch[indices[i]] = s.charAt(i);
        }
        return  String.copyValueOf(ch);
    }
}
