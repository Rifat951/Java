import java.util.Arrays;

public class NumberofFiboCalls {

    public static int[] fiboCallsMade(int n){

        int[] one = new int[11];
        int[] zero = new int[11];
        one[1] = 1;
        zero[0] = 1;
        for (int i = 2; i <= 10; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
            System.out.println(zero[i]);
            one[i] = one[i - 1] + one[i - 2];
            System.out.println();
            System.out.println(one[i]);
        }
        System.out.println(zero[n]);
        System.out.println(one[n]);
        return new int[]{zero[n], one[n]};

    }


    public static void main(String[] args){
        System.out.println(Arrays.toString(fiboCallsMade(3)));
    }


}
