package Lec17;

import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int x=st.pop();
        reverse(st);
        Insert(st,x); //n times so total n2
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
