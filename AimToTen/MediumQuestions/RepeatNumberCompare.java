public class RepeatNumberCompare {

    public static String compare(int x1, int k1, int x2, int k2) {
        String str = String.valueOf(x1);
        String str2 = String.valueOf(x2);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < k1; i++) {
            sb1.append(str);
        }

        for (int i = 0; i < k2; i++) {
            sb2.append(str2);
        }
//        if (sb1.length() == sb2.length()) {
//            return "equal";
//        }
        if(sb1.length() > sb2.length()){
            return "Greater";
        }
        else if(sb1.length() < sb2.length()){
            return  "Less";
        }
        return "Equal";
     }


    public static void main(String[] args){

        int num_a = 1010111;
        int iterator_a = 3;
        int num_b = 101010;
        int iterator_b = 2;
        System.out.println(compare(num_a,iterator_a,num_b,iterator_b));
    }
}
