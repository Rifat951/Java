import java.util.Arrays;

public class testCdgame {


    public static int rescount(int[] a, int[] b){
        int prev_swap = 0;
        int prev_swap1 = 0;
        int sum_1 = 1;
        int sum_lastinit = 1;
        int temp_a;
        int post_swap_a = 0;
        int post_swap_b = 0;
        int sum_2 = 1;
        int count = 0;
        int sum_3 = 0;

        for(int i = a.length; i > 0; i--){
            prev_swap1 = a[i-1] + b[i-1];
            sum_1 = sum_1 * prev_swap1;
        }
        for(int i = 0; i < a.length; i++){
            prev_swap = a[i] + b[i];
            sum_2 = sum_2 * prev_swap;
        }
        if(sum_1 != sum_2){
            count++;
        }
        else{
            count = 1;
        }

        for (int swapindex = 0 ; swapindex < a.length-1; swapindex++){
            temp_a = a[swapindex];
            a[swapindex] = b[swapindex];
            b[swapindex] = temp_a;

        }

        for (int traverse = 0; traverse < a.length; traverse++) {

            post_swap_a += a[traverse];
            post_swap_b += b[traverse];
            sum_3 = post_swap_a * post_swap_b;
        }
        if (sum_3 != sum_1 && sum_3 != sum_2) {
            count++;
        }
        else {
            count = 1;
        }
        for(int i = 0; i < a.length; i ++){
            if(i<a.length-1){
                if(a[i] == a[i+1]) {
                    count = 1;
                }
            }
            else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        System.out.println(rescount(arr1,arr2));
    }
}
