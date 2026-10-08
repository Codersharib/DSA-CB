package Lec30;

import java.util.Arrays;

public class distinct_subseq {
    public static void main(String[] args) {
        String s="rabbbit";
        String t="rabbit";
        int[][] dp=new int[s.length()][t.length()];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(coin_change(s, t, 0, 0, dp));
    }
    // s== coins index i and t== amount index j
    public static int coin_change(String s,String t,int i,int j,int[][] dp){
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int inc=0,exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=coin_change(s, t, i+1, j+1, dp);
        }
        exc=coin_change(s, t, i+1, j, dp);
        return dp[i][j]=inc+exc;
    }
}
