public class generate_parenthesis {
    public static void main(String[] args) {
        System.out.println(print(3, 0, 0, ""));
    }
    public static int print(int n,int open,int closed,String ans){
        if(open ==n && closed==n){
            // System.out.println(ans);
            return 1;
        }
        if(open>n || closed>open) return 0;
        int x=print(n, open+1, closed, ans+"(");
        int y=print(n, open, closed+1, ans+")");
        return x+y;
    }
}
