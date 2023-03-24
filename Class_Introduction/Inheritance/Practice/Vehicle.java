package Class_Introduction.Inheritance.Practice;

public class Vehicle {
   protected  int wheel;
    String color;
    String company;
    int passenger;
     //Constructor
    Vehicle(int wheel,String color,String company,int passenger){
        this.wheel=wheel;
        this.color=color;
        this.company=company;
        this.passenger =passenger;
    }
    Vehicle(int wheel,String color,String company){
        this.wheel=wheel;
        this.color=color;
        this.company=company;
    }
    Vehicle(int wheel,String color){
        this.wheel=wheel;
        this.color =color;
    }

    public Vehicle(int wheel) {
        this.wheel = wheel;
    }
}
