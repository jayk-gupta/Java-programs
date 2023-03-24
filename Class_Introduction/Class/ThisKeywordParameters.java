package Class_Introduction.Class;

public class ThisKeywordParameters {
    public static void main(String[] args) {
        class Student{
            int rno;
            String name;
            float marks;
            //Constructor with parameters
            Student(int rno,String name, float marks){
              this.rno= rno;
              this.name=name;
              this.marks=marks;
            }
            //This is how you call a Constructor from another Constructor
            //internally: new Student(12,"default person",100f);
            Student(){
                this(12,"default person",100f);

            }
            //Constructor: passing other object as a parameter
            Student (Student other){
                this.rno=other.rno; //this.rno is replaced with r.name and other.rno with kunal.rno
                this.name=other.name;//r.name=kunal.name
                this.marks=other.marks;//r.marks=kunal.marks

            }

        }
        //create object
        Student kunal = new Student(13,"kunal khuswaha",89); //with parameter
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student();//Constructor calling other Constructor
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student r = new Student(kunal);//passing object kunal as argument in Constructor
        System.out.println(r.rno);
        System.out.println(r.name);
        System.out.println(r.marks);

        //Finalize method: It is called when Java is doing Garbage collection
        class A{
           String name;
            public A(String name){
                this.name=name;
            }
            //Whenever an object is freed from the memory this will be called
            @Override
            protected void finalize() throws Throwable {
                System.out.println("Object is Destroyed");;
            }
        }
       A obj;
        for (int i = 0; i < 1000; i++) {
            obj = new A("Random name");
        }

        final A jay = new A("jay");
        jay.name="other name";
//        jay =new A("new object"); //When a non-primitivce is final, you cannot REASSIGN it.




    }
}
