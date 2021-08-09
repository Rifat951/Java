public class WritingWords {
  
    public static int write(String word){
      
        char[] array = word.toCharArray();
        int len = word.length();
        int sum = 0;
        for (int i : array){
            sum = sum + i;
        }
        int res = sum - (64*len);
        return  res;
    }

    public static void main(String[] args){
        String str = "ABC";
        System.out.println(write(str));
    }
}
