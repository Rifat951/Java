import java.util.Arrays;

public class CalkifWilf {


    public static int[] findRational(String path){

        int a = 1, b =1 ;
        for (int i = 0 ; i < path.length();i++){
            if(path.charAt(i) == 'L'){
                b= b+a;
            }
            else if (path.charAt(i) == 'R'){
                a=a+b;
            }
            else {
                return new int[] {a,b};
            }
        }
        return  new int[] {a,b};
    }


    public static void main(String[] args){

        String str = "LRR";
        System.out.print(Arrays.toString(findRational(str)));


    }
}
