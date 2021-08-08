import java.util.Arrays;

public class BallotCounting {



    public static int count(String votes){
        int count_a = 0;
        int count_b = 0;
        for(int i = votes.length(); i > 0 ; i--){
            if(votes.length()>0){
                if(votes.charAt(i-1) == 'A' && count_a != votes.length()){
                    votes = votes.replaceFirst("A", "");
                    count_a++;
                }
                else if (votes.charAt(i-1)=='B'&& count_b != votes.length()){
                    votes = votes.replaceFirst("B", "");
                    count_b++;
                }
            }
        }
        if(count_a == count_b){
            return (count_a+count_b);
        }
        else {
            return  (Math.max((count_a+1),(count_b+1)));
        }
    }

    public static void main(String[] args){

        String str = "AAAAABBBBB";
        System.out.println(count(str));

    }
}
