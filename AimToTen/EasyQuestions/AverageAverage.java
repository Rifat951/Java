public class AverageAverage {

    public static double average(int[] numList){
        int n = numList.length;
        int sum = 0;
        int count = 0;

        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            //  System.out.println();
            // Print current subset
            for (int j = 0; j < n; j++) {

                // (1<<j) is a number with jth bit 1 so when we 'and' them with the
                // subset number we get which numbers are present in the subset and which are not
                if ((i & (1 << j)) > 0) {
                 //   System.out.print(numList[j] + " ");
                    sum = sum + numList[j];
                    count++;
                }
            }
           // System.out.println();
        }
        double avg = (double) sum /count;
        return avg;
    }

    public static void main(String[] args){

        int[] arr = {3,1,4,15,9};
        System.out.println(average(arr));
    }

}
