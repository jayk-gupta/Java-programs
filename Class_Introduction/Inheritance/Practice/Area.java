package Class_Introduction.Inheritance.Practice;

public class Area extends  Parallelogram{
    double area;
    Area(){


    }
    Area(double side){
      super(side);

    }
   public void  area(){
        area = length*length;
    }


}
