package Lec29;
import java.util.*;

public class min_cost_climbing_stair {
    public static void main(String[] args) {
        int [] cost={1,199,1,1,1,100,1,1,100,1};
        int[] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        int zero=min_cost(cost, 0,dp);
        int one=min_cost(cost, 1,dp);
        System.out.print(Math.min(zero, one));
    }
    public static int min_cost(int arr[],int i,int[] dp){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int f=min_cost(arr, i+1,dp);
        int s=min_cost(arr, i+2,dp);
        return Math.min(f, s)+arr[i];
    }
    // bottom up
    public static int min_cost(int arr[]){
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=arr[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i]=arr[i]+Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }

}
