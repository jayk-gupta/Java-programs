package Class_Introduction.Inheritance.Practice;

import Class_Introduction.Polymorphism.Cycle;

public class Main {
    public static void main(String[] args) {

        Vehicle A = new Vehicle(4, "red");
        Car c1 = new Car(4, "white", "diesel");
        Cycle C1 =  new Cycle(2,"garfield");
        System.out.println(A.wheel+" "+A.color);
        System.out.println(c1.wheel+" "+c1.color+" "+c1.engine);

    }
}
