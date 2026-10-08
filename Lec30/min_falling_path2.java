package Lec30;

public class min_falling_path2 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int ans = Integer.MAX_VALUE;
        Integer[][] dp = new Integer[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans, min_fallingPath(matrix, 0, i, dp));
        }
        System.out.println(ans);
    }

    public static int min_fallingPath(int[][] matrix, int cr, int cc, Integer[][] dp) {
        if(cr==matrix.length-1) return matrix[cr][cc];
        if (dp[cr][cc] != null) {
            return dp[cr][cc];
        }
        int ans=Integer.MAX_VALUE;
        for (int col = 0; col < matrix[0].length; col++) {
            if(col!=cc){
                ans=Math.min(ans,min_fallingPath(matrix, cr+1, col, dp));
            }
        }
        return dp[cr][cc]=ans+matrix[cr][cc];
    }
}
