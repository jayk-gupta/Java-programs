package Class_Introduction.StaticKeyword;

public class Main {
    public static void main(String[] args) {
        Human jay = new Human(20,"Jay Gupta",60000,false);
        Human Janhvi = new Human(19,"Janhvi Sao",80000,false);
        Human Ritika = new Human(19,"Ritika",90000,false);
//        System.out.println(jay.population);
//        System.out.println(Janhvi.population);
//        System.out.println(Ritika.population);
        System.out.println(Human.population);
//        greeting();
        fun();
    }
    //	Static method can only access static data, it cannot access non-static data.
    //	We know that something which is not static belongs to the object
    //This is dependent on the object
    //This belongs to an instance
    void greeting(){
        System.out.println("hello"); //this method is going to have an instance and main method is not going to have an instance.

    }
    //This is not dependent on object
    //Without specifying which instance it(greeting)belongs to we cannot use it over fun method
    static  void fun(){

//        greeting(); // You can't use it here because it requires an instance
        //But the function you are using  it does not require an object

        //You cannot access non-static stuff without referencing their instances
        // in a static context
        //Here I am referencing it
        Main obj = new Main();
        //Declaring the reference variable to object of type Main = initializing (allocating memory to object)
        obj.greeting();
    }
}
