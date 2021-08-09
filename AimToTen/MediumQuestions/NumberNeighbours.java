
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Integer.*;

public class NumberNeighbours {

    public static int numPairs(int[] numbers){

        int count = 0;
        for(int i = 0 ; i < numbers.length; i++){
            for (int j = i+1; j < numbers.length; j++){
              char[] a = Integer.toString(numbers[i]).toCharArray();
              char[] b = Integer.toString(numbers[j]).toCharArray();
              sort(a);
              sort(b);
              if(parseInt(new String(a)) == parseInt(new String(b))){
                  count++;
              }
            }
        }
        return count;
    }

    public static void main(String[] args){

        int[] arr = {10, 1, 100, 20, 2, 3};
        System.out.print(numPairs(arr));
    }
}
