import java.util.Scanner;

class BitwiseCompliment{
    
    public static void main(String[] args){
        
        
        int FirstNum, Result;
        
        Scanner inp_num = new Scanner(System.in);
        System.out.print("Input Number : ");
        FirstNum = inp_num.nextInt();
        inp_num.close();
        
        Result = ~FirstNum;
        // what two's compliment will do... it will add one digit to the decimal and put a  - in the front
        // for an example, N ---> -(N+1)
        
        System.out.println("Result of Bitwise Two's Compliment " + Result);
    }
}
