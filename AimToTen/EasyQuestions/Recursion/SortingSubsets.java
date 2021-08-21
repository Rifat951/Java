import java.util.Arrays;

class SortingSubsets {
    public static int count =0;
    public static int index =0;
    public static int rec(int[] a){

        int[] b = a.clone();
        //  System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        // System.out.println(Arrays.toString(b));
        if(index< a.length){
            if(a[index] != b[index]){
                count++;
            }
            else if(a[index] == b[index]) {
                count = count + 0;
            }
            index++;
        }
        else {
            System.exit(1);
        }

        System.out.println(count);
        rec(a);
        return count;
        //       System.out.println(index);

    }
    public static void main(String[] args){

        int[] arr = {4,4,4,3,3,3};
        rec(arr);
    }
}
