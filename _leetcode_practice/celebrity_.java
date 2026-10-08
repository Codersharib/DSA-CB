package _leetcode_practice;

import java.util.*;

public class celebrity_ {

    public static void main(String[] args) {
        int[][] arr = {
            {0, 1, 1, 1},
            {1, 0, 1, 1},
            {0, 0, 0, 0},
            {1, 1, 1, 0}
        };
        System.out.println(celebrity(arr));
    }

    public static int celebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            if (arr[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int a = st.pop();
        for (int j = 0; j < arr[0].length; j++) {
            if (j != a && arr[a][j] == 0 && arr[j][a] == 1) {
                return a;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
