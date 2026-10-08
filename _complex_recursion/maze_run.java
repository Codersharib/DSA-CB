import java.util.ArrayList;
import java.util.List;

public class maze_run {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        List<String> ll=new ArrayList<>();
        // maze(0, 0, n-1, m-1, "", ll);
        // System.out.print(ll);
        System.out.print(maze(0, 0, n-1, m-1, "", ll));
    }
    public static int maze(int cr,int cc,int er,int ec,String ans,List<String> ll){
        if(cr==er && cc==ec){
            // System.out.println(ans);
            ll.add(ans);
            return 1;
        }
        if(cr>er || cc>ec) return 0;
        int x=maze(cr+1, cc, er, ec, ans+"V",ll);
        int y=maze(cr, cc+1, er, ec, ans+"H",ll);
        return x+y;
    }
}
