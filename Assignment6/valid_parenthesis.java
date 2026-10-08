package Assignment6;

import java.util.Scanner;
import java.util.Stack;

public class valid_parenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String que=sc.next();
        System.out.println(valid(que));
    }
    public static boolean valid(String que){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < que.length(); i++) {
            char ch=que.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if((st.peek()=='('&& ch==')') || (st.peek()=='{'&& ch=='}') || (st.peek()=='['&& ch==']') ){
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        if(st.size()!=0) return false;
        else return true;
    }
}
