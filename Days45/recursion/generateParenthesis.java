package Days45.recursion;

public class generateParenthesis {
    public static void main(String[] args) {
        genParen(3,0,0, "");
    }
    public static void genParen(int n,int open,int close,String ans){
        if(n==open && n==close){
            System.out.println(ans);
            return;
        }
        if(close>open || open>n) return;
        
        genParen(n,open+1,close,ans+'(');
        genParen(n,open,close+1, ans+')');
    }
}
