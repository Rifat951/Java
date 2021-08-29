public class TestRecursion{


    public static void main(String[] args){

        int numb = 0;
        int sum = 0;
        int len = 5;
        System.out.println(recursion(numb,sum,len));
    }


    public static int recursion(int number, int total, int len){
        //base condition
        if(len < number){
            return total;
        }
        else {
            return recursion(number+1,total+number,len);
        }
    }
}
