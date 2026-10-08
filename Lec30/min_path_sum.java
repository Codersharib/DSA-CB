package Lec30;
import java.util.*;
public class min_path_sum {

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] dp=new int[grid.length][grid[0].length];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println(min_path(grid, 0, 0, dp));
    }

    public static int min_path(int[][] grid, int i, int j,int[][] dp) {
        if (i == grid.length - 1 && j == grid[0].length-1) {
            return grid[i][j];
        }
        if (i >= grid.length || j >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if(dp[i][j] !=-1) return dp[i][j];
        int right = min_path(grid, i, j + 1,dp);
        int down = min_path(grid, i + 1, j,dp);
        return dp[i][j]=Math.min(down, right) + grid[i][j];
    }
}
