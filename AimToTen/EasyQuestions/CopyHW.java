
import java.util.Arrays;
public class CopyHW {

    public static int[] copy(int[] friendHomework){


        int tracker = 0;
        for(int  i = 0 ; i < friendHomework.length; i++){
            friendHomework[i]=friendHomework[i]-1; //subs - 1 from all element
            tracker ++;
            if(i == friendHomework.length-1){
                friendHomework[i]=friendHomework[i]+tracker;
            }
        }
        return friendHomework;

    }

    public static void main(String[] args){

        int[] num = {0,0,0,0,0};
        System.out.print(Arrays.toString(copy(num)));

    }
}
