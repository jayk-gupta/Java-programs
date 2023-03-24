package Class_Introduction.Inheritance.Practice;

public class Parallelogram {
     double length;
     double width;
    //constructor 1
    public Parallelogram() {
        this.length = 0;
        this.width =0;
    }

    //constructor 2
    //for Square
     Parallelogram(double side){
        this.length =side;
     }

    //constructor 3
    Parallelogram(double length,double width){
        this.length=length;
        this.width=width;

    }
    //constructor 4
    Parallelogram(Parallelogram parallelogram){
        this.length=parallelogram.length;
        this.width=parallelogram.width;
    }




    //constructor 3












}
