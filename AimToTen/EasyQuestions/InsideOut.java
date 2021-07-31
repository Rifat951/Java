class InsideOut {

    public static String unscramble(String line){

        int mid = line.length() / 2;
        String[] parts = {line.substring(0, mid),line.substring(mid)};
        StringBuilder input1 = new StringBuilder();
        input1.append(parts[0]);
        input1.reverse();
        StringBuilder input2 = new StringBuilder();
        input2.append(parts[1]);
        input2.reverse();

        String input3 = String.valueOf(input1) + input2;
        System.out.print(input3);

        return input3;

    }
    public static void main(String[] args){

        String str= "I ENIL SIHTHSIREBBIG S";
        unscramble(str);
