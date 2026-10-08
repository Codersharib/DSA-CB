package Assignment6;

import java.util.*;

public class n_knight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ll = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        n_queen_(board, 0, n, ll, res);
        for (List<String> l1 : res) {
            for (String s : l1) {
                System.out.print(s);
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(c);
    }
    static int c = 0;

    public static void n_queen_(boolean[][] board, int c_idx, int tn, List<String> ll, List<List<String>> res) {
        int n = board.length;
        if (tn == 0) {
            res.add(new ArrayList<>(ll));
            c++;
            return;
        }
        if (c_idx == n * n) {
            return;
        }
        for (int i = c_idx; i < n * n; i++) {
            int r = i / n;
            int c = i % n;
            if (isPossible(board, r, c)) {
                board[r][c] = true;
                ll.add("{" + r + "-" + i + "}" + " ");
                n_queen_(board, i + 1, tn - 1, ll, res);
                ll.remove(ll.size() - 1);
                board[r][c] = false;
            }
        }
    }

    public static boolean isPossible(boolean[][] board, int row, int col) {
        int[] rowMoves = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] colMoves = {-1, 1, -2, 2, -2, 2, -1, 1};

        for (int k = 0; k < 8; k++) {
            int r = row + rowMoves[k];
            int c = col + colMoves[k];
            if (r >= 0 && c >= 0 && r < board.length && c < board[0].length) {
                if (board[r][c] == true) {
                    return false;
                }
            }
        }
        return true;
    }
}
