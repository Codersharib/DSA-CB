package Lec27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class dijkstra_prac {
    private HashMap<Integer,HashMap<Integer,Integer>> map;
    public dijkstra_prac(int v){
        map =new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }
    public void dijkstra(int src){
        HashSet<Integer> visited=new HashSet<>();
        PriorityQueue<dikPair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new dikPair(src, src+"", 0));
        while(!pq.isEmpty()){
            // remove
            dikPair rp=pq.poll();
            // ignore
            if(visited.contains(rp.vtx)){
                continue;
            }
            // mark viisted
            visited.add(rp.vtx);
            // self work
            System.out.println(rp);
            // add unvisited nodes
            for(int nbrs:map.get(rp.vtx).keySet()){
                int cost=rp.cost+map.get(rp.vtx).get(nbrs);
                pq.add(new dikPair(nbrs,rp.acqpath+nbrs,cost));
            }
        }
    }
    class dikPair{
        int vtx,cost;
        String acqpath;
        public dikPair(int vtx, String acqpath, int cost) {
            this.vtx = vtx;
            this.acqpath = acqpath;
            this.cost = cost;
        }
        @Override
        public String toString(){
            return vtx+" "+acqpath+" @ "+cost;
        }
    }
    public static void main(String[] args) {
        dijkstra_prac dj = new dijkstra_prac(7);
		dj.AddEdge(1, 2, 2);
		dj.AddEdge(2, 3, 3);
		dj.AddEdge(1, 4, 10);
		dj.AddEdge(4, 5, 8);
		dj.AddEdge(3, 4, 1);
		dj.AddEdge(5, 6, 5);
		dj.AddEdge(5, 7, 6);
		dj.AddEdge(6, 7, 4);
		dj.dijkstra(1);
    }
}
