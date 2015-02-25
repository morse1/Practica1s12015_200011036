
package Interfaz;

//import Clases.Estructuras.Cola;
import Clases.Archivos;
import Clases.Global;
import Clases.Estructuras.ListaUsuario;
import Clases.Estructuras.Estructuras;

//import Clases.Estructuras.Lista_Zombies;
//import Clases.Estructuras.Pila;
import Clases.Nodos.NodoPlantasZombies;
import Clases.Nodos.Nodo_Usuario;

import Clases.Tiempo;
import javax.swing.JOptionPane;

/**
 * @author MorseIván
 */
public class Creacion_Usuarios extends javax.swing.JFrame {
    
    
    public Creacion_Usuarios() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

    private Estructuras _lp;
    private Estructuras _lz;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugadorPlantas = new javax.swing.JButton();
        btnJugadorZombies = new javax.swing.JButton();
        btnEliminarDatosUsuarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        btnInsertarPlanta = new javax.swing.JButton();
        btnInsertarZombies = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PLANTS VS ZOMBIES GUATEMALTECO 1.0");
        setFont(new java.awt.Font("Adobe Arabic", 1, 12)); // NOI18N
        setIconImage(getIconImage());

        btnJugadorPlantas.setText("Jugador Plantas");
        btnJugadorPlantas.setMaximumSize(new java.awt.Dimension(113, 23));
        btnJugadorPlantas.setMinimumSize(new java.awt.Dimension(113, 23));
        btnJugadorPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadorPlantasActionPerformed(evt);
            }
        });

        btnJugadorZombies.setText("Jugador Zombies");
        btnJugadorZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadorZombiesActionPerformed(evt);
            }
        });

        btnEliminarDatosUsuarios.setText("Eliminar Datos");
        btnEliminarDatosUsuarios.setMaximumSize(new java.awt.Dimension(113, 23));
        btnEliminarDatosUsuarios.setMinimumSize(new java.awt.Dimension(113, 23));
        btnEliminarDatosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDatosUsuariosActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        btnInsertarPlanta.setText("Insertar Plantas");
        btnInsertarPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarPlantaActionPerformed(evt);
            }
        });

        btnInsertarZombies.setText("Insertar Zombies");
        btnInsertarZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarZombiesActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Presentaciones/Presentacion.png"))); // NOI18N

        btnComenzar.setText("Comenzar Extraccion Plantas (prueba)");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        jButton1.setText("Comenzar Extraccion Zombies (prueba)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Grafico");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Graficar Plantas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Graficar Zombies");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnComenzar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEliminarDatosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5)
                                        .addGap(78, 78, 78)))
                                .addComponent(jButton3)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnJugadorPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnInsertarPlanta))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnJugadorZombies, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(79, 79, 79)
                                                .addComponent(btnInsertarZombies)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jButton4))
                                .addGap(33, 33, 33))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnJugadorPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInsertarPlanta))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnJugadorZombies)
                                    .addComponent(jButton2)))
                            .addComponent(btnInsertarZombies))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnComenzar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEliminarDatosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(14, 14, 14))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugadorPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorPlantasActionPerformed
        Usuario_Plantas UP = new Usuario_Plantas();
        UP.setVisible(true);
       
    }//GEN-LAST:event_btnJugadorPlantasActionPerformed

    private void btnJugadorZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorZombiesActionPerformed
        Usuario_Zombies UZ = new Usuario_Zombies();
        UZ.setVisible(true);
    }//GEN-LAST:event_btnJugadorZombiesActionPerformed

    private void btnEliminarDatosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDatosUsuariosActionPerformed
        ListaUsuario l = Global.getInstance().usuario;
        l.vaciarLista();
        area.setText("Lista vacia");
    }//GEN-LAST:event_btnEliminarDatosUsuariosActionPerformed

    
    private void btnInsertarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPlantaActionPerformed
         ListaUsuario lusr = Global.getInstance().usuario;
        Nodo_Usuario nusr = lusr.ninicio;
        while ( nusr != null)
        {
            if (nusr.tipo == 1 )
            {
                _lp = nusr.objplantas;
                break;
            }
            nusr = nusr.sig;
        }
        if ( _lp != null )
        {
                CatalogoPlantas cp = new CatalogoPlantas();
        cp.lplantas = _lp;
        cp.setVisible(true); 
        }
    }//GEN-LAST:event_btnInsertarPlantaActionPerformed

    private void btnInsertarZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarZombiesActionPerformed
         ListaUsuario lusr = Global.getInstance().usuario;
        Nodo_Usuario nusr = lusr.ninicio;
        while ( nusr != null)
        {
            if (nusr.tipo == 2 )
            {
                _lz = nusr.objzombies;
                break;
            }
            nusr = nusr.sig;
        }
        if ( _lz != null)
        {
              CatalogoZombies cz = new CatalogoZombies();
              cz.lzombies = _lz;
              cz.setVisible(true);
        }
      
    }//GEN-LAST:event_btnInsertarZombiesActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        Tiempo t = new Tiempo();
        //ListaPlantas lp = Global.getInstance().plantas;
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
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Archivos ar = new Archivos();
        //ar.CrearArchivo("C:\\Users\\MorseIván\\Documents\\NetBeansProjects\\Practica1s12015_200011036\\src\\Archivo_Graficas\\grafica.txt");
        
        
        
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
        
        
        System.out.println("" + sb.toString());
        area.setText(sb.toString());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       StringBuilder s = new StringBuilder ();
       Estructuras lpla = Global.getInstance().plantas;
       NodoPlantasZombies npz = lpla.ninicio;
       
       while (npz != null){
       s.append(npz.npadre + " ->" + npz.nhijo + "; \n");
       npz = npz.sig;
       }
       
       area.setText(s.toString());
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         StringBuilder s = new StringBuilder ();
       Estructuras lzb = Global.getInstance().zombies;
       NodoPlantasZombies npz = lzb.ninicio;
       
       while (npz != null){
       s.append(npz.npadre + " ->" + npz.nhijo + "; \n");
       npz = npz.sig;
       }
       
       area.setText(s.toString());
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Dimensiones_Tablero dt = new Dimensiones_Tablero();
dt.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Creacion_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creacion_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creacion_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creacion_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creacion_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnEliminarDatosUsuarios;
    private javax.swing.JButton btnInsertarPlanta;
    private javax.swing.JButton btnInsertarZombies;
    private javax.swing.JButton btnJugadorPlantas;
    private javax.swing.JButton btnJugadorZombies;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}