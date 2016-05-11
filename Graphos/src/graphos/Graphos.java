/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphos;

import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author lelguea
 */
public class Graphos {

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
		Graph graph = new SingleGraph("Tutorial 1");

		graph.addNode("A").addAttribute("xy", 0,0);
		graph.addNode("B").addAttribute("xy", 1,0);
		graph.addNode("C").addAttribute("xy", 0,1);
                graph.addNode("D").addAttribute("xy", 1,1);
                graph.addNode("E").addAttribute("xy", 1,0.5);
		graph.addEdge("AB", "A", "B").addAttribute("distancia",1);
		graph.addEdge("BC", "B", "C").addAttribute("distancia",1.4142);
		graph.addEdge("CA", "C", "A").addAttribute("distancia",1);
                graph.addEdge("CD", "C", "D").addAttribute("distancia",1);
                graph.addEdge("DE", "D", "E").addAttribute("distancia",0.5);

		for (Node n : graph) {
			n.addAttribute("label", n.getId());                
                }

                for (Edge e : graph.getEachEdge()) {
			e.addAttribute("label", e.getNumber("distancia"));                
                }

                
		graph.display(false);
                

                Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.NODE, null, "distancia");
		dijkstra.init(graph);
		dijkstra.setSource(graph.getNode("B"));
		dijkstra.compute();
                	
                System.out.println(dijkstra.getPath(graph.getNode("E")));
                
                
	}
    
}
