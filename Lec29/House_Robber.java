package Lec29;

import java.util.*;

public class House_Robber {

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 3, 1};
        int dp[] = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        System.out.println(Robber(arr, 0, dp));
        System.out.println(Robber2(arr, arr.length - 1, dp));
    }

    public static int Robber(int[] arr, int i, int[] dp) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + Robber(arr, i + 2, dp);
        int dont_rob = Robber(arr, i + 1, dp);
        return dp[i] = Math.max(rob, dont_rob);
    }

    // from back means fillign dp from fornt iska reverse pahle wala
    public static int Robber2(int[] arr, int i, int[] dp) {
        if (i < arr.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + Robber(arr, i - 2, dp);
        int dont_rob = Robber(arr, i - 1, dp);
        return dp[i] = Math.max(rob, dont_rob);
    }

    // bottom up
    public static int RobberBU(int[] arr) {
        if(arr.length==1) return  arr[0];
        if(arr.length==2) return Math.max(arr[0],arr[1]);
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[dp.length - 1];
    }

}
