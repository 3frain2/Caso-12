/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author curso
 */
public class Arco<T> {
    private Nodo<T> inicio;
    private Nodo<T> destino;
    private int peso;
   
    public Arco(Nodo<T> inicio, Nodo<T> destino) {
        this.inicio = inicio;
        this.destino = destino;
        this.peso = 1;
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public Nodo<T> getDestino() {
        return destino;
    }

    public void setDestino(Nodo<T> destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    
    
    
}
