public class LittleElephantAndPermutationDiv2 {

    public static void main(String[] args) {
        int valperm = 1;
        int valpair = 1;
        System.out.println(getNumber(valperm, valpair));

    }

    public static long getNumber(int N, int K){
        String comb = "" + N + K;
        LittleElephantAndPermutationDiv2 permutation = new LittleElephantAndPermutationDiv2();
        permutation.perm(comb,0,comb.length()-1);
        long val = 0;
        if(N == K){
            val = 1;
        }
        return val;
    }
    public String swap(String a, int i, int j){

        char temp_char;
        char[] tempArr = a.toCharArray();
        temp_char = tempArr[i];
        tempArr[i] = tempArr[j];
        tempArr[j] = temp_char;

        return String.valueOf(tempArr);
    }

    private void perm(String a, int b, int c){
        if( b != c){
            for(int i = b; i <= c; i++){
                a = swap(a,b,i);
                perm(a,b+1, c);
                a = swap(a,b,i);
            }
        }
    }

}
