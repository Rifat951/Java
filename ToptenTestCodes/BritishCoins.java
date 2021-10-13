
import  java.util.Arrays;

public class BritishCoins {

        public static int[] coins(int pence){
            //MOST INEFFICIENT WAY

            int penny =12;
            int shilling = 20;

            // convert to pound
            int pound = pence/(penny * shilling);

            // remaining pennies
            int rem_val = pence%(penny * shilling);

            //convert to shilling
            int rem_shilling = rem_val/penny;

            // display remaining pennies
            int rem_penny = rem_val%penny;

            //basically we got our answer here now we want to return the array part

            //concat the string and turn them into array, then return
            String str1 = Integer.toString(pound);
            String str2 = Integer.toString(rem_shilling);
            String str3 = Integer.toString(rem_penny);

            String concat = str1 + str2 + str3;

            // 2, 4, 5 --> 245
            //  System.out.println(concat);

            // covert this string to array
            // this has issues because it takes individual character and seperates them at the end
//            int[] output = new int[concat.length()];
//            for(int firstIndex = 0; firstIndex < concat.length(); firstIndex++){
//                // we want to add each of the character of the string into this int[]
//                output[firstIndex] = Integer.parseInt(String.valueOf(concat.charAt(firstIndex)));
//            }

            return new int[]{pound,rem_shilling,rem_penny};
        }

        public static void main(String[] args){
            int pence = 533;
            System.out.print(Arrays.toString(coins(pence)));

        }
}
