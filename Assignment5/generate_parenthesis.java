package Assignment6;
import java.util.*;
public class generate_parenthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n, 0, 0, "");
    }

    public static void print(int n,int open,int closed,String ans){
        if(open==n && closed==n){
            System.out.println(ans);
            return;
        }
        if(open<closed || open>n) return;
        print(n, open, closed+1, ans+")");
        print(n, open+1, closed, ans+"(");
    }
}
