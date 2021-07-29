class AimtoTop {
    public static int need(int[] marks){
        int sum = 0;
        for (int i = 0; i< marks.length; i++){
            sum = sum + marks[i];
        }
        int vari = 0;
        if(marks.length==2){
            vari = vari + 2;
        }
        else{
            vari = vari+0;
        }

        double avg = sum/(marks.length+vari);
        double num = 9.5;
       if(avg <= num ){
            avg = num - avg;
            avg --;
        }
        else if (avg == num){
            avg = num - avg;
        }
        else if (avg >= num){
            avg = num - avg;
        }
        int value = (int)avg;
        System.out.print("Required Tries : ");

        return value;
    }


    public static void main(String[] args) {
        int[] marks = {10,10,10,10};
        System.out.println(need(marks));
    }
}
