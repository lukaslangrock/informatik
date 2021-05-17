package nikolaushaus;

import lib.List;
import lib.Graph;
import lib.Vertex;
import lib.Edge;

public class Nikolaushaus {
    private Graph graph;

    public Nikolaushaus() {
        graph = new Graph();
        genGraph();
    }

    private void genGraph() {
        // gen vertexes from pool A, B, C, D, E
        for (char i : new String("ABCDE").toCharArray()) {
            graph.addVertex(new Vertex(Character.toString(i)));
        }

        // gen edges connecting vertexes in the shape of a house
        graph.addEdge(new Edge(graph.getVertex("A"), graph.getVertex("B"), 0));
        graph.addEdge(new Edge(graph.getVertex("A"), graph.getVertex("E"), 0));
        graph.addEdge(new Edge(graph.getVertex("B"), graph.getVertex("C"), 0));
        graph.addEdge(new Edge(graph.getVertex("C"), graph.getVertex("A"), 0));
        graph.addEdge(new Edge(graph.getVertex("C"), graph.getVertex("D"), 0));
        graph.addEdge(new Edge(graph.getVertex("D"), graph.getVertex("E"), 0));
        graph.addEdge(new Edge(graph.getVertex("E"), graph.getVertex("C"), 0));
        graph.addEdge(new Edge(graph.getVertex("E"), graph.getVertex("B"), 0));
    }

    public boolean checkWay(String wayString) {
        char[] wayArray = wayString.toCharArray();

        if (wayArray[0] != wayArray[wayArray.length - 1]) {
            return false; // start and end of way are not the same
        }

        for (int i = 0; i < (wayArray.length - 1); i++) {
            Vertex currentVertex = graph.getVertex(Character.toString(wayArray[i]));
            List<Vertex> currentVertexNeighbours = graph.getNeighbours(currentVertex);
            boolean currentVertexIsValid = false;

            currentVertexNeighbours.toFirst();
            while (currentVertexNeighbours.hasAccess()) {
                if (currentVertexNeighbours.getContent().getID().equals(Character.toString(wayArray[i + 1]))) {
                    currentVertexIsValid = true; // valid path to next waypoint found
                }

                currentVertexNeighbours.next();
            }

            if (!currentVertexIsValid) {
                return false; // if current vertex is not valid the entire way is invalid
            }
        }

        return true; // all checks passed
    }
}
