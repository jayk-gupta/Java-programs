package Arrays.ArrayQuestions;

public class Pattern {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);

    }
    private static void pattern1(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            //When one row is printed , we need to add a newline
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= (arr.length-1)-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     static  void pattern3(int n){
         for (int i = 0; i <=n ; i++) {
             for (int j = 0; j <=n; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }

     }
   static  void pattern4(int n){
       for (int i = 1; i <=n; i++) {
           for (int j = 1; j <=i ; j++) {
               System.out.print(j);
           }
           System.out.println();

       }


   }
   static  void pattern5(int n){
       for (int i = 1; i <=n ; i++) {
           for (int j = 1; j <=i ; j++) {
               System.out.print(i);
           }
           System.out.println();
       }
    }
    static  void pattern6(int n){
        int k=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(++k);
            }
            System.out.println();
        }
    }






















    }
