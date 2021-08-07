import java.util.Arrays;

public class DivDigits {


    public static void main(String[] args){

        int a = 661232;
        String str = Integer.toString(a);
        String cpy = new String();
        for (int i = 0 ; i < str.length();i++){
            for (int j = i ; j<=i;j++){
                cpy = cpy.concat(String.valueOf(str.charAt(j)));
            }
        }
        String[] str_arr = cpy.split("");

        int[] int_arr = new int [str_arr.length];
        for(int i=0; i<str_arr.length; i++) {
            int_arr[i] = Integer.parseInt(str_arr[i]);
        }

        int count =0;
        for ( int i =0; i<int_arr.length;i++){
            if(a%int_arr[i]==0){
                count++;
            }
            else {
                continue;
            }
        }
        System.out.print(count);
    }
}
