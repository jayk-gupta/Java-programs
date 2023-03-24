package Class_Introduction.Inheritance;
//Subclass
public class BoxWeight extends  Box{
    double weight;
//    @Override
    static  void greeting(){
        System.out.println("Hey, I am in boxPrice,greetings!!!");
    }
    public BoxWeight (){
        this.weight = -1;

    }
    BoxWeight (BoxWeight other){
        super(other); //Box-weight type is passed to Box type(old Box)
        weight = other.weight;
    }
   BoxWeight(double side, double weight){
        super(side);
        this.weight=weight;
   }
    //Constructor
  //The subclass will not be able to access the variables that are private in parent class
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//Call the parent class constructor
        //used to initialize values present in parent class
//        System.out.println(this.weight);
//        System.out.println(super.weight);
        System.out.println(super.l);

        this.weight = weight;
    }
}
