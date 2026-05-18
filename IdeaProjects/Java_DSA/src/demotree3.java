//Graph using Adjacency List (Undirected)
import java.util.*;

class DemoG {

    private int vertices;
    private ArrayList<ArrayList<Integer>> adjList;

    DemoG(int v) {
        vertices = v;
        adjList = new ArrayList<>();

        for (int i = 0; i < v; i++)
            adjList.add(new ArrayList<>());
    }

    void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // undirected
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adjList.get(i))
                System.out.print(node + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DemoG g = new DemoG(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}