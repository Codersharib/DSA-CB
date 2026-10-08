package Lec29;

import java.util.*;

public class robber_prac {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        System.out.println(robberr(arr, 0, dp));
        System.out.println(robberBU(arr));
    }

    public static int robberr(int[] arr, int i, int[] dp) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + robberr(arr, i + 2, dp);
        int not_rob = robberr(arr, i + 1, dp);
        return dp[i] = Math.max(rob, not_rob);
    }

    // bottom up
    public static int robberBU(int[] arr) {
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
