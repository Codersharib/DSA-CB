package _leetcode_practice;
import java.util.*;
public class DI_string_min_num {
    public static void main(String[] args) {
        DI("IIIDIDDD");
    }
    public static void DI(String s){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[s.length()+1];
        int c=1;
        for (int i = 0; i < s.length(); i++) {
            int p=0;
            while(!st.isEmpty() && s.charAt(i)=='I'){
                if(p==0){
                    ans[i]=c++;
                    p++;
                }
                ans[st.pop()]=c++;
            }
            if(s.charAt(i)=='I'){
                ans[i]=c++;
            }
            else {
                st.push(i);
            }
        }
        int r=0;
        while(!st.isEmpty()){
            r=st.pop();
            ans[r+1]=c++;
        }
        ans[r]=c;
        System.out.println(Arrays.toString(ans));
    }
}
