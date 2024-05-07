import java.util.*;

import javax.swing.JFrame;

public class Main {
	static Grafo grafo = new Grafo(); 
	
	static void agregarDatos() { 
        grafo.agregarVertice("UMB");
        grafo.agregarVertice("Crepes & Waffles Plaza 39");
        grafo.agregarVertice("Crepes & Waffles Galerias");
        grafo.agregarVertice("Crepes & Waffles Parkway");
        grafo.agregarVertice("Crepes & Waffles Av.Chile"); 
        grafo.agregarVertice("Crepes & Waffles cl 73");
        grafo.agregarVertice("Crepes & Waffles Movistar");
        grafo.agregarVertice("Crepes & Waffles Mall Plaza");
        grafo.agregarVertice("Crepes & Waffles IBIS");
        grafo.agregarVertice("Crepes & Waffles 93");
        
        // UMB CON TODOS
        grafo.agregarArista("UMB", "Crepes & Waffles Plaza 39", 3.8);
        grafo.agregarArista("UMB", "Crepes & Waffles Galerias", 3.5);
        grafo.agregarArista("UMB", "Crepes & Waffles Parkway", 4.2);
        grafo.agregarArista("UMB", "Crepes & Waffles Av.Chile", 3);
        grafo.agregarArista("UMB", "Crepes & Waffles cl 73", 5.1);
        grafo.agregarArista("UMB", "Crepes & Waffles Movistar", 6.7);
        grafo.agregarArista("UMB", "Crepes & Waffles Mall Plaza", 9.9);
        grafo.agregarArista("UMB", "Crepes & Waffles IBIS", 6.5);
        grafo.agregarArista("UMB", "Crepes & Waffles 93", 6.8);
        
        // Crepes & Waffles Plaza 39 con todos
        grafo.agregarArista("Crepes & Waffles Plaza 39", "Crepes & Waffles Galerias", 4.1);
        grafo.agregarArista("Crepes & Waffles Plaza 39", "Crepes & Waffles Parkway", 1.4);
        grafo.agregarArista("Crepes & Waffles Plaza 39", "Crepes & Waffles Av.Chile", 5);
        grafo.agregarArista("Crepes & Waffles Plaza 39", "Crepes & Waffles cl 73", 5.1);
        grafo.agregarArista("Crepes & Waffles Plaza 39", "Crepes & Waffles Movistar", 4.9);
        grafo.agregarArista("Crepes & Waffles Plaza 39", "Crepes & Waffles Mall Plaza", 4.6);
        grafo.agregarArista("Crepes & Waffles Plaza 39", "Crepes & Waffles IBIS", 3);
        grafo.agregarArista("Crepes & Waffles Plaza 39", "Crepes & Waffles 93", 9.1);
        
        // Crepes & Waffles Galerias
        grafo.agregarArista("Crepes & Waffles Galerias", "Crepes & Waffles Parkway", 2);
        grafo.agregarArista("Crepes & Waffles Galerias", "Crepes & Waffles Av.Chile", 6.5);
        grafo.agregarArista("Crepes & Waffles Galerias", "Crepes & Waffles cl 73", 6.5);
        grafo.agregarArista("Crepes & Waffles Galerias", "Crepes & Waffles Movistar", 3.1);
        grafo.agregarArista("Crepes & Waffles Galerias", "Crepes & Waffles Mall Plaza", 7.2);
        grafo.agregarArista("Crepes & Waffles Galerias", "Crepes & Waffles IBIS", 5.5);
        grafo.agregarArista("Crepes & Waffles Galerias", "Crepes & Waffles 93", 8.1); 
        
        // Crepes & Waffles Parkway
        grafo.agregarArista("Crepes & Waffles Parkway", "Crepes & Waffles Av.Chile", 7.4);
        grafo.agregarArista("Crepes & Waffles Parkway", "Crepes & Waffles cl 73", 7.4);
        grafo.agregarArista("Crepes & Waffles Parkway", "Crepes & Waffles Movistar", 3.2);
        grafo.agregarArista("Crepes & Waffles Parkway", "Crepes & Waffles Mall Plaza", 5.8);
        grafo.agregarArista("Crepes & Waffles Parkway", "Crepes & Waffles IBIS", 3.9);
        grafo.agregarArista("Crepes & Waffles Parkway", "Crepes & Waffles 93", 9.4);
       
        // Crepes & Waffles Av.Chile
        grafo.agregarArista("Crepes & Waffles Av.Chile", "Crepes & Waffles cl 73", 4.8);
        grafo.agregarArista("Crepes & Waffles Av.Chile", "Crepes & Waffles Movistar", 5.2);
        grafo.agregarArista("Crepes & Waffles Av.Chile", "Crepes & Waffles Mall Plaza", 1.8);
        grafo.agregarArista("Crepes & Waffles Av.Chile", "Crepes & Waffles IBIS", 9.6);
        grafo.agregarArista("Crepes & Waffles Av.Chile", "Crepes & Waffles 93", 9.7);
       
        // Crepes & Waffles cl 73
        grafo.agregarArista("Crepes & Waffles cl 73", "Crepes & Waffles Movistar", 5.6);
        grafo.agregarArista("Crepes & Waffles cl 73", "Crepes & Waffles Mall Plaza", 2.4);
        grafo.agregarArista("Crepes & Waffles cl 73", "Crepes & Waffles IBIS", 3.6);
        grafo.agregarArista("Crepes & Waffles cl 73", "Crepes & Waffles 93", 9);
        
        //Crepes & Waffles Movistar
        grafo.agregarArista("Crepes & Waffles Movistar", "Crepes & Waffles Mall Plaza", 9);
        grafo.agregarArista("Crepes & Waffles Movistar", "Crepes & Waffles IBIS", 7.2);
        grafo.agregarArista("Crepes & Waffles Movistar", "Crepes & Waffles 93", 6.9);
        
        // Crepes & Waffles Mall Plaza
        grafo.agregarArista("Crepes & Waffles Mall Plaza", "Crepes & Waffles IBIS", 3.1);
        grafo.agregarArista("Crepes & Waffles Mall Plaza", "Crepes & Waffles 93", 1.6);
        
        // Crepes & Waffles IBIS
        grafo.agregarArista("Crepes & Waffles IBIS", "Crepes & Waffles 93", 4.8); 
	}

    public static void main(String[] args) {
    	agregarDatos();
    	
    	JFrame frame = new JFrame("Grafo Visual");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1080, 1080);

        

        grafo.mostrarNombresVertices();
        grafo.mostrarMatrizAdyacencia(); 
        grafo.mostrarMatrizAdyacenciaConPeso();

        System.out.println("");
        System.out.println("_______________________________");
        System.out.println("Algoritmo de dijkstra");
        System.out.println("-------------------------------");
        System.out.println();

        grafo.mostrarDijkstra("Crepes & Waffles Parkway");
       

        GrafoCanvas canvas = new GrafoCanvas(grafo);
        frame.add(canvas);
        frame.setVisible(true);
    }
}