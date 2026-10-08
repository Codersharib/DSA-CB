package Assignment6;

import java.util.Scanner;

public class suduko_solver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[9][9];
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        boolean res=suduko(arr, 0, 0);
        if(res==true){
            display(arr);
        }
    }
    public static boolean suduko(int[][] grid,int cr,int cc){
        if(cc==9){
            cr++;
            cc=0;
        }
        if(cr==9) return true;
        if(grid[cr][cc]!=0){
            return suduko(grid, cr, cc+1);
        }
        else{
            for (int i = 1; i <= 9; i++) {
                if(isPossible(grid,cr,cc,i)){
                    grid[cr][cc]=i;
                    boolean solve=suduko(grid, cr, cc);
                    if(solve==true){
                        return true;
                    }
                    grid[cr][cc]=0;
                }
            }
        }
        return false;
    }
    public static boolean isPossible(int[][] grid,int cr,int cc,int i){
        // horizontal line me
        for(int k=0;k<grid[0].length;k++) {
            if(grid[cr][k]==i) return false;
        }
        // vertical line me
        for(int k=0;k<grid.length;k++) {
            if(grid[k][cc]==i) return false;
        }
        // square 3*3 me
        int r=cr-cr%3;
        int c=cc-cc%3;
        for(int j=r;j<r+3;j++) {
            for(int k=c;k<c+3;k++) {
                if(grid[j][k]==i) return false;
            }
        }
        return true;
    }
    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
