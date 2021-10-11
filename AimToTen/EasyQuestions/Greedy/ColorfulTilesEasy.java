public class ColorfulTilesEasy {
    
    public static int theMin(String room){

        int count = 0;
        char[] inpchar = room.toCharArray();
        for(int i = 1; i < inpchar.length;i++){
            if(inpchar[i] == inpchar[i-1]){
                inpchar[i] = ' ';
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        String str = "RRRRRR";
        System.out.println(theMin(str));
    }
}
