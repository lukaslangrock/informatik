package socialnetwork;

import lib.Graph;
import lib.Vertex;
import lib.Edge;

public class SocialNetwork {
    Graph network;

    public SocialNetwork() {
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

    /**
     * Die Methode liefert die Dichte des sozialen Netzwerks.
     */
    public int getDensity() {
        return 0;
    }

    /**
     * Die Methode liefert den Zentralitätsgrad des im Parameter angegebenen Knoten
     * pVertex im sozialen Netzwerk.
     */
    public int getCentrality(Vertex pVertex) {
        // hier entsteht die Methode, die den Zentralitätsgrad des Knoten pVertex
        // zurückliefert
        return 0;
    }
}
