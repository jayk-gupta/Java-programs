package Class_Introduction.Class;

public class ThisKeyword {
    public static void main(String[] args) {
     class Student {
         int rno;
         String name;
         float marks;
         //Constructor
         //We need a way to add the values of the above properties
         //object by object
         //We need one word to access every object and automatically replace the word jay or whatever the name is
         //"this" basically means what object you are referring to
         Student(){
             this.rno=24;
             this.name="jay"; //replacing it with the name of the reference variable
             this.marks=70;   //eg:kanika.greet->kanika.name="jay"

         }
         void greet(){
             System.out.println("Hello My name is: "+name);

         }
         void changeName(String newName){
               name = newName;
             System.out.println(name);
         }


     } //class  end

     //Create an object
        Student kunal;
     kunal = new Student();
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        //create second object
        Student kanika = new Student();
        System.out.println(kanika.rno);
        System.out.println(kanika.name);
        System.out.println(kanika.marks);

        //function
        kanika.greet();
        kunal.changeName("shoe lover");
        kunal.greet();












    }
}
