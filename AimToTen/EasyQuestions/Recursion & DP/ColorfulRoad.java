import java.util.Arrays;
import java.util.HashMap;
public class ColorfulRoad {

    public static int getMin(String road) {
        int n = road.length();
        char[] s = road.toCharArray();
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('R', 'G');
        map.put('G', 'B');
        map.put('B', 'R');
        int min = Integer.MAX_VALUE;
        int left = (int) Math.round(Math.pow(2, n - 1));
        int right = (int) Math.round(Math.pow(2, n));
        for (int i = left; i < right; i++) {
            String status = Integer.toBinaryString(i);
            if (status.charAt(status.length() - 1) == '0') {
                continue;
            }
            int cost = 0;
            int prev = 0;
            char prevC = 'R';
            boolean valid = true;
            for (int j = status.indexOf("1", 1); j < n && j > 0; j = status.indexOf("1", j + 1)) {
                if (s[j] == map.get(prevC)) {
                    cost += (j - prev) * (j - prev);
                    prevC = s[j];
                    prev = j;
                } else {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                min = Math.min(min, cost);
            }
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }



    public static void main(String[] args){
        System.out.println(getMin("RG"));


    }

}
