package Strings;

public class String_Builder {
    public static void main(String[] args) {
        String a = "ABCDEFG";
       StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
           builder.append(ch); //append: to add something to the end of a piece of writing:
        }
        System.out.println(builder);
        System.out.println(builder.reverse()); //reverses th string
        System.out.println(builder.length()); //returns the length of string
        System.out.println(builder); //any changes made in builder is reflected in the original string
        System.out.println(builder.append(a)); //adds string a = ABCDEFG to builder
        System.out.println(builder.insert(0,'g'));//index, char to insert
    }
}
