
import java.util.Arrays;

public class CostOfDancing {
    
    public static int minimum(int K, int[] danceCost){

        //lets sort
        Arrays.sort(danceCost);
      //  System.out.println(Arrays.toString(danceCost));

        int sum =0;
        // it will correspond to the first few items
        // put it in a sum
        for(int init = 0; init< K; init++){
            sum += danceCost[init];
          // System.out.println(sum);
        }
        return sum;
    }


    public static void main(String[] args){

            int num = 2;
            int[] cost = {1,5,3,4};
            System.out.println(minimum(2,cost));

    }
}
