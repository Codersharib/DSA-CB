package Days45.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board=new boolean[n];
        // n_queen_combination(board, tq, "", 0,0);

        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();

        combination_(board, tq, 0, 0, ll, ans);
        System.out.println(ans);
    }
    public static void n_queen_combination(boolean[] board,int tq,String ans,int qpsf,int idx){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if(board[i]==false){
                board[i]=true;
                n_queen_combination(board, tq, ans+"b"+i+"q"+qpsf, qpsf+1,i+1);
                board[i]=false;
            }
        }
    }

    public static void combination_(boolean board[], int tq,int qpsf,int idx,List<Integer> ll,List<List<Integer>> ans){
        if(qpsf==tq){
            ans.add(new ArrayList<>(ll));
        }
        for (int i = idx; i < board.length; i++) {
            if(board[i]==false){
                board[i]=true;
                ll.add(i+1);
                combination_(board, tq, qpsf+1, i+1, ll, ans);
                ll.remove(ll.size()-1);
                board[i]=false;
            }
        }   
    }
}
