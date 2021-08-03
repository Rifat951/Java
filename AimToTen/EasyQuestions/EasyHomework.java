public class EasyHomework {

    public static void main(String[] args){

        int[] x = {-2,3,-6};
        int sum = 1;
        for(int i = 0; i<x.length;i++){
            System.out.println(x[i]);
            sum *= x[i];
        }
        if(sum > 0){
            System.out.println("Positive");
        }
        else if(sum<0){
            System.out.println("Negative");
        }
        else{
            System.out.println(("Zero"));
        }

    }

}
