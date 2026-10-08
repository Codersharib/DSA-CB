package _leetcode_practice;

import java.util.Scanner;

public class n_queen2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[][] board=new boolean[n][n];
        queen2(board, 0, n);
        System.out.println(count);
    }
    static int count=0;
    public static void queen2(boolean[][] board,int cr,int tq){
        if(tq==0){
            count++;
            return ;
        }
        for(int i=0;i<board.length;i++) {
            if(isvalid(board,cr,i)){
                board[cr][i]=true;
                queen2(board, cr+1, tq-1);
                board[cr][i]=false;
            }
        }
    }
    public static boolean isvalid(boolean[][] board,int row,int col){
        // up
        int r=row;
        while(r>=0){
            if(board[r][col]==true) return false;
            r--;
        }
        // left di
        r=row;
        int c=col;
        while(c>=0 && r>=0){
            if(board[r][c]==true) return false;
            r--;
            c--;
        }
        // right di
        r=row;
        c=col;
        while(c<board[0].length && r>=0){
            if(board[r][c]==true) return false;
            r--;
            c++;
        }
        return true;
    }
}
