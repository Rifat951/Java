public class ShorterSuperSum {


    public static int calculate(int k, int n){
        //base case'
       int sum  = 0;
       if(k<=0){
           return n;
       }
       else{
           for(int i = 0; i <= n ; i++){
               sum = sum + calculate(k-1,i);
           }

       }
       return sum;


    }

    public static void main(String[] args){
        int a = 2;
        int b = 3;
        System.out.println(calculate(a,b));

//        for(int i = 1 ;i <= 3 ; i++){
//                sum = sum + i;
//                val = val + sum;
//        }
//        System.out.println(val);

    }
}
//3+3 ---> 2 +6 --> 1 + 8 --- 9
