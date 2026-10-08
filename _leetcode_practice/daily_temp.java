package _leetcode_practice;
import java.util.*;
public class daily_temp {
    public static void main(String[] args) {
        int[] arr={30,60,90};
        daily_temp(arr);
    }
    public static void daily_temp(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int idx=st.pop();
                if(ans[idx]==0){
                    ans[idx]=i-idx;
                }
            }
            st.push(i);
        }
        
        for(int i=0;i<ans.length;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
