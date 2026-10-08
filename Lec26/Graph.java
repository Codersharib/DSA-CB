package Lec26;

import java.util.*;

public class Graph {

    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());

        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean ContainsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public boolean Containsvertex(int v1) {
        return map.containsKey(v1);
    }

    public int number_of_Edge() {
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

    public void removevertex(int v1) {
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

    // que1
    // cycle formed as can 1 to 2 and 2 to 1 so used visietd to solve htis
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

    // que2
    // not gettign all path so correcting it  by backtracking
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
        visited.remove(src); // this is imp to get all path
    }
//  que 3 BFS
    public boolean BFS(int src, int des) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while (!q.isEmpty()) {
            // 1 remove
            int r = q.poll();
            // 2 ignore if already visited
            if (visited.contains(r)) {
                continue;
            }
            // 3 mark visited
            visited.add(r);
            // 4 self work
            if (r == des) {
                return true;
            }
            // 5 add unvisited nbrs
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
//   que 4 DFS
    public boolean DFS(int src, int des) {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.push(src);
        while (!st.isEmpty()) {
            // 1 remove
            int r = st.pop();
            // 2 ignore if already visited
            if (visited.contains(r)) {
                continue;
            }
            // 3 mark visited
            visited.add(r);
            // 4 self work
            if (r == des) {
                return true;
            }
            // 5 add unvisited nbrs
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    st.push(nbrs);
                }
            }
        }
        return false;
    }

    //Que5 disconnect graph  BFT
    public void BFT() {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            q.add(src);
            while (!q.isEmpty()) {
                // 1 remove
                int r = q.poll();
                // 2 ignore if already visited
                if (visited.contains(r)) {
                    continue;
                }
                // 3 mark visited
                visited.add(r);
                // 4 self work
                System.out.print(r + " ");
                // 5 add unvisited nbrs
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
    }
  //  Que 6 disconnect graph DFT
    public void DFT() {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int src : map.keySet()) {
            if (visited.contains(src)) {
                continue;
            }
            st.push(src);
            while (!st.isEmpty()) {
                // 1 remove
                int r = st.pop();
                // 2 ignore if already visited
                if (visited.contains(r)) {
                    continue;
                }
                // 3 mark visited
                visited.add(r);
                // 4 self work
                System.out.println(r+" ");
                // 5 add unvisited nbrs
                for (int nbrs : map.get(r).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }
            }
        }
    }
}
