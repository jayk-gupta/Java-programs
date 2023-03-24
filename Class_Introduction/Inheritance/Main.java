package Class_Introduction.Inheritance;

public class Main {
    public static void main(String[] args) {
          Box box = new Box();
        System.out.println(box.h+" "+box.w+" "+box.l);
        Box box1 = new Box(5);
        System.out.println(box1.h+" "+box1.w+" "+box1.l);
        Box box3 = new Box(4.2,5,7);
        System.out.println(box3.h+" "+box3.w+" "+box3.l);
        Box box4 = new Box(box3);
        System.out.println(box4.h+" "+box4.w+" "+box4.l);

        BoxWeight box5 = new BoxWeight(12,5,4,40);
        System.out.println(box5.h+" "+box5.weight+" "+box5.w);

        Box box6 = new BoxWeight(11,4,5,60); //Cannot do this
//        System.out.println(box6.weight);
        //Parent does not know what variables are below but the child class knows what variables are there in parent class
         Box box7 = new BoxWeight();

         box7.greeting();

    }
}
