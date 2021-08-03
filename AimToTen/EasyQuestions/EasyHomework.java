public class EasyHomework {

    public static void main(String[] args){

        int[] x = {-2,3,-6};
        System.out.print(determineSign(x));
        
    }
    
     public static String determineSign(int[] A){

        int sum = 1;
        for(int i = 0; i<A.length;i++){
            //System.out.println(A[i]);
            sum *= A[i];
        }
        if(sum > 0){
            return ("Positive");
        }
        else if(sum<0){
            return ("Positive");
        }
        else{
            return ("Positive");
        }
    }

}
