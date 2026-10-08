package _leetcode_practice;

public class sudoku_solver {
    public static void main(String[] args) {
        int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
                        {0, 8, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
                        {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
                        {0, 5, 0, 0, 9, 0, 6, 0, 0},
                        {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
                        {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
                        {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        print(grid, 0, 0);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean print(char[][] grid,int row,int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            return true;
        }
        if(grid[row][col]!='.'){
            return print(grid, row, col+1);
        }
        else{
            for(char i='1';i<='9';i++) {
                if(isitsafe(grid,row,col,i-'0')){
                    grid[row][col]=i;
                    boolean solver=print(grid, row, col+1);
                    if(solver){
                        return solver;
                    }
                    grid[row][col]='.';

                }
            }
        }
        return false;
    }
    public static boolean isitsafe(char[][] grid,int row,int col,int val){
        // row
        for(int i=0;i<grid.length;i++) {
            if(grid[row][i]-'0'==val) return false;
        }
        // col
        for(int i=0;i<grid.length;i++) {
            if(grid[i][col]-'0'==val) return false;
        }
        // 3*3 matrix
        int r=row-row%3;
        int c=col-col%3;
        for(int i=r;i<r+3;i++) {
            for(int j=c;j<c+3;j++) {
                if(grid[i][j]-'0'==val) return false;
            }
        }
        return true;
    }
}
