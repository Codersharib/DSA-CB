package Lec27;

import java.util.*;

public class Prims_Algorithm {

    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Prims_Algorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void Prims() {
        HashSet<Integer> visited = new HashSet<>();
        // a and b are PrimsPair instances
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.add(new PrimsPair(1, 1, 0));
        int sum=0;
        while (!pq.isEmpty()) {
            // rmeove
            PrimsPair rp = pq.poll();
            // ignore
            if (visited.contains(rp.vtx)) {
                continue;
            }
            // makr visietdd
            visited.add(rp.vtx);
            // self work
            // System.out.println(rp);
            sum+=rp.cost;
            // add unvisoted nbrs
            for (int nbrs : map.get(rp.vtx).keySet()) {
                int cost = map.get(rp.vtx).get(nbrs);
                pq.add(new PrimsPair(nbrs, rp.vtx, cost));
            }
        }
        System.out.println(sum);
    }

    class PrimsPair {

        int vtx, acqvtx, cost;

        public PrimsPair(int vtx, int acqvtx, int cost) {
            this.vtx = vtx;
            this.acqvtx = acqvtx;
            this.cost = cost;
        }
        @Override
        public String toString(){
            return vtx+" "+acqvtx+" @ "+cost;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // vertex
        int m=sc.nextInt(); // edge
        Prims_Algorithm pq=new Prims_Algorithm(n);
        for (int i = 0; i < m; i++) {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int cost=sc.nextInt();
            pq.AddEdge(v1, v2, cost);
        }
        pq.Prims();
    }

}
