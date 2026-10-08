package Lec17;

import java.util.Stack;

public class insert_button {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Insert(st,-7);
        System.out.println(st);
    }
    public static void Insert(Stack<Integer> st, int n){
        if(st.isEmpty()){
            st.push(n);
            return;
        }
        int x=st.pop();
        Insert(st, n);
        st.push(x);
    }
}
