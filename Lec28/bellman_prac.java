package Lec28;
import java.util.*;
public class bellman_prac {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public bellman_prac(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
    }
    class BPair{
        int e1,e2,cost;

        public BPair(int e1, int e2, int cost) {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }
    }
    public List<BPair> addAllEdge(){
        List<BPair> ll=new ArrayList<>();
        for(int vtx:map.keySet()){
            for (int nbrs : map.get(vtx).keySet()) {
                ll.add(new BPair(vtx, nbrs, map.get(vtx).get(nbrs)));
            }
        }
        return ll;
    }
    public void Bellman(int src){
        int n=map.size();
        int[] arr=new int[n+1];
        for (int i = 1; i < arr.length; i++) {
            if(i!=src){
                arr[i]=999999;
            }
        }
        List<BPair> ll=addAllEdge();
        for(int i=1;i<n;i++){
            // 1 time relax
            for(BPair rp:ll){
                if(i==n && arr[rp.e2]>arr[rp.e1]+rp.cost){
                    System.out.println("-ve wt cycle");
                    return;
                }
                if(arr[rp.e2]>arr[rp.e1]+rp.cost){
                    arr[rp.e2]=arr[rp.e1]+rp.cost;
                }
            }
        }
        for(int i=1;i<arr.length;i++){
            System.out.print(i+" "+arr[i]+"\n");
        }
    }
    public static void main(String[] args) {
        bellman_prac bf=new bellman_prac(5);
        bf.AddEdge(1, 2, 8);
		bf.AddEdge(1, 3, 4);
		bf.AddEdge(1, 4, 5);
		bf.AddEdge(2, 5, -2);
		bf.AddEdge(5, 2, 1);
		bf.AddEdge(3, 4, -3);
		bf.AddEdge(4, 5, 4);
        bf.Bellman(1);
    }
}
