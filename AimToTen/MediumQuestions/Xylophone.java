import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Xylophone {

    public static int countKeys(int[] keys){

        HashMap <Integer,Character> details = new HashMap<Integer,Character>();
        int k =1;
        for(int i = 1; i<=50; i++){
            details.put(i,(char)(64+k));
            k++;
            if(k ==8){
                k =1;
            }
        }
        StringBuilder strb = new StringBuilder();
        for(int i = 0 ; i < keys.length; i++){
            // System.out.println(details.get(arr[i]));
            strb.append(details.get(keys[i]));
        }
        
        // this was used for removing the duplicate values
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i=0;i<strb.length();i++){
            set.add(strb.charAt(i));
        }
        int count =0;
        // take the count of remaining values
        for(Character ch : set) {
        //    System.out.print(ch);
            count++;
        }
        return  count;
    }


    public static void main(String[] args){

        int[] arr = {1,8,3};
        System.out.println(countKeys(arr));

    }
}
