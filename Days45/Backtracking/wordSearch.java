    package Days45.Backtracking;

    import java.util.Scanner;

    public class wordSearch {

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
            boolean found = false;
            String word = "ABCCED";
            for (int i = 0; i < n && !found; i++) {
                for (int j = 0; j < m && !found; j++) {
                    found = wordSearch(grid, word, i, j, 0, visited);
                }
            }
            System.out.println(found);
        }
        public static boolean wordSearch(char[][] board, String word, int cr, int cc, int i, int[][] visited) {
            if (i== word.length()) {
                return true;
            }
            if (cr >= board.length || cc >= board[0].length || cr < 0 || cc < 0 || visited[cr][cc] == 1 || board[cr][cc] != word.charAt(i)) {
                return false;
            }

            int[] row = {0, 1, 0, -1};
            int[] col = {1, 0, -1, 0};

            visited[cr][cc] = 1;
            boolean res=false;
            for (int j = 0; j < col.length; j++) {
                int r = cr + row[j];
                int c = cc + col[j];
                if(wordSearch(board, word, r, c, i+1, visited)){
                    res=true;
                    break;
                }
            }
            visited[cr][cc] = 0;
            return res;
        }
    }
