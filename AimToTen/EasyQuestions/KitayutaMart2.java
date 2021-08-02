public class KitayutaMart2 {


    public static void main(String[] args)
    {
            int input = 300;
            int k = 100;
            int temp =0;
            int var=0;
            int sum =0;
            int new_sum1 = 0;
            int new_sum2 = 0;
            int v = 0;
            int tracker = 0;
            for(int i =1 ; i <= (input/k); i++) {
                if(i<=1) {
                    var = k * i;
                    new_sum1 = var;
                }
                else if(1<i && i< (input/k)){
                    temp = 2*k*(i-1);
                    new_sum2 += temp;
                    tracker++;
                }
                if (i==(input/k)- tracker){
                    break;
                }
                v = i;
            }
            System.out.println(v);
    }
}
