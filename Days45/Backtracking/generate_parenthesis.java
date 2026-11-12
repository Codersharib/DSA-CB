package Days45.Backtracking;

public class generate_parenthesis {
    public static void main(String[] args) {
        parenthesis(3, 0, 0, "");
    }
    public static void parenthesis(int n,int open,int closed,String ans){
        if(open==n && closed==n){
            System.out.println();
        }
        if(closed>open || open >n) return;
        parenthesis(n, open+1, closed,ans+"(");
        parenthesis(n, open, closed+1,ans+")");
        
    }
}
