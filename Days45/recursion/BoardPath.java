package Days45.recursion;

public class BoardPath {
    public static void main(String[] args) {
        maze(5, 0, "");
    }
    public static void maze(int n,int curr,String ans){
        if(curr==n){
            System.out.println(ans);
            return ;
        }
        if(curr>n) return ;
        for(int dice=1;dice<=n-1;dice++){
            maze(n, curr+dice, ans+dice);
        }
    }
}
