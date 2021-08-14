import java.util.Stack;

public class LittleElephantAndBallsAgain {

    public static void main(String[] args) {
        String str = "RGBRGB";
        int count = 0;
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i<str.length();i++){
            for(int j = i  ; j <= i; j ++){
               System.out.println(str.charAt(j));
                stk.push((str.charAt(j)));
            }
        }
        for (int i = stk.size(); stk.size() > 1; i--){
            stk.pop();
            count++;
        }
        System.out.println(count);
    }
}
