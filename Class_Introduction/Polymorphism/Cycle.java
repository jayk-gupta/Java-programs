package Class_Introduction.Polymorphism;

import Class_Introduction.Inheritance.Practice.Vehicle;

public class Cycle extends Vehicle {
    String name;


    public Cycle(int wheel,String name) {
        super(wheel);
        this.name = name;
    }
}
