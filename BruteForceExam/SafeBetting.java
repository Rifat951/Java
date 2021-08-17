public class SafeBetting {

    public static int minRounds(int a, int b, int c){

        int count = 0;
        // b needs to go though the loop again and again
        for(int init = 0 ; init < 10 ; init++){
            // will fail when the betting amount is greater
            if(b<c){
               // b = 15 + ((20 -15 )*2)  ---- results in 25
                //b = 15 + (25 - 15)*2  ----- 35
                b = a +((b-a)*2);
                // System.out.println(bettingamount);
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args){

        int leaseamount = 15;
        int bettingamount = 20;
        int targetamount = 48;

        System.out.println(minRounds(leaseamount,bettingamount,targetamount));

    }
}
