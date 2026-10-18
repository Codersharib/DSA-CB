package Days45.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class palindrome_partitioning {
    public static void main(String[] args) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ll=new ArrayList<>();
        partition("aab", ans, ll);
        System.out.println(ans);
    }

    public static void partition(String s,List<List<String>> ans,List<String> ll){
        if(s.length()==0){
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for (int i = 1; i <= s.length(); i++) {
            String str=s.substring(0,i);
            if(palindrome(str)){
                ll.add(str);
                partition(s.substring(i), ans, ll);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean palindrome(String s){
        int si=0;
        int ei=s.length()-1;
        while(si<ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
}
