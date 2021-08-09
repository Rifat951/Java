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


        int[] s = {6, 14, 11, 3, 1};
        int t = 3;
        System.out.println(count(s,t));

    }

}
