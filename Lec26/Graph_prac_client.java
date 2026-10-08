package Lec26;

import java.util.HashSet;

public class Graph_prac_client {

    public static void main(String[] args) {
        Graph_prac g = new Graph_prac(7);
        g.addEdge(1, 4, 3);
        g.addEdge(1, 2, 4);
        g.addEdge(2, 3, 1);
        g.addEdge(3, 4, 5);
        g.addEdge(4, 5, 6);
        g.addEdge(5, 6, 7);
        g.addEdge(5, 7, 4);
        g.addEdge(6, 7, 2);
        g.display();
        System.out.println(g.haspath(1, 6, new HashSet<>()));
        g.printpath(1, 6, new HashSet<>(), "");
        System.out.println(g.BFS(1, 6));
        System.out.println(g.DFS(1, 6));
        System.out.println(g.BFT());
        // g.DFT();
    }
}
