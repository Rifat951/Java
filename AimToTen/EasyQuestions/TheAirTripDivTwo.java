
public class TheAirTripDivTwo {
    public static int find(int[] flights, int fuel)
    {
        int len=flights.length;
        int i,k=0;
        int count=0;
        for(i=0;i<len;i++)
        {
            if(fuel>=flights[i])
            {
                fuel-=flights[i];
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args){

        int[] arr ={1, 2, 3, 4, 5, 6, 7};
        int fuel = 10;

        System.out.println(find(arr,fuel));
    }

}
