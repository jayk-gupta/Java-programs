package Class_Introduction.StaticKeyword;

public class Smain {
    public static void main(String[] args) {

            SingletonClass obj = SingletonClass.getInstance();
            SingletonClass obj1 = SingletonClass.getInstance();
            SingletonClass obj2 = SingletonClass.getInstance();
 //All three reference variable are pointing to the same object
    }

}
