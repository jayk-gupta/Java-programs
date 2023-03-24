package Strings.StringQuestions;

public class DefangingIPAddress {
    public static void main(String[] args) {
//        System.out.println(defangIPaddr("1.1.1.1."));


    }

    public static String restoreString(String s, int[] indices) {
       char[] ch = s.toCharArray();
        StringBuilder S = new StringBuilder(ch.length);
        for (int i = 0; i <S.length() ; i++) {
            S.insert(indices[i],ch[i]);
        }
        return S.toString();
    }







    public static String defangIPaddr(String address) {
             return  address.replace(".","[.]");


        }




}
