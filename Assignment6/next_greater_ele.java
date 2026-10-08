package Assignment6;

import java.util.Scanner;
import java.util.Stack;

public class next_greater_ele {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] res=NGE(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] NGE(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                int idx=st.pop();
                ans[idx]=arr[i];
            }
            st.push(i);
        }
        int idx=arr.length-1;
        while(!st.isEmpty()){
            if(arr[idx]<arr[st.peek()]){
                ans[st.peek()]=-1;
                ans[idx]=arr[st.pop()];
            }
            else{
                ans[st.pop()]=-1;
            }
        }
        // ans[idx]=arr[max];
        return ans;
    }
}
