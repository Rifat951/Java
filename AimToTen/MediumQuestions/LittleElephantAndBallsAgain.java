import java.util.Stack;

public class LittleElephantAndBallsAgain {

     public static void main(String[] args) {
        String str = "RGBRGB";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            for (int j = 0 ; j <= i ; j++){
                str = str.substring(i,str.length()-i);
               // System.out.println(str);
                if(str.length()/2>j){
                    if(str.charAt(i) == str.charAt(i+1)){
                        System.out.println("i"+str.charAt(i));
                    }
                    else {
                        count+=2;
                    }
                }
                else if(str.length()==2) {
                    str = str.substring(i,str.length()-i);
                    count ++;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
