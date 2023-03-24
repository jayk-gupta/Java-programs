package Class_Introduction.StaticKeyword;

public class SingletonClass {
    //Not allow them to use the constructor
    private  int num =0;
       SingletonClass(){

     }
     private static SingletonClass instance;
       public static SingletonClass getInstance(){
           //Check whether one object is created or not
           if (instance==null){
               instance = new SingletonClass();
           }
           return instance;

    }
}
