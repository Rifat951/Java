public class PrimeSoccer {
    public static double getProbability(int skillOfTeamA, int skillOfTeamB) {
        int[] primes = {2, 3, 5, 7, 11,13,17};
        int[] combination = {3060 ,816, 3060, 18564, 18564, 18564, 18564,};

        double sA = skillOfTeamA / 100.0;
        double sB = skillOfTeamB / 100.0;

        double probA = 0;
        double probB = 0;

        for (int i = 0; i < primes.length; i++) {
            System.out.println(combination[i]);
            probA += Math.pow(sA, primes[i]) * Math.pow((1.0 - sA), (18 - primes[i])) * combination[i];
            System.out.println(probA);
            probB += Math.pow(sB, primes[i]) * Math.pow((1.0 - sB), (18 - primes[i])) * combination[i];
            System.out.println(probB);
        }

        probA = 1.0 - probA;
        System.out.println(probA);
        probB = 1.0 - probB;
        System.out.println(probB);

        double test = 1.0 - (probA * probB);
        System.out.println(probA * probB);
        System.out.println("hehe"+test);
        return 1.0 - (probA * probB);

    }



    public static void main(String[] args){

        System.out.println(getProbability(50,50));
    }
}
