public class Pricing {

    public static void main(String[] args){

        int[] arr = {17,50,2};
        System.out.println(maxSales(arr));

    }
    public static int maxSales(int[] price){
        int count;
        int sum = 0;
        for(int i =0 ; i < price.length ; i++){
            count =1;
            sum = sum + (count*price[i]);
            if(price[i] == 1 || price[i] == 9){
                sum = sum -1;
            }
        }
        return  sum;
    }

}
