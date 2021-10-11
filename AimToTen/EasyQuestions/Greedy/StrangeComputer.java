public class StrangeComputer {


    public static int setMemory(String mem){

        int StoreVal = '0';
        int count = 0;

        for(int index = 0; index < mem.length(); index++){
            if(mem.charAt(index) != StoreVal){
                StoreVal = mem.charAt(index);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String str = "0011";
        System.out.println(setMemory(str));
    }

}
