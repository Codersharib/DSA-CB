public class n_queens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        print(board, 0, n);
    }
    public static void print(boolean[][] board,int row,int tq){
        if(tq==0){
            display(board);
            System.out.println();
            return;
        }
        for(int col=0;col<board.length;col++) {
            if(isitsafe(board,row,col)){
                board[row][col]=true;
                print(board, row+1, tq-1);
                board[row][col]=false;
            }
        }
        
    }
    public static boolean isitsafe(boolean[][] board,int row,int col){
        int r=row;
        // up
        while(r>=0){
            if(board[r][col]==true){
                return false;
            }
            r--;
        }
        // left diagonal
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        // right diagonal
        r=row;
        c=col;
        while(r>=0 && c<board[0].length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;

    }
    public static void display(boolean arr[][]){
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
