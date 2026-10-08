package _leetcode_practice;

import java.util.Scanner;
import java.util.Stack;

public class next_greater_element {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Next_Greater(arr, arr);
    }

    public static int[] Next_Greater(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int[] ans = new int[nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && nums2[i] > nums2[st.peek()]) {
                ans[st.pop()] = nums2[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res[i] = ans[j];
                }
            }

        }

        return res;
    }
}
