package _leetcode_practice;
import java.util.*;
public class pattern_132 {
    public static void main(String[] args) {
        int[] arr={1,0,1,-4,-3};
        System.out.println(pattern132(arr));
    }
    public static boolean pattern132(int[] arr){
        Stack<Integer> st=new Stack<>();
        int third=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]<third){
                return true;
            } 
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                third=arr[st.pop()];
            }
            st.push(i);
        }
        return false;
        
    }
}
