public class RemovingParenthesis {


    public static int countWays(String s){
        int count = 0;
        int index = 0;
        // mul cannot be 0
        int mul = 1;
        while(index<s.length()){
            if(s.charAt(index) == '(' ){
                count++;
                mul = mul * count;
                //                count = 4
//                mul = 4 * 6 -- > 24
            }
            else {
                // mul = mul * count;
                count--;
            }
            index++;
        }
        return mul;
    }


    public static void main(String[] args){

        String str = "((()()()))";
        System.out.println(countWays(str));
    }

}
