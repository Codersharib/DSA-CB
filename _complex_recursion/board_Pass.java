public class board_Pass {
    public static void main(String[] args) {
        System.out.println(print(3, 0, ""));
    }
    public static int print(int n,int curr,String ans){
        if(curr==n){
            // System.out.println(ans);
            return 1;
        }
        if(curr>n) return 0;
        // int x=print(n, curr+1, ans+"1");
        // int y=print(n, curr+2, ans+"2");
        // int z=print(n, curr+3, ans+"3");
        int x=0;
        for(int dice=1;dice<=n;dice++){
            x+=print(n, curr+dice, ans+dice);
        }
        return x;
    }
}
