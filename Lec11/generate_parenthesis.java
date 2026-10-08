import java.util.*;

public class generate_parenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> ll=new ArrayList<>();
        parenthessis(n, 0, 0,"",ll);
        System.out.println(ll);
    }
    // public static void parenthessis(int n,int open,int closed,String ans){
    //     if(open==n && closed==n){
    //         System.out.println(ans);
    //         return;
    //     }
    //     if(open>n || closed>open){
    //         return ;
    //     }
    //     parenthessis(n, open+1, closed, ans+"(");
    //     parenthessis(n, open, closed+1, ans+")");
    // }
    public static void parenthessis(int n,int open,int closed,String ans,List<String> ll){
        if(open==n && closed==n){
            // System.out.println(ans);
            ll.add(ans);
            return;
        }
        if(open>n || closed>open){
            return ;
        }
        parenthessis(n, open+1, closed, ans+"(",ll);
        parenthessis(n, open, closed+1, ans+")",ll);
    }
}
