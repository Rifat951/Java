public class HalvingEasySecondMethod {

    public static int count(int[] S, int T){

       int count = 0;

       for( int i : S){
           while(i > T) {
               i >>= 1; //added right shift where it adjust binary digits to right
           }
           if(i==T){
               count++;
           }
       }
        return count;
    }


    public static void main(String[] args){


        int[] s = {6, 14, 11, 3, 1};
        int t = 3;
        System.out.println(count(s,t));

    }

}
