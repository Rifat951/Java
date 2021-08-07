import  java.util.*;

public class DiamondHunt {


    public static void main(String[] args){
        String s1 = "<<>>";
        System.out.print(countDiamonds(s1));

//        System.out.println(replaceString2);
//        String replace2 = replaceString2.replace("<>","");
//        System.out.println(replace2);

        // find <>
        // if found <> then remove
        // cotinue to remove it from curr string


    }

    public static int countDiamonds(String mine) {
        int count = 0;
        for (int i = mine.length(); mine.length() > 0; i--) {
            if(mine.contains("<>")) {
                mine = mine.replaceFirst("<>", "");
                count++;
            }
        }
        return count;
    }


}
