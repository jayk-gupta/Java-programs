package Class_Introduction.Practice;

public class Class1 {
    public static void main(String[] args) {
        class Student{
            String name;
            int rno;
            int age;
            //constructor
            Student(){
                this.name = "student";
                this.rno = 0;
                this.age = 19;
            }
            //Constructor with parameters
            public Student(String name, int rno, int age) {
                this.name = name;
                this.rno = rno;
                this.age = age;
            }
            //passing other object as parameter
            Student(Student other){
                this.name =other.name;
                this.rno =other.rno;
                this.age=other.age;
            }
        }
        Student kanika = new Student("Kanika",21,19);
        System.out.println(kanika.name);
        System.out.println(kanika.rno);
        System.out.println(kanika.age);

        Student kunal = new Student(kanika);
        System.out.println(kunal.name);
        System.out.println(kunal.rno);
        System.out.println(kunal.age);




    }
}
