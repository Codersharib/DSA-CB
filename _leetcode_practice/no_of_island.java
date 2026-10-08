package _leetcode_practice;

import java.util.*;

public class no_of_island {

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid));
    }

    public static  int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean visited[][] = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    BFT(grid, visited, i, j);
                }
            }
        }
        return count;
    }

    static class IslandPair {

        int row, col;

        public IslandPair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void BFT(char[][] grid, boolean[][] visited, int si, int sj) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<IslandPair> q = new LinkedList<>();
        int[] drow = {1, -1, 0, 0};
        int[] dcol = {0, 0, 1, -1};
        q.add(new IslandPair(si, sj));
        while (!q.isEmpty()) {
            // 1 remove
            IslandPair rp = q.poll();
            // 2 ignore if already visited
            // if (visited.contains(r)) {
            //     continue;
            // }
            // 3 mark visited
            // visited[rp.row][rp.col] = true;
            // 4 self work
            // 5 add unvisited nbrs
            for (int i = 0; i < 4; i++) {
                int r = rp.row + drow[i];
                int c = rp.col + dcol[i];
                if (r >= 0 && r < n && c >= 0 && c < m && visited[r][c] == false && grid[r][c] == '1') {
                    visited[r][c] = true;
                    q.add(new IslandPair(r, c));
                }
            }
        }
    }
}
