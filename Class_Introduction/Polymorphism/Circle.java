package Class_Introduction.Polymorphism;

public class Circle extends Shapes{
    //This will run when object of circle is created
    //Hence it is overriding the parent method
    @Override //This is called annotation(used for check purposes)
    void area(){
        System.out.println("Area is pie * R*R");
    }
}
