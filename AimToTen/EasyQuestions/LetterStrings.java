
import java.util.Arrays;

public class testidr_1 {


    public static int sum(String[] s){
        String str = convertObjectArrayToString(s);
        int count =0;
        for (int i = 0;i < str.length(); i++){
            //  System.out.print(str.charAt(i));
            if(Character.isAlphabetic(str.charAt(i))){
                count ++;
            }
            else {
                continue;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String[] arr = {"--A","AAa--"};
        System.out.println(sum(arr));

    }
    private static String convertObjectArrayToString(Object[] arr) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : arr)
            sb.append(obj.toString()).append(",");
        return sb.substring(0, sb.length() - 1);

    }

}
