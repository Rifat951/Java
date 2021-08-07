public class FunnyFenceMethod2 {


    public static void getLength(String s){

        // traverse all the substring
        //check its funny fence
        //record the longest substring if valid

        int finallen = 0;
        for(int startIndex = 0; startIndex < s.length(); startIndex++){
            for(int endIndex = startIndex ; endIndex< s.length(); endIndex++){
                if(isFunnyfence(s,startIndex,endIndex)){
                    int currlen = endIndex - startIndex + 1;
                    if (currlen > finallen){
                        finallen = currlen;
                    }
                }
            }
        }

    }

    public static boolean isFunnyfence(String s, int startindex, int endindex){
        for ( int i = startindex; i < endindex ; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String a = "|-|";
        getLength(a);
    }

}
