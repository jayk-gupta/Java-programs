package Arrays.ArrayQuestions;

public class MAX_MIN {
    public static void main(String[] args) {
        int[] arr = { 23,3,4,5,6,34,-6,76,49,51};
        int max=max(arr);
        int min=min(arr);
        int maxRange= MaxRange(arr,3,8);
        System.out.println("max in range "+maxRange);
        System.out.println("min is "+min);
        System.out.println("max is "+max);
    }
     //minimum value
     static int min(int [] arr) {
        int min=arr[0];
         for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }
     //maximum value
     static int max(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
              if (arr[i]>max){
                  max=arr[i];
              }
        }
          return  max;
    }
    // max in a range
    static  int MaxRange(int[] arr, int start, int end){
        int max=arr[0];
        for (int i =start; i <= end; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return  max;
    }



}
