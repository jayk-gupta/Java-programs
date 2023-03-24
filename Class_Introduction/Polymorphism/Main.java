package Class_Introduction.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square =new Square();
        Shapes circle1 = new Circle();
        shape.area();
        circle.area();
        circle1.area();
        square.area();
    }

}
