package Lec17;

import java.util.*;

public class aestroid_collisision {

    public static void main(String[] args) {
        int[] arr={3,5,-6,2,-1,4};
        System.out.println(Arrays.toString(collision(arr)));
    }

    public static int[] collision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            boolean self_kill=false;
            while (!st.isEmpty() && arr[i] < 0 ) {
                if (arr[st.peek()] < -arr[i]) {
                    st.pop();
                } else if (arr[st.peek()] == -arr[i]) {
                    st.pop();
                    self_kill=true;
                    break;
                }
                else{
                    self_kill=true;
                    break;
                }
            }
            if(!self_kill){
                st.push(i);
            }
        }
        int[] ans=new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            ans[i--]=arr[st.pop()];
        }
        return ans;
    }
}
