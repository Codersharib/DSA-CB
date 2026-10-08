package Days45;

import java.util.*;

public class shortest_safe_route {
    public static void main(String[] args)
    {
        int[][] field =
                {
                        { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                        { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                        { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
                        { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
                };
    }
    public static void bfs(int[][] grid,int src,int des){
        Queue<pair> q=new LinkedList<>();
        HashSet<pair> visited=new HashSet<>();
        int[] dr={-1,0,1,0};
        int[] dc={0,-1,0,1};
        q.add(new pair(src, 0));
        while(!q.isEmpty()){
            // remove
            pair rp=q.poll();
            // ignore if alredy viisted
            // mark visited
            for ( int i = src; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    for (int j2 = 0; j2 < dc.length; j2++) {
                        int r=i+dr[i];
                        int c=j+dc[j];
                    }
                }
            }
            // self work
            // add unviisted
        }
    }
    static class pair{
        int i,j;

        public pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
