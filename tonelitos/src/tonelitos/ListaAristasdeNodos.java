package tonelitos;

import javax.swing.JOptionPane;

/**
 *
 * @author Walther
 */
public class ListaAristasdeNodos {

    Arista head;
    int cantidad;

    public ListaAristasdeNodos() {
        head = new Arista();
        cantidad = 0;
    }

    public void insert(Nodo origen, Nodo destino, int peso) {
        Arista newArista = new Arista(origen, destino, peso);
        Arista newHead = head;
        int cont = 0;
        if (cantidad == 0) {
            this.setHead(newArista);
        } else {
            while (newHead.getSiguiente() != null) {
                newHead = newHead.getSiguiente();
                cont++;
                if (cont == cantidad) {
                    break;
                }
            }
        }

        newHead.setSiguiente(newArista);
        cantidad++;
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
        } else {
            JOptionPane.showMessageDialog(null, "Ya no hay nodos.");
        }
    }

    public Arista first() {
        return head;
    }
    
    public Arista getHead() {
        return head;
    }

    public void setHead(Arista head) {
        this.head = head;
    }

    public int size() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
