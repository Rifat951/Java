package graph;

public class TreeAndVertex {

    public static int get(int[] tree) {
        int[] out = new int[tree.length+1];
        for (int i=0; i<tree.length; i++) {
            out[i+1]++;
            out[tree[i]]++;
        }

        int ans = 0;
        for (int i=0; i<out.length; i++) {
            ans = Math.max(ans, out[i]);
        }
        return ans;
    }


    public static void main(String[] args){

        int[] arr = {0,0,0};

        System.out.println(get(arr));

    }
}
