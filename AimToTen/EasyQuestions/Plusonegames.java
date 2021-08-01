
import java.util.ArrayList;
import java.util.*;

class test {

    public static String getOrder(String s) {

        int tracker = 0;
        int i;
        int count = 0;
        ArrayList<Integer> penalty = new ArrayList<>();
        for (i = 0; i < s.length(); i++)
            if ((s.charAt(i) == 43)){
                tracker++;
            }
            else {
                penalty.add(s.charAt(i) - '0');
                // in the new arraylist it adds the count of digits
            }
        StringBuilder str = new StringBuilder();
            Collections.sort(penalty);
            System.out.println(penalty);
        for(i = 0 ; i < penalty.size() ; i++)
        {
            while(penalty.get(i) > count && tracker > 0)
            {
                str.append("+");
                --tracker;
                count++;
            }
            str.append(penalty.get(i));
            while(tracker > 0) {
                str.append("+");
                --tracker;
            }
        }

        return str.toString();
    }
    public static void main(String[] args) {
        String s= "++21+";
        System.out.println(getOrder(s));

    }


}
