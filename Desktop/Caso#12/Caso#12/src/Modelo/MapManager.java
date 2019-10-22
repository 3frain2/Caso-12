/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.*; 
import javax.swing.JLabel;

/**
 *
 * @author curso
 * @param <T>
 */
public class MapManager extends Observable {
    private Grafo<Point> grafo; 
    
    public MapManager() {
        this.grafo = new Grafo<Point>();
    }
    
    public void agregarPunto(int x, int y)  {
        Point punto = new Point(x, y);
        
        Nodo<Point> nuevo = grafo.agregarNodo(punto);
        
        int posicionNodo = grafo.getNodos().size()-1;
        int posicionNodoAnterior = posicionNodo - 1;
        
        
        if (grafo.getNodos().size() > 1) {
            grafo.agregarArco(grafo.getNodos().get(posicionNodoAnterior), grafo.getNodos().get(posicionNodo));
            System.out.println("bbb");
        }
        else {
            grafo.agregarArco(grafo.getNodos().get(posicionNodo), grafo.getNodos().get(posicionNodo));
            System.out.println("aaaa");
        }
        
        setChanged(); 
        this.setChanged();
        this.notifyObservers(nuevo);
        
    }
    
    public void agregarArco(Nodo nodo) {
        //grafo.agregarArco(, nodo);
        
    }
}
