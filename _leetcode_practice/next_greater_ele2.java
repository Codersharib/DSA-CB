package _leetcode_practice;

import java.util.Stack;

public class next_greater_ele2 {
    public static void main(String[] args) {
        
    }
    public static void NGE2(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i%arr.length < arr.length; i++) {
            int idx=i%arr.length;
            while (!st.isEmpty() && arr[idx] > arr[st.peek()]) {
                ans[st.pop()] = arr[idx];
            }
            if(i<arr.length){
                st.push(idx);
            }
        }
        while(!st.empty()){
            ans[st.pop()]=-1;
        }
    }
}
