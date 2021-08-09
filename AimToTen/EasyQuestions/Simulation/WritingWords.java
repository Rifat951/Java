public class WritingWords {
  
    public static int write(String word){
      
        char[] array = word.toCharArray();
        int len = word.length();
        int sum = 0;
        for (int i : array){
            sum = sum + i;
        }
        return  sum - (64*len);
    }

    public static void main(String[] args){
        String str = "ABC";
        System.out.println(write(str));
    }
}
