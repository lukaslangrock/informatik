package socialnetwork;

import lib.Graph;
import lib.Vertex;
import lib.Edge;
import lib.List;

public class SocialNetwork {
    Graph network;
    int n; // number of all people in network
    int m; // number of all connections between people

    public SocialNetwork() {
        genNetwork();
        calcNetwork();
    }

    private void genNetwork() {
        network = new Graph();
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");
        Vertex i = new Vertex("I");
        Vertex j = new Vertex("J");

        network.addVertex(a);
        network.addVertex(b);
        network.addVertex(c);
        network.addVertex(d);
        network.addVertex(e);
        network.addVertex(f);
        network.addVertex(g);
        network.addVertex(h);
        network.addVertex(i);
        network.addVertex(j);

        network.addEdge(new Edge(a, b, 1));
        network.addEdge(new Edge(a, c, 1));
        network.addEdge(new Edge(a, d, 1));
        network.addEdge(new Edge(a, f, 1));
        network.addEdge(new Edge(b, d, 1));
        network.addEdge(new Edge(b, e, 1));
        network.addEdge(new Edge(b, g, 1));
        network.addEdge(new Edge(c, d, 1));
        network.addEdge(new Edge(c, f, 1));
        network.addEdge(new Edge(d, g, 1));
        network.addEdge(new Edge(d, f, 1));
        network.addEdge(new Edge(d, e, 1));
        network.addEdge(new Edge(e, g, 1));
        network.addEdge(new Edge(f, g, 1));
        network.addEdge(new Edge(f, h, 1));
        network.addEdge(new Edge(g, h, 1));
        network.addEdge(new Edge(h, i, 1));
        network.addEdge(new Edge(i, j, 1));
    }

    public void calcNetwork() {
        // calculates statistics about the network
        List<Vertex> allVertices = network.getVertices();
        List<Edge> allEdges = network.getEdges();

        allVertices.toFirst();
        allEdges.toFirst();

        n = 0;
        m = 0;

        while (allVertices.hasAccess()) {
            allVertices.next();
            n++;
        }

        while (allEdges.hasAccess()) {
            allEdges.next();
            m++;
        }
    }

    /**
     * Die Methode liefert die Dichte des sozialen Netzwerks.
     */
    public int getDensity() {
        return ((2 * m) / n * (n - 1));
    }

    /**
     * Die Methode liefert den Zentralitätsgrad des im Parameter angegebenen Knoten
     * pVertex im sozialen Netzwerk.
     */
    public int getCentrality(Vertex pVertex) {
        List<Vertex> pVertexNeighbours = network.getNeighbours(pVertex);

        int numerator = 0;
        int denominator = n - 1;

        pVertexNeighbours.toFirst();
        while (pVertexNeighbours.hasAccess()) {
            pVertexNeighbours.next();
            numerator++;
        }

        return (numerator / denominator);
    }
}
