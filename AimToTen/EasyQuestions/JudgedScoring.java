
import  java.util.Arrays;

public class JudgedScoring {

    public static int overallScore(int[] scores){

        int i =0;
        int sum = 0;
        for(i = 1 ; i<scores.length-1;i++){
            sum = sum + scores[i];

        }
        return  sum;
    }


    public static void main(String[] args){

        int[] arr = {5,3,2,4};
        Arrays.sort(arr);
        System.out.print(overallScore(arr));

    }

}
