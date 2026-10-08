package Assignment6;

import java.util.Scanner;

public class rat_in_maze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        StringBuilder res=new StringBuilder();
        maze(arr, 0, 0, arr.length-1, arr[0].length-1,"" ,res);
        System.out.println(res);
    }
    public static void maze(int[][] arr,int sr,int sc,int er,int ec,String ans,StringBuilder res){
        if(sr<0 || sc<0 ||sr>er || sc>ec || arr[sr][sc]==0) return ;
        if(sc==ec && sr==er){
            // System.out.print(ans+" ");
            res.append(ans).append(" ");
            return;
        }
        arr[sr][sc]=0;
        maze(arr, sr+1, sc, er, ec,ans+"D",res);
        maze(arr, sr, sc-1, er, ec,ans+"L",res);
        maze(arr, sr, sc+1, er, ec,ans+"R",res);
        maze(arr, sr-1, sc, er, ec,ans+"U",res);
        arr[sr][sc]=1;
         
        
    }
}
