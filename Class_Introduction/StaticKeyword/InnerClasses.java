package Class_Introduction.StaticKeyword;
//Outside classes(outside main) the classes cannot be static
 public class InnerClasses {
    //Only inner classes can be static
    //Test class is dependent on InnerClasses class
    static class  Test{ //now the Test class is not dependent on the objects of Innerclass
         //It is static:Not dependent on the objects of the inner class
        //internally it can have objects of it's own
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
        //main and Test can have instances of each other
    }


    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("kartik");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
    }

}
