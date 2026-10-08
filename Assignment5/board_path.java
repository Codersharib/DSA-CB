package Assignment6;

import java.util.*;

public class board_path {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        Print( n, m, "");
        System.out.println();
        System.out.println(count( n, m));
    }

    public static void Print(int n, int m, String ans) {
        if (n == 0) {
            System.out.print(ans + " ");
            return;
        }
        if (n < 0) {
            return;
        }

        for (int dice = 1; dice <= m; dice++) {
            Print( n - dice, m, ans + dice);
        }

    }

    public static int count( int n, int m) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int x=0;
        for (int dice = 1; dice <= m; dice++) {
             x+=count( n - dice, m);
        }
        return x;
        
    }

}
