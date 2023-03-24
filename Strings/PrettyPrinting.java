package Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 12.3452f;
        int i =2;
        System.out.printf("formatted number is %.2f ",a); //rounds off to two decimal value also
        System.out.printf("PI: %.3f",Math.PI);
        //placeholders
        System.out.printf("My name is %s and I am learning %s","jay","java");
        System.out.printf("%d",i);
    }
}
