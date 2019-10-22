package Modelo;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author curso
 * @param <T>
 */
public class Grafo<T> {
    private List<Nodo<T>> nodos;
    private List<Arco<T>> arcos;

    public Grafo() {
        this.nodos = new ArrayList<Nodo<T>> ();
        this.arcos = new ArrayList<Arco<T>>();
    }

    public List<Nodo<T>> getNodos() {
        return nodos;
    }

    public void setNodos(List<Nodo<T>> nodos) {
        this.nodos = nodos;
    }

    public List<Arco<T>> getArcos() {
        return arcos;
    }

    public void setArcos(List<Arco<T>> arcos) {
        this.arcos = arcos;
    }
    
    public Nodo<T> agregarNodo(T pValor) {
        Nodo<T> nodo = new Nodo<>(pValor);
        if (nodos == null) {
            nodos = new ArrayList<>();
        }
        nodos.add(nodo);
        return nodo;
    }

    public void agregarArco(Nodo<T> inicio, Nodo<T> destino) {
        Arco<T> arco = new Arco<>(inicio, destino);
        if (arcos == null) {
            arcos = new ArrayList<>();
        }
        arcos.add(arco);
    }
    //es para vaciar el grafo
    public void clear() {
    
    }  
}
