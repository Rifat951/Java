
import java.util.*;

    public class InterestingDigits {

        public static int[] digits(int base){

            int[] rays = new int[1000];
            int n= 0;
            int i;
            for(i = 2; i <base;i++){
                if(base% i ==1){
                    rays[n++]= i;
                }
            }
            int[] r = new int[n] ;
            for (i=0; i<n; i++) {
                r[i] = rays[i];
                System.out.print(Arrays.toString(r));
            }
            return r;
        }

        public static void main(String[] args){

            int num = 10;
            digits(num);
            //System.out.println(num);
        }
    }
