package Interfaz;
import Clases.Archivos;
import Clases.Estructuras.Estructuras;
import Clases.Estructuras.ListaUsuario;
import Clases.Estructuras.Matriz;
import java.awt.Color;
import javax.swing.*;
import Clases.Global;
import Clases.Nodos.NodoPlantasZombies;
import Clases.Nodos.Nodo_Usuario;
import Clases.Tiempo;

/**
 *
 * @author MorseIván
 */
public class TableroDeJuego extends javax.swing.JFrame {
    private JLabel a;
    Archivos ar = new Archivos();
    Matriz m;
    /**
     * Creates new form TipoMatriz
     */
    public TableroDeJuego() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        for (int i = 0; i <Global.getInstance().fil; i++)
        {
            for (int j = 0; j<Global.getInstance().Col; j++)
            {
                
            setLayout(null);  
            a = new JLabel();
            a.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/fondo1.png")));
            a.setBounds(27+(i*50),130+(j*50), 50, 50);
            
            add(a);
            
            }
        }
        UsPlantas.setText(Global.getInstance().nombre_Us_Planta);
        UsZombies.setText(Global.getInstance().nombre_Us_Zombie);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UsPlantas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsZombies = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ComenzarJuego = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        GrafUs = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        GrafPlantas = new javax.swing.JMenuItem();
        GrafZombies = new javax.swing.JMenuItem();
        GrafPila = new javax.swing.JMenuItem();
        GrafCola = new javax.swing.JMenuItem();
        GrafMatriz = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setText("Plantas: ");

        jLabel3.setText("Zombies:");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ComenzarJuego.setText("Sacar");
        ComenzarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarJuegoActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Pila");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ComenzarJuego.add(jMenuItem1);

        jMenuItem2.setText("Cola");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        ComenzarJuego.add(jMenuItem2);

        jMenuBar1.add(ComenzarJuego);

        jMenu2.setText("Graficas");

