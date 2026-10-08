package Lec27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class prim_prac {
    // make graph
    private HashMap<Integer,HashMap<Integer,Integer>> map;

    public prim_prac(int v) {
        map=new HashMap<>();
        for (int i = 1; i <=v; i++) {
            map.put(i, new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public  void prims(){
        HashSet<Integer> visited=new HashSet<>();
        PriorityQueue<PrimPair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new PrimPair(1, 1, 0));
        while(!pq.isEmpty()){
            // remove
            PrimPair rp=pq.poll();
            // ignore
            if(visited.contains(rp.vtx)){
                continue;
            }
            // mark visited
            visited.add(rp.vtx);
            // self work
            System.out.println(rp);
            // add neibhour unvisited
            for(int nbrs:map.get(rp.vtx).keySet()){
                int cost=map.get(rp.vtx).get(nbrs);
                pq.add(new PrimPair(nbrs, rp.vtx, cost));
            }
        }
    }
    class PrimPair{
        int vtx,acqvtx,cost;

        public PrimPair(int vtx, int acqvtx, int cost) {
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;
        }
        @Override
        public String toString(){
            return ""+vtx+acqvtx+"@"+cost;
        }
    }
    public static void main(String[] args) {
        prim_prac g=new prim_prac(7);
        g.addEdge(1, 2, 3);
		g.addEdge(1, 4, 7);
		g.addEdge(2, 3, 1);
		g.addEdge(3, 4, 6);
		g.addEdge(5, 4, 2);
		g.addEdge(5, 6, 4);
		g.addEdge(5, 7, 3);
		g.addEdge(6, 7, 1);
		g.prims();
    }
}
