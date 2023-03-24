package Strings.StringQuestions;

public class ShuffleString {
        public static void main(String[] args) {
            String s = "leetcode";
            int[] a = {2,3,4,5,1,0,6,7};
             restoreString(s,a);

        }

        public static void restoreString(String s, int[] indices) {
            char[] ch = s.toCharArray();
            StringBuilder S = new StringBuilder(8);
            for (int i = 0; i<ch.length ; i++) {
                S.insert(indices[i],ch[i]);
            }
            System.out.println(S);
        }


}
