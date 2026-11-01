package Days45.Backtracking;
import java.util.*;
public class palindrome_partitioning_ {
    public static void main(String[] args) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ll=new ArrayList<>();
        pal_part("aab",ans,ll);
        System.out.println(ans);
    }
    public static void pal_part(String que,List<List<String>> ans,List<String> ll){
        if(que.length()==0){
            // System.out.println(ans);
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for (int i =1 ; i <= que.length(); i++) {
            String s=que.substring(0,i);
            if(isPalindrome(s)){
                ll.add(s);
                pal_part(que.substring(i), ans,ll);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
