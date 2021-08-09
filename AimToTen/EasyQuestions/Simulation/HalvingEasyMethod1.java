public class HalvingEasy {

    public static int count(int[] S, int T){

        int half = 0;
        int count = 0;
        for(int i = 0 ; i < S.length; i++){
            half = S[i]/2;
            if(half%T != 0){
                half = half/2;
                if(half%T ==0){
                    count++;
                }
            }
            else if(S[i]<=1){
                continue;
            }
            else {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){


        int[] s = {42, 10, 10, 10, 11, 11, 20, 21, 39, 40, 42, 43, 44};
        int t = 10;
        System.out.println(count(s,t));

    }

}
