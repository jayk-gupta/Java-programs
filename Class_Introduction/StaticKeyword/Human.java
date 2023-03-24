package Class_Introduction.StaticKeyword;

public class Human {
        int age;
        String name;
        int salary;
        boolean married;
        //Property that are common to all the objects of the class
        static long population;
        static void message(){
            System.out.println("HEllO everyone");
        }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
        Human.message();
    }
}

