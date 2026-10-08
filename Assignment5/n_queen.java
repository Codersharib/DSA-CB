package Assignment6;
import java.util.*;
public class n_queen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> ll=new ArrayList<>();
        List<List<String>> res=new ArrayList<>();
        boolean[][] board=new boolean[n][n];
        n_queen_(board, 0, n,ll,res);
        for(List<String> l1:res) {
            for(String s:l1){
                System.out.print(s);
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(c);
    }
    static int c=0;
    public static void n_queen_(boolean[][] board,int row,int tq,List<String> ll,List<List<String>> res){
        if(tq==0){
            res.add(new ArrayList<>(ll));
            c++;
            return;
        }
        for(int i=0;i<board.length;i++) {
            if(isPossible(board, row,i)){
                board[row][i]=true;
                ll.add("{"+(row+1)+"-"+(i+1)+"}"+" ");
                n_queen_(board, row+1, tq-1,ll,res);
                ll.remove(ll.size()-1);
                board[row][i]=false;
            }
        }
    }
    public static boolean isPossible(boolean[][] board,int row,int col){
        // up
        int r=row;
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }
        // left diagonal
        r=row;
        int c=col;
        while(r>=0 && c>=0 ){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        // right diagonal
        r=row;
        c=col;
        while(r>=0 && c<board[0].length ){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;

    }
}
