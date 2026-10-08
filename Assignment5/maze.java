package Assignment6;
import java.util.*;
public class maze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] grid=new int[n][m];
        List<String> ll=new ArrayList<>();
        maze_path(grid,0,grid.length-1,0,grid[0].length-1, "",ll);
        for(String num:ll) {
            System.out.print(num+" ");
        }
        
        System.out.println("\n"+count);
    }
    static int count=0;
    public static void maze_path(int[][] grid,int cr,int er,int cc,int ec,String ans,List<String> ll){
        if(cc==ec && cr==er) {
            // System.out.println(ans);
            ll.add(ans);
            count++;
            return ;
        }
        if(cc> ec || cr>er) return;
        maze_path(grid, cr, er, cc+1, ec, ans+"H",ll);
        maze_path(grid, cr+1, er, cc, ec, ans+"V",ll);
    }
}
