package Days45.Backtracking;

import java.util.Scanner;

public class ratchases_its_cheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                grid[i][j] = str.charAt(j);
            }
        }
        int[][] visited = new int[n][m];
        ratChase(grid, visited, 0, 0);
        if(value==0){
            System.out.println("NO PATH FOUND");
        }
    }
    static int value=0;
    public static void ratChase(char[][] board,int[][] visited ,int cr,int cc){
        if(cr>= board.length || cc>=board[0].length || cr<0|| cc<0 || board[cr][cc]=='X'){
            return ;
        }
        if(cr==board.length-1 && cc== board[0].length-1){
            visited[cr][cc]=1;
            display(visited);
            value=1;
            return;
        }
        int[] row={0,1,0,-1};
        int[] col={1,0,-1,0};

        visited[cr][cc]=1;
        board[cr][cc]='X';
        for (int i = 0; i < 4; i++) {
            int r=cr+row[i];
            int c=cc+col[i];
            ratChase(board, visited, r, c);
        }
        board[cr][cc]='O';
        visited[cr][cc]=0;
    }
    
    public static void display(int[][] visited) {
    for (int[] row : visited) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < row.length; j++) {
            sb.append(row[j]);
            if (j < row.length - 1) sb.append(" ");
        }
        System.out.println(sb);
    }
}
}
