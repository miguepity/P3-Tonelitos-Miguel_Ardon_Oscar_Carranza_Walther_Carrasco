package tonelitos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Grafo {

    Lista_Aristas lista;
    

    public Grafo() {
        this.lista = new Lista_Aristas();
    }

    public Lista_Aristas getLista() {
        return lista;
    }

    public void setLista(Lista_Aristas lista) {
        this.lista = lista;
    }

    public void addNodo(Nodo nodo) {
        boolean esta = false;
        for (int l = 0; l < lista.size(); l++) {
            if (lista.get(l).getLetra().contentEquals(nodo.getLetra())) {
                esta = true;
            }
        }

        if (esta == false) {
            lista.insert(nodo.getLetra(), nodo.getX(), nodo.getY());
            //nodo.setNumero(lista.size());
            System.out.println("Agregado: " + nodo.getLetra());
        }
    }

    public void guardarGrafo() {
        String texto = lista.size() + ";";
        int aristas = 0;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.get(i).getAristas().size(); j++) {
                texto += lista.get(i).getLetra() + "#" + lista.get(i).getX() + "-" + lista.get(i).getY() + ":" + lista.get(i).getAristas().get(j).getPeso() + ":" + lista.get(i).getAristas().get(j).getDestino().getLetra() + "#" + lista.get(i).getAristas().get(j).getDestino().getX() + "-" + lista.get(i).getAristas().get(j).getDestino().getY() + ";";
            }
        }
        try {
            String nombre = "";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(null);
            file.setCurrentDirectory(new File("./src/ups/nasa"));
            File guarda = file.getSelectedFile();

            if (guarda != null) {
                FileWriter save = new FileWriter(guarda + ".txt");
                save.write(texto);
                save.close();
                JOptionPane.showMessageDialog(null,
                        "El archivo se a guardado Exitosamente",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }
    
    
    public int Travel(int pesoTot,Planet a, Planet b){
        journeys += a.toString();
        journeys += "-->";
        int menor_peso = 0;
        ArrayList <Route> paths = this.getRoutes();
        int cont = 0, temp = 0, contTemp = 0;
        Planet dest = b;
        for(int i = 0; i < paths.size(); i++){
            if(paths.get(i).getNodo1() == a || paths.get(i).getNodo2() == a){
                cont++;
                int p = paths.get(i).getPeso(); 
                if(cont == 2){
                    menor_peso = Math.min(p, temp);
                    if(p == menor_peso && paths.get(i).getNodo1() == a){
                        dest = paths.get(i).getNodo2();
                    }
                    else if(p == menor_peso && paths.get(i).getNodo2() == a){
                        dest = paths.get(i).getNodo1();
                    }
                    else if(temp == menor_peso && paths.get(contTemp).getNodo1() == a){
                        dest = paths.get(contTemp).getNodo2();
                    }
                    else if(temp == menor_peso && paths.get(contTemp).getNodo2() == a){
                        dest = paths.get(contTemp).getNodo1();
                    cont = 0;
                }
                contTemp = i;
                temp = p;
            }
            contTemp++;
        }
        System.out.println("Destino final: " + b + "Planeta donde se movio: " + dest);
        pesoTot+=menor_peso;
        
        if(dest.getName().equals(b.getName())){
             journeys += b.toString();
             journeys += "     Time: " + pesoTot;
             journeys += "\n";
             return pesoTot;
             
         }
         else{
             return Travel(pesoTot,dest,b);
         }
    }
    return pesoTot;
    
}

}
