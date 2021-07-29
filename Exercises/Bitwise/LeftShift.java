import java.util.Scanner;

class LeftShift{
    
    public static void main(String[] args){
        
        
        int FirstNum, Result;
        
        Scanner inp_num = new Scanner(System.in);
        System.out.print("Input Number : ");
        FirstNum = inp_num.nextInt();
        inp_num.close();
        
        Result = FirstNum << 2; 
        // here 2 means we want to shift 2 digits to the left side. Meaning it will add two extra 0 on the right side
        
        System.out.println("Result of Left shift " + Result);
    }
}
