package Strings.StringQuestions;

public class StringHalves {
    public static void main(String[] args) {
    boolean ans = halvesAreAlike("abcdirty");
        System.out.println(ans);

    }


    public static boolean halvesAreAlike(String s) {
        String s1 = s.substring(0,(s.length()/2)).toLowerCase();
        String s2 =s.substring((s.length()/2)).toLowerCase();
        int c1 =0 ,c2=0;
        char[] ch = {'a','e','i','o','u'};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <s.length()/2; j++) {
                if (ch[i] == s1.charAt(j)){
                    c1++;
                }
                if (ch[i] == s2.charAt(j)){
                    c2++;
                }
            }
        }
        return c1 ==c2 ;

    }


}
