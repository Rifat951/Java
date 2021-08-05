
import  java.util.Arrays;

public class JudgedScoring {

    public static int overallScore(int[] scores){

        int i =0;
        int sum = 0;
        for(i = 0 ; i<scores.length;i++){
            if(scores[i] < scores.length){
                if(scores[i] < scores[i+1] && scores[i+1]<scores.length-1){
                    continue;
                }
                else {
                    sum = sum + scores[i+1];
                }
            }
            else {
                break;
            }

        }
        return  sum;
    }


    public static void main(String[] args){

        int[] arr = {5,3,2,4};
        Arrays.sort(arr);
        System.out.print(overallScore(arr));

    }

}
