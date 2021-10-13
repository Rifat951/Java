public class WritingWords {


    public static int write(String word){

        //initialize a variable where we will assign our summary value
        int sum = 0;
        for(int firstIndex = 0 ; firstIndex < word.length(); firstIndex++){
            sum = sum + word.charAt(firstIndex);
            // sum = 0 + 90
        }
        // Z -- 90 if we substract 64 - '@' --> 26
        // total sum
        return sum - (64*(word.length()));
       // System.out.println(avg);
    }


    public static void main(String[] args){
        String str = "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";
        System.out.print(write(str));

    }
}
