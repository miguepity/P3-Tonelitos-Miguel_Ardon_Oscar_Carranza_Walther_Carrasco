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

    Arista head;
    int cantidad;

    public Lista_Aristas() {
        head = new Arista();
        cantidad = 0;
    }

    public void insert(Arista a1) {
        
        Arista newHead = head;
        int cont = 0;
        if (cantidad == 0) {
            a1.setSiguiente(head);
            this.setHead(a1);
        }
        while (newHead.getSiguiente() != null) {
            newHead = newHead.getSiguiente();
        }
        newHead.setSiguiente(a1);
        cantidad++;
    }

    public void setHead(Arista head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public Arista get(int pos) {
        Arista temp = head;
        Arista valor = temp;
        for (int i = 0; i < pos; i++) {
            temp = temp.getSiguiente();
            valor = temp;
        }
        return valor;
    }
    
    public void delete(int pos) {
        if (cantidad != 0) {
            Arista temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.getSiguiente();
            }
            Arista temp2 = temp.getSiguiente();
            temp.setSiguiente(temp2.getSiguiente());
            cantidad--;
        }else{
            JOptionPane.showMessageDialog(null, "Ya no hay nodos.");
        }

        
    }

    public String first() {
        return head.getOrigen().toString();
    }

    public void Print_Lista() {
        Arista temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getSiguiente() != null) {
                System.out.print("[" + temp.getSiguiente().getOrigen().toString() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getSiguiente().getOrigen().toString() + "]");
                cont++;
            }
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    public int size(){
        return cantidad;
    }
}
