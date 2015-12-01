/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonelitos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author Oscar
 */
public class frame extends javax.swing.JFrame {

    /**
     * Creates new form frame
     */
    public frame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        for(int i = 0; i < 9; i++){
            xCoors[i] = -1;
            yCoors[i] = -1;
        }
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 4; j++){
                matriz_coordenadas[i][j] = -1;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoadMap = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        img_map = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NewMap = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        peso = new javax.swing.JSpinner();
        img_map1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cb_actual = new javax.swing.JComboBox();
        cb_destino = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CargarMapa = new javax.swing.JLabel();
        NuevoMapa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        LoadMap.getContentPane().setLayout(null);

        jPanel2.setLayout(null);
        LoadMap.getContentPane().add(jPanel2);
        jPanel2.setBounds(800, 0, 0, 0);

        img_map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/mapa1.png"))); // NOI18N
        img_map.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LoadMap.getContentPane().add(img_map);
        img_map.setBounds(30, 40, 830, 480);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/ok.png"))); // NOI18N
        LoadMap.getContentPane().add(jLabel16);
        jLabel16.setBounds(910, 310, 180, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/rutas.png"))); // NOI18N
        LoadMap.getContentPane().add(jLabel6);
        jLabel6.setBounds(920, 40, 170, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/ingrese.png"))); // NOI18N
        LoadMap.getContentPane().add(jLabel4);
        jLabel4.setBounds(870, 80, 211, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/ubicacion.png"))); // NOI18N
        LoadMap.getContentPane().add(jLabel7);
        jLabel7.setBounds(910, 150, 190, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/destino.png"))); // NOI18N
        LoadMap.getContentPane().add(jLabel8);
        jLabel8.setBounds(910, 230, 180, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/punto.png"))); // NOI18N
        LoadMap.getContentPane().add(jLabel10);
        jLabel10.setBounds(910, 260, 180, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/punto.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        LoadMap.getContentPane().add(jLabel9);
        jLabel9.setBounds(910, 180, 180, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/food.png"))); // NOI18N
        LoadMap.getContentPane().add(jLabel12);
        jLabel12.setBounds(890, 320, 180, 220);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/wood.jpg"))); // NOI18N
        LoadMap.getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1090, 550);

        NewMap.getContentPane().setLayout(null);

        jPanel3.setLayout(null);
        NewMap.getContentPane().add(jPanel3);
        jPanel3.setBounds(800, 0, 0, 0);
        NewMap.getContentPane().add(peso);
        peso.setBounds(990, 250, 50, 20);

        img_map1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/new.png"))); // NOI18N
        img_map1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        NewMap.getContentPane().add(img_map1);
        img_map1.setBounds(30, 40, 830, 480);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/rutas.png"))); // NOI18N
        NewMap.getContentPane().add(jLabel11);
        jLabel11.setBounds(920, 90, 170, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/ubicacion.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        NewMap.getContentPane().add(jLabel13);
        jLabel13.setBounds(910, 130, 170, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/peso.png"))); // NOI18N
        NewMap.getContentPane().add(jLabel14);
        jLabel14.setBounds(910, 240, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/food.png"))); // NOI18N
        NewMap.getContentPane().add(jLabel1);
        jLabel1.setBounds(900, 330, 180, 190);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/ok.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        NewMap.getContentPane().add(jLabel15);
        jLabel15.setBounds(910, 280, 180, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/addRuta.png"))); // NOI18N
        NewMap.getContentPane().add(jLabel18);
        jLabel18.setBounds(910, 170, 170, 30);

        cb_actual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_actualActionPerformed(evt);
            }
        });
        NewMap.getContentPane().add(cb_actual);
        cb_actual.setBounds(910, 210, 60, 30);

        cb_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_destinoActionPerformed(evt);
            }
        });
        NewMap.getContentPane().add(cb_destino);
        cb_destino.setBounds(1000, 210, 60, 30);

        jLabel19.setBackground(new java.awt.Color(255, 0, 0));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/flechita.png"))); // NOI18N
        NewMap.getContentPane().add(jLabel19);
        jLabel19.setBounds(920, 210, 160, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/wood.jpg"))); // NOI18N
        NewMap.getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 0, 1090, 560);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        CargarMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/cargar_mapa.png"))); // NOI18N
        CargarMapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarMapaMouseClicked(evt);
            }
        });
        jPanel1.add(CargarMapa);
        CargarMapa.setBounds(-40, 230, 280, 60);

        NuevoMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/crear_mapa.png"))); // NOI18N
        NuevoMapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoMapaMouseClicked(evt);
            }
        });
        jPanel1.add(NuevoMapa);
        NuevoMapa.setBounds(-40, 170, 280, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/logo.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-40, 30, 652, 110);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/salir.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        jPanel1.add(salir);
        salir.setBounds(-40, 300, 280, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Toneles/fondo.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarMapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMapaMouseClicked
        JFileChooser fChooser = new JFileChooser();
        fChooser.showOpenDialog(this);
        fChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        String ext = "";
        try{
            File f = fChooser.getSelectedFile();
            ext = f.getAbsolutePath();
        }
        catch(Exception e){

        }

        System.out.println(ext);
        ImageIcon RealImg = new ImageIcon(ext);
        img_map.setIcon(RealImg);

        try{
            ImageIcon icon = (ImageIcon)RealImg;
            BufferedImage img = (BufferedImage)((Image) icon.getImage());
        }

        catch(Exception e){

        }
        
        LoadMap.pack();
        LoadMap.setSize(1080, 598);
        LoadMap.setModal(true);
        LoadMap.setLocationRelativeTo(null);
        LoadMap.setTitle("Cargar Mapa");
        LoadMap.setVisible(true);
    }//GEN-LAST:event_CargarMapaMouseClicked

    private void NuevoMapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMapaMouseClicked
        NewMap.pack();
        NewMap.setSize(1080, 598);
        NewMap.setModal(true);
        NewMap.setLocationRelativeTo(null);
        NewMap.setTitle("Nuevo Mapa");
        NewMap.setVisible(true);
    }//GEN-LAST:event_NuevoMapaMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    public Icon imageToIcon(Image image){
        ImageIcon imgIcon = new ImageIcon(image);
        Icon iconReturn=(Icon)imgIcon;
        return iconReturn;
    }
    
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        int n1 = cb_actual.getSelectedIndex();
        int n2 = cb_destino.getSelectedIndex();
        
        int x1 = xCoors[n1];
        int x2 = xCoors[n2];
        int y1 = yCoors[n1];
        int y2 = yCoors[n2];
        
        
        JLabel jl = new JLabel();
        jl.setText(peso.getValue().toString());
        jl.setForeground(Color.red);
        jl.setFont(new Font("Tahoma",Font.BOLD,20));
        jl.setLocation((x1+x2+100)/2,(y1+y2+210)/2);
        jl.setVisible(true);
        img_map1.add(jl);
        
        matriz_coordenadas[cont_lines][0] = x1;
        matriz_coordenadas[cont_lines][1] = y1;
        matriz_coordenadas[cont_lines][2] = x2;
        matriz_coordenadas[cont_lines][3] = y2;
        cont_lines++;
        printLines();
    }//GEN-LAST:event_jLabel15MouseClicked

    public void printLines(){
       
        for(int i = 0; i < matriz_coordenadas.length - 1; i++){
            if(matriz_coordenadas[i][0] != -1){
                Graphics g = NewMap.getGraphics();
                Graphics2D g2 = (Graphics2D)g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setPaint(Color.RED);
                g2.setStroke(new BasicStroke(5));
                g2.draw(new Line2D.Double(matriz_coordenadas[i][0]+50,matriz_coordenadas[i][1]+100,matriz_coordenadas[i][2]+50,
                        matriz_coordenadas[i][3]+100));
            }
        }
        
    }
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        JLabel jl = new JLabel();
        String abc = "ABCDEFGH";
        BufferedImage image = null;
        File f = new File(System.getProperty("user.dir") + "\\src\\Toneles\\n" + abc.charAt(cont) + ".png");
        try {
            image = ImageIO.read(f);
        } catch (IOException ex) {
            System.out.println("");
        }

        jl.setIcon(imageToIcon(image));
        jl.setSize(50,50);
        jl.setVisible(true);
        img_map1.add(jl);
        NewMap.repaint();

        Random r = new Random();
        int rX = r.nextInt(800);
        int rY = r.nextInt(400);

        if(xCoors.length == 0){
            xCoors[0] = rX;
            yCoors[0] = rY;
        }
        else{
            for (int i = 0; i < xCoors.length; i++) {
                if(rX == xCoors[i]-50 || rX == xCoors[i]+50){
                    rX = r.nextInt();
                    i = 0;
                }
                if(rY == yCoors[i]-50 || rY == yCoors[i]+50){
                    rY = r.nextInt();
                    i = 0;
                }
            }
        }

        xCoors[cont] = rX;
        yCoors[cont] = rY;
        jl.setLocation(rX,rY);
        
        //Llenar cbs
        cb_actual.removeAllItems();
        cb_destino.removeAllItems();
        
        for(int i = 0; i < xCoors.length-1; i++){
            if(xCoors[i] != -1){ 
                cb_actual.addItem(abc.charAt(i));
                cb_destino.addItem(abc.charAt(i));
            }
        }

        if(cont <= 7){
            cont++;
        }
        
        

    }//GEN-LAST:event_jLabel13MouseClicked

    private void cb_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_destinoActionPerformed
       
    }//GEN-LAST:event_cb_destinoActionPerformed

    private void cb_actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_actualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_actualActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CargarMapa;
    private javax.swing.JDialog LoadMap;
    private javax.swing.JDialog NewMap;
    private javax.swing.JLabel NuevoMapa;
    private javax.swing.JComboBox cb_actual;
    private javax.swing.JComboBox cb_destino;
    private javax.swing.JLabel img_map;
    private javax.swing.JLabel img_map1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner peso;
    private javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables
    int cont = 0, cont_lines = 0;
    int[] xCoors = new int[9];
    int[] yCoors = new int[9];
    int[][] matriz_coordenadas = new int[10][4];
}
