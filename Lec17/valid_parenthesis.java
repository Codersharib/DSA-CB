package Lec17;

import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        String s="()[]{}";
        // Stack<Integer> st=new Stack<>();
        System.out.println(isvalid(s));
    }
    public static boolean isvalid(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(ch==']' && st.peek()!='['){
                    return false;
                }
                else if(ch==')' && st.peek()!='('){
                    return false;
                }
                else if(ch=='}' && st.peek()!='{'){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
