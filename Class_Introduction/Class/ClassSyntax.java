package Class_Introduction.Class;

public class ClassSyntax {
    public static void main(String[] args) {
        /*   class Class_Name {
             field, constructor, and
             method declarations
        }*/
        class Student{
           int rno;
            String name;
            float marks =97;
            char section;
        }
        Student jay; //Declare reference variable to object , reference to type student
        jay = new Student(); // allocate student object

        //default values of various data-types
        System.out.println(jay.rno);
        System.out.println(jay.section);
        System.out.println(jay.marks);
        System.out.println(jay.name);

        //adding values
        jay.rno=33;
        jay.name="Jay Kumar Gupta";
//        jay.marks =90;
        jay.section='A';

        System.out.println(jay.rno);
        System.out.println(jay.section);
        System.out.println(jay.marks);
        System.out.println(jay.name);

    }
}
