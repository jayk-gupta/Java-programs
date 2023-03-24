package Class_Introduction.StaticKeyword;

public class StaticBlock {
    static int a = 4;
    static  int b;
//Static block will only run once when the first object is created i.e.
// when the class is loaded for the first time.
   static {
   System.out.println("I am a static block");
        b= a*5;
    }

    public static void main(String[] args) {
       //First object
        StaticBlock obj = new StaticBlock();
        //Static variables can be accessed by calling with the class name ClassName.VariableName
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
        StaticBlock.b+=6;
         //second object
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);

   }

}
