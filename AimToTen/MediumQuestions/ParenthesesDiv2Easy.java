public class ParenthesesDiv2Easy {

    public static void main(String[] args){
        String str = "(())()";
        System.out.println(getDepth(str));
    }
    public static int getDepth(String s){
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                count--;
            } else {
                count++;
            }
            max = Math.max(Math.abs(count), max);
        }
       return  max;
    }
}
