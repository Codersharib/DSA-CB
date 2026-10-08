package Lec28;

import java.util.*;

public class topological_prac {

    private HashMap<Integer, List<Integer>> map;

    public topological_prac(int v) {
        map = new HashMap<>();
        for (int i = 0; i < v; i++) {
            map.put(i, new ArrayList<>());
        }
    }

    public void Addedge(int v1, int v2) {
        map.get(v1).add(v2);
    }

    public int[] indegree() {
        int[] in = new int[map.size()];
        for (int vtx : map.keySet()) {
            for (int nbrs : map.get(vtx)) {
                in[nbrs]++;
            }
        }
        return in;
    }
    public void topo(){
        if(isCycle()) return;
        int[] in=indegree();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int r=q.poll();
            System.out.println(r+" ");
            for(int nbrs:map.get(r)){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
    }
    // cycle
    public boolean isCycle(){
        int[] in=indegree();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        int c=0;
        while(!q.isEmpty()){
            int r=q.poll();
            c++;
            for(int nbrs:map.get(r)){
                in[nbrs]--;
                if(in[nbrs]==0){
                    q.add(nbrs);
                }
            }
        }
        return c!=map.size();
    }
    
    public static void main(String[] args) {
        topological_prac ts = new topological_prac(8);
		ts.Addedge(1, 2);
		ts.Addedge(1, 0);
		ts.Addedge(1, 4);
		ts.Addedge(3, 1);
		ts.Addedge(2, 3);
		ts.Addedge(4, 5);
		ts.Addedge(5, 7);
		ts.Addedge(6, 3);
		ts.Addedge(6, 7);
		ts.topo();
    }
}
