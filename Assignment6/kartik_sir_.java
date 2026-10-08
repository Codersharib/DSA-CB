package Assignment6;

import java.util.*;

public class kartik_sir_ {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++){
            int type=sc.nextInt();
            if(type==2){
                int cost=sc.nextInt();
                st.push(cost);
            }
            else{
                if(!st.isEmpty()){
                    System.out.println(st.peek());
                    st.pop();
                }
                else{
                    System.out.println("No Code");
                }
            }
        }
    }
}
