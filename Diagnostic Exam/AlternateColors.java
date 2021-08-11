public class AlternateColors {


    public static String getColor(long r, long g, long b, long k){
        // it will go until k = 3;
        // mechanism would be traverse 3 digits then reset count to 1
        int i;
        String str1 = Long.toString(r);
        String str2 = Long.toString(g);
        String str3 = Long.toString(b);
        String str4 = Long.toString(k);
        String val = new String();

        String concat  = str1+str2+str3+str3;


        int[] output = new int[concat.length()];
            for(int firstIndex = 0; firstIndex < concat.length(); firstIndex++){
                // we want to add each of the character of the string into this int[]
                output[firstIndex] = Integer.parseInt(String.valueOf(concat.charAt(firstIndex)));
            }
            // traverse 1,2,3
        for( i = 0 ; i < output.length; i++){
//                System.out.println("i..."+i);
                if(output[i] == 1){
                    val = "BLUE";
                }
                else if(output[i] == 2){
                    val = "GREEN";
                }
                else {
                    val = "RED";
                }
        }

        return val;

    }


    public static void main(String[] args){

        long red = 1;
        long grn = 1;
        long blu = 1;
        long k = red+grn+blu;
        System.out.println(getColor(red,grn,blu,k));

       // getColor(red,grn,blu,k);

    }


}
