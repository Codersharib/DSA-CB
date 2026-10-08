package Days45.Backtracking;

public class combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board=new boolean[n];
        n_queen_combination(board, tq, "", 0,0);
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
}
