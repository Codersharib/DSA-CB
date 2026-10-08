package Lec27;
import java.util.*;
public class Dijkstra_Algorithm {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijkstra_Algorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());

        }
    }
    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }
    public void Dijkstra_algo(int src){
        HashSet<Integer> visited = new HashSet<>();
        // a and b are PrimsPair instances
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new DijkstraPair(src, ""+src, 0));
        while (!pq.isEmpty()) {
            // rmeove
            DijkstraPair rp = pq.poll();
            // ignore
            if (visited.contains(rp.vtx)) {
                continue;
            }
            // makr visietdd
            visited.add(rp.vtx);
            // self work
            System.out.println(rp);
            // add unvisoted nbrs
            for (int nbrs : map.get(rp.vtx).keySet()) {
                if(!visited.contains(nbrs)){
                    int cost = map.get(rp.vtx).get(nbrs);
                    pq.add(new DijkstraPair(nbrs, rp.acqpath+nbrs, rp.cost+cost));
                }
            }
        }
    }

    class DijkstraPair {

        int vtx, cost;
        String acqpath;

        public DijkstraPair(int vtx,String acqpath, int cost) {
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
        Dijkstra_Algorithm dj = new Dijkstra_Algorithm(7);
		dj.AddEdge(1, 2, 2);
		dj.AddEdge(2, 3, 3);
		dj.AddEdge(1, 4, 10);
		dj.AddEdge(4, 5, 8);
		dj.AddEdge(3, 4, 1);
		dj.AddEdge(5, 6, 5);
		dj.AddEdge(5, 7, 6);
		dj.AddEdge(6, 7, 4);
		dj.Dijkstra_algo(1);
    }
}
