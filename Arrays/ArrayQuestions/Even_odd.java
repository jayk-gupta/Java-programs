package Arrays.ArrayQuestions;
import java.util.Arrays;
public class Even_odd {
    //Separating odd and even numbers from a given array
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] eve =new int[9];
        int[] odd= new int[9];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length; i++) {
              if (arr[i]%2==0){
                  eve[i]=arr[i];
                  }
              else{
                  odd[i]=arr[i];
              }
        }
        System.out.println(Arrays.toString(eve));
        System.out.println(Arrays.toString(odd));

    }
}
