package Lec30;

public class knapsack01 {

    public static void main(String[] args) {
        int[] wt={1,2,3,2,2};
        int [] value={8,4,0,5,3};
        int cap=4;
        int[][] dp=new int[wt.length][value.length+1];
    }

    public static int knapsack(int[] wt, int[] value, int cap, int i) {
        if (cap == 0 || i == wt.length) {
            return 0;
        }
        int inc = 0, exc = 0;
        if (cap >= wt[i]) {
            inc = value[i] + knapsack(wt, value, cap - wt[i], i + 1);
        }
        exc = knapsack(wt, value, cap, i + 1);
        return Math.max(inc, exc);
    }
}
