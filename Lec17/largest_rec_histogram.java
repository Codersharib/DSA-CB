package Lec17;

import java.util.Stack;

public class largest_rec_histogram {

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(Largest_Rectangle_in_Histogram(heights));
    }

    public static int Largest_Rectangle_in_Histogram(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int area = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[i] < heights[st.peek()]) { // check     next smaller
                int R = i;
                int h = heights[st.pop()];
                if (st.isEmpty()) {
                    area = Math.max(area, h * R);
                } else {
                    int L = st.peek();
                    area = Math.max(area, h * (R - L - 1));
                }
            }
            st.push(i);
        }
        int r = heights.length; // assuiming next smaller for rest of element in stack
        while (!st.isEmpty()) {
            int h = heights[st.pop()];
            if (st.isEmpty()) {
                area = Math.max(area, h * r);
            } else {
                int l = st.peek();
                area = Math.max(area, h * (r - l - 1));
            }
        }
        return area;
    }
}
