package Lec11;

public class board_path {
    public static void main(String[] args) {
        int n=4;
        path(n, 0, "");
    }
    public static void path(int n,int curr,String ans){
        if(n==curr){
            System.out.println(ans);
            return;
        }
        if(curr>n){
            return ;
        }
        // path(n,curr+1,ans+1);
        // path(n,curr+2,ans+2);
        // path(n,curr+3,ans+3);
        
        // or
        for(int dice=1;dice<=3;dice++){
            path(n,curr+dice,ans+dice);
        }
    }
}
