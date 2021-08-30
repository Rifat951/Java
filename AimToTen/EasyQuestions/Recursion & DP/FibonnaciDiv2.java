public class FibonacciDiv2 {

    public static int find(int N){

        int a = 0, b = 1;
        while (b < N) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return Math.min(N - a, b - N);
    }



    public static void main(String[] args){

        System.out.println(find(19));
    }

}
