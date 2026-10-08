package Lec16;
import java.util.Stack;
public class stack_java {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st);
        for(int i:st){
            System.out.print(i+" ");
        }
    }
}
