package Assignment6;

import java.util.*;

public class histogram {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] heights = new long[n];
        for (int i = 0; i < heights.length; i++) {
            heights[i]=sc.nextInt();
        }
        System.out.println(histogram(heights));
    }

    public static long histogram(long[] arr) {
        Stack<Integer> st = new Stack<>();
        long area = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int R = i;
                long h = arr[st.pop()];
                if (st.isEmpty()) {
                    area = Math.max(area, h * R);
                } else {
                    int L = st.peek();
                    area = Math.max(area, h * (R - L - 1));
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while(!st.isEmpty()){
            long h=arr[st.pop()];
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
