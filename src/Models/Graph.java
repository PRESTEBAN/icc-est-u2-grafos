package Models;

import java.util.LinkedHashSet;

public class Graph {

   private LinkedHashSet<Node> nodes;

        public Graph() {
        nodes = new LinkedHashSet<>();
    }
    public Node addNode(int value) {
        Node node = new Node(value);
        nodes.add(node);
        return node;
    }

    //metodo para añadir arista bidireccional
    public void addEdge(Node src, Node dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    //metodo para añadir arista unidireccionarl
    public void addEdgeUni(Node src, Node des) {
        src.addNeighbor(des);
    }

    //metodo para imprimir el grafo
    //Para cada nodo imprimir sus conecciones
  public void printGraph() {
        for (Node node : nodes) {
            System.out.print("Vertex " + node.getValue() + ":");
            for (Node neighbor : node.getNeighbors()) {
                System.out.print(" -> " + neighbor.getValue());
            }
            System.out.println();
        }
    }


    public void getDFS(Node startNode) {

    }

    private void getDFSUtil(Node node, boolean[] visited) {

    }

    public void getBFS(Node startNode) {

    }

    public int[][] getAdjacencyMatrix() {
        return null;
    }

    public void printAdjacencyMatrix() {

    }

}
