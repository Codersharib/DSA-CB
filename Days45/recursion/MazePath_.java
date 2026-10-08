package Days45.recursion;

public class MazePath_ {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        maze(0,0,row-1,col-1,"");
    }
    public static void maze(int cr,int cc ,int er,int ec,String ans){
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        if(cr>er || cc>ec ) return ;
        maze(cr, cc+1,er,ec, ans+'H');
        maze(cr+1, cc,er,ec, ans+'V');
    }
}
