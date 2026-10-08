package Lec26;

import java.util.*;

import OOPs.stack;

public class Graph_prac {

    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph_prac(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    // contains edge
    public boolean containsEdge(int v1, int v2) {
        if (map.get(v1).containsKey(v2)) {
            return true;
        }
        return false;
    }

    // contains vertex
    public boolean containsEdge(int v1) {
        if (map.containsKey(v1)) {
            return true;
        }
        return false;
    }

    // no of edges
    public int No_of_Edges() {
        int sum = 0;
        for (int vtx : map.keySet()) {
            sum += map.get(vtx).size();
        }
        return sum / 2;
    }

    public void removeEdge(int v1, int v2) {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removeVertex(int v1) {
        for (int nbrs : map.get(v1).keySet()) {
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }

    public void display() {
        for (int vtx : map.keySet()) {
            System.out.println(vtx + " " + map.get(vtx));
        }
    }

    // has path
    public boolean haspath(int src, int des, HashSet<Integer> visited) {
        if (src == des) {
            return true;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = haspath(nbrs, des, visited);
                if (ans) {
                    return true;
                }
            }
        }
        return false;
    }

    // printpath
    public void printpath(int src, int des, HashSet<Integer> visited, String ans) {
        if (src == des) {
            System.out.println(ans + des);
            return;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                printpath(nbrs, des, visited, ans + src);
            }
        }
        visited.remove(src);
    }

    //  has path using BFS
    public boolean BFS(int src, int des) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while (!q.isEmpty()) {
            // remove
            int r = q.poll();
            // ignore
            if (visited.contains(r)) {
                continue;
            }
            // mark visited
            visited.add(r);
            // self work
            if (r == des) {
                return true;
            }
            // add not visited nbrs in queue
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }
        }
        return false;
    }

    public boolean DFS(int src, int des) {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while (!st.isEmpty()) {
            // remove
            int r = st.pop();
            // ignore
            if (visited.contains(r)) {
                continue;
            }
            // mark viisted
            visited.add(r);
            // self work
            if (r == des) {
                return true;
            }
            // add unvisited in st
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    st.push(nbrs);
                }
            }
        }
        return false;
    }

    // BFT
    public void BFT() {
        // int c=0;
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int vtx : map.keySet()) {
            if (visited.contains(vtx)) {
                continue;
            }
            // c++;
            q.add(vtx);
            while (!q.isEmpty()) {
                // remove
                int r = q.poll();
                // ignore
                if (visited.contains(r)) {
                    continue;
                }
                // mark visited
                visited.add(r);
                // self work
                System.out.print(r + " ");
                // add not visited nbrs in queue
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        // return c;
    }

    // DFT
    public void DFT() {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int vtx : map.keySet()) {
            if (visited.contains(vtx)) {
                continue;
            }
            st.push(vtx);
            while (!st.isEmpty()) {
                // remove
                int r = st.pop();
                // ignore
                if (visited.contains(r)) {
                    continue;
                }
                // mark viisted
                visited.add(r);
                // self work
                System.out.print(r+" ");
                // add unvisited in st
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }
            }
        }
    }
}
