    package Lec26;

    import java.util.*;

    public class Graph_valid_Tree {
        public static void main(String[] args) {
            Solution s=new Solution();
            int[][] edges = {{0,1}, {0,2}, {0,3}, {1,4}};
            int n=5;
            System.out.println(s.validTree(n,edges));
        }

        static class Solution {

            public boolean validTree(int n, int[][] edges) {
                // make graph like i need
                HashMap<Integer, List<Integer>> map = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    map.put(i, new ArrayList<>());
                }
                for (int i = 0; i < edges.length; i++) {
                    int a = edges[i][0];
                    int b = edges[i][1];
                    map.get(a).add(b);
                    map.get(b).add(a);
                }
                // check for tree
                return DFT(map);
            }

            // now check for tree
            // 1 cycle check
            // 2 should not be disconnect graph
            public boolean DFT(HashMap<Integer, List<Integer>> map) {
                Stack<Integer> st = new Stack<>();
                HashSet<Integer> visited = new HashSet<>();
                int c=0;
                for (int src : map.keySet()) {
                    if (visited.contains(src)) {
                        continue;
                    }
                    c++;
                    st.push(src);
                    while (!st.isEmpty()) {
                        // 1 remove
                        int r = st.pop();
                        // 2 ignore if already visited
                        if (visited.contains(r)) {
                            return false;
                        }
                        // 3 mark visited
                        visited.add(r);
                        // 4 self work
                        // 5 add unvisited nbrs
                        for (int nbrs : map.get(r)) {
                            if (!visited.contains(nbrs)) {
                                st.push(nbrs);
                            }
                        }
                    }
                }
                return c==1;
            }
        }
    }
