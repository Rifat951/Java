public class FunnyFence {

    public static void getLength(String s){

        // traverse the characters not the whole string
        // * conv string to char (bad idea) then you cannot assign
        int tracker = 1;
        int new_tracker = 0;
        for( int i = 1; i <= s.length(); i++) {
            if(i < s.length() && s.charAt(i) != s.charAt(i - 1)) {
                tracker++;
            }
            else {
                tracker--;
            }
            new_tracker = Math.max(tracker,new_tracker);
        }
        System.out.print(new_tracker);

    }



    public static void main(String[] args){
        String str = "|-||-";
        getLength(str);
    }

}
