
import java.util.ArrayList;
import java.lang.Math;

public class RedundantStrings {

    // hard question for me

    public static int howMany(int length){
        if(length == 1) {
           return 0;
        }
        int dividor = length/2;
        ArrayList<Integer> storeval =  new ArrayList<Integer>();

        // lets write our for loop since we are failing at while...
        // cut the number(length) and put it in arraylist
        int index = 2;
        while(index <= dividor){
            // this is where the problem was
            if(length % index == 0){
                storeval.add(index);
              //  System.out.println(storeval);
            }
            index++;
        }
        // store the size of arraylist into the array
        // store the power of storeval into arr

        int[] arr = new int[storeval.size()];

        for(int outerloop = 0; outerloop < storeval.size(); outerloop++) {
            //typecase double to int
            //(2 ^ num )-2
            arr[outerloop] = (int) Math.pow(2, storeval.get(outerloop))-2;
         //   System.out.println(arr[indexn]);
            for (int innerloop = 0; innerloop < outerloop; innerloop++) {
                if (storeval.get(outerloop) % storeval.get(innerloop) == 0) {
                    arr[outerloop] = arr[outerloop] - arr[innerloop];
                  //  System.out.println(arr[indexn]);
                }
            }
        }
        int add = 2;
        // now here is the issue.... it cannot iterate 10
        for(int iterator = 0; iterator < arr.length; iterator++){
            // 2 + 2... to the arr_val
            add = add + arr[iterator];
            //System.out.println("test1"+arr[iterator]);
            //System.out.println("test2"+add);
        }
        return add;

    }



    public static void main(String[] args){

        int len = 2;
        System.out.println(howMany(len));
    }


}
