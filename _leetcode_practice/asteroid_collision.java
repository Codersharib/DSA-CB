package _leetcode_practice;
import java.util.*;

public class asteroid_collision {
    public static void main(String[] args) {
        int[] arr={3,5,-6,2,-1,4};
        int[] res=collision(arr);
        for(int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }
    } 
    public static int[] collision(int[] arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++) {
            boolean self_killed=false;
            while (!st.isEmpty() && arr[i]<0 && arr[st.peek()]>0) { 
                if(arr[st.peek()]< -arr[i]){
                    st.pop();
                }
                else if(arr[st.peek()]==-arr[i]){
                    st.pop();
                    self_killed=true;
                    break;
                }
                else{
                    self_killed=true;
                    break;
                }
            }
            if(!self_killed){
                st.push(i);
            }
        }
        int[] ans=new int[st.size()];
        int i=ans.length-1;
        while(!st.isEmpty()){
            ans[i--]=arr[st.pop()];
        }
        return ans;
    } 
     
}