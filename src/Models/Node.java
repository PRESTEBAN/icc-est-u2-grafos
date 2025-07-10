package Models;

import java.util.LinkedHashSet;
import java.util.Set;

public class Node {
    private int value;
    private LinkedHashSet<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new LinkedHashSet<>();
    }

    public int getValue() {
        return value;
    }

    public Set<Node> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Node neighbor) {
        this.neighbors.add(neighbor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Node node = (Node) obj;
        return value == node.value;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }
}
