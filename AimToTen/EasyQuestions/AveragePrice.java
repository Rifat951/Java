import java.util.Arrays;

public class AveragePrice {

    public static double nonDuplicatedAverage(int[] prices){

        int n = prices.length;
        double sum = 0;
        int count = 0;
        //Comparing each element with all other elements
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(prices[i] == prices[j]) {
                    prices[j] = prices[n-1];
                    n--;
                    j--;
                }
            }
        }
        int[] array1 = Arrays.copyOf(prices, n);
        //Printing arrayWithoutDuplicates
        for (int i = 0; i < array1.length; i++) {
            count ++;
           sum = sum + array1[i];
        }
        double avg = sum / (double)count;
        return avg;
    }


    public static void main (String[] args) {

        int[] arr = {10,20,10};
        System.out.println(nonDuplicatedAverage(arr));
    }

}
