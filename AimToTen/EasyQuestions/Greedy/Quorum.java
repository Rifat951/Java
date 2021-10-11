import java.util.Arrays;


public class Quorum {

    public static int count(int[] arr, int k){

        Arrays.sort(arr);
        int count= 0;
        for(int index = 0; index<k; index++){
            count = count + arr[index];
        }
        return count;

    }

    public static void main(String[] args){

        int[] arr = {5,2,3};
        int input = 1;
        System.out.println(count(arr,input));
    }
}
