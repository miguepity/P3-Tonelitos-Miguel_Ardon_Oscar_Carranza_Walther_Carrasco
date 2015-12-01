/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonelitos;

import java.util.ArrayList;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Nodo {
    String letra;
    ListaAristasdeNodos aristas = new ListaAristasdeNodos();
    int x;
    int y;
    Nodo anterior;

    public Nodo() {
    }

    
    public Nodo(String letra, int x, int y) {
        this.letra = letra;
        this.x = x;
        this.y = y;
        this.anterior = null;
    }


    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ListaAristasdeNodos getAristas() {
        return aristas;
    }

    public void setAristas(ListaAristasdeNodos aristas) {
        this.aristas = aristas;
    }


    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return letra;
    }

}
