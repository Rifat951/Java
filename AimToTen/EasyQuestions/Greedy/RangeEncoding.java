public class RangeEncoding {

    public static int minRanges(int[] arr){

        int count = 1;
        //it will iterate from the next one
        for(int index = 0; index+1 < arr.length; index++){
            if(arr[index] + 1 != arr[index+1]){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){

        int[] arr = {1, 6, 10, 20, 32, 49};
        System.out.println(minRanges(arr));
    }

}
