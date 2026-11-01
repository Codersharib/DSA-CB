package Days45.Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class ratChasesItsCheese {

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
        rat(grid, visited, 0, 0);
        if(value==0){
            System.out.println("NO PATH FOUND");
        }
    }

    static int value=0;
    public static void rat(char[][] grid, int[][] visited, int cr, int cc) {
        if (cr < 0 || cc < 0 || cr >= grid.length || cc >= grid[0].length || grid[cr][cc] == 'X') {
            return;
        }
        if (cr == grid.length - 1 && cc == grid[0].length - 1) {
            visited[cr][cc]=1;
            for (int[] is : visited) {
                System.out.println(Arrays.toString(is));
            }
            value=1;
            return;
        }

        int[] dr = {0, -1, 0, 1};
        int[] dc = {1, 0, -1, 0};

        grid[cr][cc] = 'X';
        visited[cr][cc] = 1;

        for (int i = 0; i < dc.length; i++) {
            int nr=cr + dr[i];
            int nc=cc + dc[i];
            rat(grid, visited, nr, nc);
        }
        visited[cr][cc] = 0;
        grid[cr][cc] = 'O';
    }
}
