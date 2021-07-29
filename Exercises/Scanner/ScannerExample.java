import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    	
    System.out.print("Enter new number : ");
    //scanner object creation
    Scanner input = new Scanner(System.in);
    
    //take user input
    int number = input.nextInt();
    
    System.out.print("Number : " + number);
    
    input.close();//close the input
  }
}
