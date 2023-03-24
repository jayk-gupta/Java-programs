package Class_Introduction.Inheritance.Practice;

public class Car extends Vehicle{
    String engine;
    static int passenger;

    public Car(int wheel, String color, String company, int passenger, String engine) {
        super(wheel, color, company, passenger);
        this.engine = engine;
    }
    Car(int wheel,String color,String engine){
        super(wheel, color); //this will come from vehicle
        this.engine=engine;

    }

}
//     class sedan extends   Car{
//         public sedan(int wheel, String color) {
//             super(wheel, color);
//             Car.passenger=2;
//         }
//     }