        GrafUs.setText("Grafica Usarios");
        GrafUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrafUsActionPerformed(evt);
            }
        });
        jMenu2.add(GrafUs);

        jMenu3.setText("Grafica Catalogos");

        GrafPlantas.setText("Plantas");
        GrafPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrafPlantasActionPerformed(evt);
            }
        });
        jMenu3.add(GrafPlantas);

        GrafZombies.setText("Zombies");
        GrafZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrafZombiesActionPerformed(evt);
            }
        });
        jMenu3.add(GrafZombies);

        jMenu2.add(jMenu3);

        GrafPila.setText("Grafica Pila");
        GrafPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrafPilaActionPerformed(evt);
            }
        });
        jMenu2.add(GrafPila);

        GrafCola.setText("Grafica Cola");
        GrafCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrafColaActionPerformed(evt);
            }
        });
        jMenu2.add(GrafCola);

        GrafMatriz.setText("Grafica Matriz");
        jMenu2.add(GrafMatriz);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UsPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsZombies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsZombies, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsPlantas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(369, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GrafUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrafUsActionPerformed
 MostrarGrafica mg = new MostrarGrafica();  
        ar.CrearArchivo("C:\\Varios\\MetodoUsuario.txt");
        
        StringBuilder sb = new StringBuilder();
        ListaUsuario lobj = Global.getInstance().usuario;
        Nodo_Usuario nus = lobj.ninicio;
        NodoPlantasZombies npz;
        Estructuras lpla;
        Estructuras lzob;
        while ( nus != null)
        {
            sb.append ( nus.npadre + "->" + nus.nhijo + ";\n"  );
            lpla = nus.objplantas;
            npz = lpla.ninicio;
            while ( npz != null)
            {
             sb.append ( npz.npadre + "->" + npz.nhijo + ";\n"  );
                npz = npz.sig;
            }
            lzob = nus.objzombies;
            npz = lzob.ninicio;
            while ( npz != null)
            {
             sb.append ( npz.npadre + "->" + npz.nhijo + ";\n"  );
                npz = npz.sig;
            }
            nus = nus.sig;
         
        }
        
        ar.Escribir("Digraph g {"+sb.toString()+"}");
        ar.Graficar("MetodoUsuario","GUsuario");
        mg.mostrarGrafica("GUsuario");
        mg.setVisible(true);
    }//GEN-LAST:event_GrafUsActionPerformed

    private void GrafPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrafPlantasActionPerformed
       StringBuilder s = new StringBuilder ();
       MostrarGrafica mg1 = new MostrarGrafica();  
       Estructuras lpla = Global.getInstance().plantas;
       NodoPlantasZombies npz = lpla.ninicio;
       ar.CrearArchivo("C:\\Varios\\MetodoPlantas.txt");
       
       while (npz != null){
       s.append(npz.npadre + " ->" + npz.nhijo + "; \n");
       npz = npz.sig;
       }
       ar.Escribir("Digraph g {" + s.toString()+"}");
       ar.Graficar("MetodoPlantas","GPlantas");
       mg1.mostrarGrafica( "GPlantas");
       mg1.setVisible(true);
       this.setVisible(true);
       
    }//GEN-LAST:event_GrafPlantasActionPerformed

    private void GrafPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrafPilaActionPerformed
       StringBuilder s = new StringBuilder ();
       MostrarGrafica mg1 = new MostrarGrafica();  
       Estructuras pila = Global.getInstance().pila;
       NodoPlantasZombies npz = pila.nfinal;
       ar.CrearArchivo("C:\\Varios\\MetodoPila.txt");
       
       while (npz != null){
       s.append(npz.nhijo + " ->" + npz.npadre + "; \n");
       npz = npz.ant;
       }
       ar.Escribir("Digraph g {" + s.toString()+"}");
       ar.Graficar("MetodoPila","GPila");
       mg1.mostrarGrafica( "GPila");
       mg1.setVisible(true);
       this.setVisible(true);
        
    }//GEN-LAST:event_GrafPilaActionPerformed

    private void GrafZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrafZombiesActionPerformed
       StringBuilder s = new StringBuilder ();
       MostrarGrafica mg1 = new MostrarGrafica();  
       Estructuras lpla = Global.getInstance().zombies;
       NodoPlantasZombies npz = lpla.ninicio;
       ar.CrearArchivo("C:\\Varios\\MetodoZombie.txt");
       
       while (npz != null){
       s.append(npz.npadre + " ->" + npz.nhijo + "; \n");
       npz = npz.sig;
       }
       ar.Escribir("Digraph g {" + s.toString()+"}");
       ar.Graficar("MetodoZombie","GZombie");
       mg1.mostrarGrafica( "GZombie");
       mg1.setVisible(true);
       this.setVisible(true);
       

    }//GEN-LAST:event_GrafZombiesActionPerformed

    private void ComenzarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarJuegoActionPerformed
        
    }//GEN-LAST:event_ComenzarJuegoActionPerformed

    private void GrafColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrafColaActionPerformed
        StringBuilder s = new StringBuilder ();
       MostrarGrafica mg1 = new MostrarGrafica();  
       Estructuras lpla = Global.getInstance().cola;
       NodoPlantasZombies npz = lpla.ninicio;
       ar.CrearArchivo("C:\\Varios\\MetodoCola.txt");
       
       while (npz != null){
       s.append(npz.npadre + " ->" + npz.nhijo + "; \n");
       npz = npz.sig;
       }
       ar.Escribir("Digraph g {" + s.toString()+"}");
       ar.Graficar("MetodoCola","GCola");
       mg1.mostrarGrafica( "GCola");
       mg1.setVisible(true);
       this.setVisible(true);
       
    }//GEN-LAST:event_GrafColaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Tiempo t = new Tiempo();
        Estructuras p = Global.getInstance().pila;
        
        int a = (Integer)Global.getInstance().cantidad_Zombie ;
        
        for (int i = 1; i<=a; i++)
        {
            
      Global.getInstance().zombies.sacarLista();
      t.sacar();

        if (p == null)
       {
            p = new Estructuras(Global.getInstance().nombre_Us_Zombie);
        }
    p.Insertar(Global.getInstance().zombies.imag, Global.getInstance().zombies.nom,Global.getInstance().zombies.tipa,Global.getInstance().zombies.puA , Global.getInstance().zombies.puD ,1);
    Global.getInstance().pila = p;
      
        }        
        System.out.println("Nombre: " + p);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Tiempo t = new Tiempo();
        Estructuras c = Global.getInstance().cola;
        int a = (Integer)Global.getInstance().cantidad_Planta ;
        
        for (int i = 1; i<=a; i++)
        {
            Global.getInstance().plantas.sacarLista();
            t.sacar();
        if (c == null)
        {
            c = new Estructuras(Global.getInstance().nombre_Us_Planta);
        }
            c.Insertar(Global.getInstance().plantas.imag, Global.getInstance().plantas.nom,Global.getInstance().plantas.tipa,Global.getInstance().plantas.puA , Global.getInstance().plantas.puD, 1 );
            Global.getInstance().cola = c;
        }
        System.out.println("Nombre: " + c.toString());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TableroDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableroDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableroDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroDeJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroDeJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ComenzarJuego;
    private javax.swing.JMenuItem GrafCola;
    private javax.swing.JMenuItem GrafMatriz;
    private javax.swing.JMenuItem GrafPila;
    private javax.swing.JMenuItem GrafPlantas;
    private javax.swing.JMenuItem GrafUs;
    private javax.swing.JMenuItem GrafZombies;
    private javax.swing.JLabel UsPlantas;
    private javax.swing.JLabel UsZombies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables


}
