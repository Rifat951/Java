import java.awt.*;

public class FoxAndWord {


    public static int howManyPairs(String[] words) {

        int count = 0;
        String firsthalf = new String();
        String secondhalf = new String();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                //  System.out.println(words[j]);
                if (words[i].length() == words[j].length()) {
                    for (int new_index = 1; new_index < words[j].length(); new_index++) {
                        firsthalf = words[j].substring(0, new_index);
                        secondhalf = words[j].substring(new_index);
                        if ((secondhalf + firsthalf).equals(words[i])) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"tokyo", "kyoto"};
        System.out.print(howManyPairs(arr));

    }
}
