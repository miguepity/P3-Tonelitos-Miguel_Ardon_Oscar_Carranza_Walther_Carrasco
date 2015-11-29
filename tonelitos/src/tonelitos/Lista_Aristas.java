/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonelitos;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Lista_Aristas {

    Nodo head;
    int cantidad;

    public Lista_Aristas() {
        head = new Nodo();
        cantidad = 0;
    }

    public void insert(String letra, int x, int y) {
        Nodo newNodo = new Nodo(letra, x, y);
        Nodo newHead = head;
        int cont = 0;
        if (x == 0) {
            newNodo.setAnterior(head);
            this.setHead(newNodo);
        }
        while (newHead.getAnterior() != null) {
            newHead = newHead.getAnterior();
            cont++;
            if (cont == x) {
                break;
            }
        }
        Nodo n = newHead.getAnterior();
        newHead.setAnterior(newNodo);
        newNodo.setAnterior(n);
        cantidad++;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public String get(int pos) {
        Nodo temp = head;
        String valor = temp.getLetra();
        for (int i = 0; i < pos; i++) {
            //temp=temp.getLetra();
            valor = temp.getLetra();

        }
        return valor;
    }

    public void delete(int pos) {
        if (cantidad != 0) {
            Nodo temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.getAnterior();
            }
            Nodo temp2 = temp.getAnterior();
            temp.setAnterior(temp2.getAnterior());
            cantidad--;
        }else{
            JOptionPane.showMessageDialog(null, "Ya no hay nodos.");
        }

        
    }

    public String first() {
        return head.getLetra();
    }

    public void Print_Lista() {
        Nodo temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getAnterior() != null) {
                System.out.print("[" + temp.getLetra() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getLetra() + "]");
                cont++;
            }
            temp = temp.getAnterior();
        }
        System.out.println("");
    }
    
    public int size(){
        return cantidad;
    }
}
