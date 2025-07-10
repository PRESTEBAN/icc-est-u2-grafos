import Models.Graph;
import Models.Node;

public class App {
    public static void main(String[] args) {
        Graph grafo = new Graph();

        // AGREGA LOS NODOS EN EL ORDEN QUE QUIERES IMPRIMIR
        Node v5 = grafo.addNode(5);
        Node v8 = grafo.addNode(8);
        Node v0 = grafo.addNode(0);
        Node v1 = grafo.addNode(1);
        Node v9 = grafo.addNode(9);
        Node v2 = grafo.addNode(2);
        Node v3 = grafo.addNode(3);
        Node v4 = grafo.addNode(4);
        Node v7 = grafo.addNode(7);

        // Aristas en orden exacto
        grafo.addEdgeUni(v5, v0);
        grafo.addEdgeUni(v8, v1);
        grafo.addEdgeUni(v8, v7);
        grafo.addEdgeUni(v0, v5);
        grafo.addEdgeUni(v0, v1);
        grafo.addEdgeUni(v0, v3);
        grafo.addEdgeUni(v1, v8);
        grafo.addEdgeUni(v1, v0);
        grafo.addEdgeUni(v1, v2);
        grafo.addEdgeUni(v1, v4);
        grafo.addEdgeUni(v9, v3);
        grafo.addEdgeUni(v2, v1);
        grafo.addEdgeUni(v2, v3);
        grafo.addEdgeUni(v3, v0);
        grafo.addEdgeUni(v3, v9);
        grafo.addEdgeUni(v3, v2);
        grafo.addEdgeUni(v3, v4);
        grafo.addEdgeUni(v3, v7);
        grafo.addEdgeUni(v4, v1);
        grafo.addEdgeUni(v4, v3);
        grafo.addEdgeUni(v7, v8);
        grafo.addEdgeUni(v7, v3);

        grafo.printGraph();
    }
}
