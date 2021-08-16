public class EggCartons {

    public static void main(String[] args){
        int pack = 24;

        int val1 = 6;
        int val2 = 8;
        int result1 = pack/val1;
        int result2 = pack/val2;
//        int res3 = result1 - result2; // 1
//        int res4 = res3 + result2; //
        int min = Math.min(result2,result1);
        System.out.println(min);
    }
}
