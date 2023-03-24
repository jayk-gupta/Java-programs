package Strings;

public class Performance {
    public static void main(String[] args) {
//        String series="";
//        for (int i = 0; i < 26; i++) {
//            char ch = (char) ('a'+i);
//            System.out.println(ch);
//            series+=ch;
//        }
//        System.out.println(series);

        char chars[] ={'a','b','c','d','e','f','g','h'};
        String s = new String(chars);
        System.out.println(s);
        String S = new String(chars,3,3);
        //Array of characters,StartIndex,number of Characters
        System.out.println(S);
        StringLength();
        Concatenation();
        getChars();
    }
    static  void StringLength(){
        String name = "Jay likes coffee";
        System.out.println(name.length());
    }
   static void Concatenation(){
        int age= 20;
        String s = "i am "+age+"old";
       System.out.println(s);

   }
   static void charAt(){
        String s = "procrastination";
       System.out.println(s.charAt(10));

   }
   static void getChars(){
        //getChars (int source start, int source end,target array,int target start)
       String s ="This is demo of getChars ,method";
       int start=8,end=12;
       char buf[]= new char[end-start];
       s.getChars(start,end,buf,0);
       System.out.println(buf);
   }


}
