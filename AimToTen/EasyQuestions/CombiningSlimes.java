import java.util.Arrays;

public class Main {

    public static int maxMascots(int[] a) {

        int sum = 0, new_sum =0, old_mul = 0, new_mul = 0;
        for (int i =0; i<a.length-1;i=i+2){
            if(i!=a.length-1) {
                sum = a[i] + a[i + 1];
                old_mul = a[i] * a[i + 1];
                if(a.length<=2){
                sum = a[i] + a[i + 1];
                old_mul = a[i] * a[i + 1];
                break;
                }
                else {
                    new_sum = sum + a[a.length-1];
                    new_mul = sum * a[a.length-1];
                    old_mul = old_mul + new_mul;
                }
            }
        }
        return old_mul;
    }

    public static void main(String[] args) {

        int[] a = {2,3,1};
        int first,second;
        System.out.println(maxMascots(a));


    }
}
