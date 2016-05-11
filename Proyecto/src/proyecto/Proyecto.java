/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author lelguea
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
                System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
                
		Graph graph = new SingleGraph("Tutorial 1");
                
                graph.addAttribute("ui.stylesheet", "url('C:\\Users\\lelguea\\Desktop\\Clases\\Proyecto\\Estilo.css')");

		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");
                graph.addNode("D");
                graph.addNode("E");
                graph.addNode("F");
                graph.addNode("G");
                graph.addNode("H");
                graph.addNode("I");
		graph.addEdge("AC", "A", "C");
		graph.addEdge("AD", "A", "D");
		graph.addEdge("AE", "A", "E");
                graph.addEdge("EF", "E", "F");
                graph.addEdge("DG", "D", "G");
                graph.addEdge("FG", "F", "G");
                graph.addEdge("BH", "B", "H");
                graph.addEdge("CH", "C", "H");
                graph.addEdge("GI", "G", "I");
                graph.addEdge("HI", "H", "I");
                
                //graph.addEdge("Mismo", "F", "F");
                for (Node node : graph) {
                    node.addAttribute("ui.label", "Tarea: "+node.getId());
                }
                

		graph.display();
	}
}
