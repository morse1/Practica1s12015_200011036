
package Interfaz;

import Clases.Estructuras.Cola;
import Clases.Global;
import Clases.Estructuras.ListaUsuario;
import Clases.Estructuras.ListaPlantas;
import Clases.Estructuras.Lista_Zombies;
import Clases.Tiempo;

/**
 * @author MorseIván
 */
public class Creacion_Usuarios extends javax.swing.JFrame {
    
    
    public Creacion_Usuarios() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
    }

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
        btnVerPlantas = new javax.swing.JButton();
        btnEliminarDatosUsuarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        btnVerUsuario = new javax.swing.JButton();
        btnVerZombies = new javax.swing.JButton();
        btnInsertarPlanta = new javax.swing.JButton();
        btnInsertarZombies = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        area3 = new javax.swing.JTextArea();
        btnVerCola = new javax.swing.JButton();
        LimpiarForms = new javax.swing.JButton();

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

        btnVerPlantas.setText("ver plantas");
        btnVerPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPlantasActionPerformed(evt);
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

        btnVerUsuario.setText("ver usuario");
        btnVerUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerUsuarioActionPerformed(evt);
            }
        });

        btnVerZombies.setText("verzombies");
        btnVerZombies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerZombiesActionPerformed(evt);
            }
        });

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

        btnComenzar.setText("Comenzar Juego");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        area1.setColumns(20);
        area1.setRows(5);
        jScrollPane2.setViewportView(area1);

        area2.setColumns(20);
        area2.setRows(5);
        jScrollPane3.setViewportView(area2);

        area3.setColumns(20);
        area3.setRows(5);
        jScrollPane4.setViewportView(area3);

        btnVerCola.setText("Ver Cola");
        btnVerCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerColaActionPerformed(evt);
            }
        });

        LimpiarForms.setText("Borrar Jfields");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnJugadorPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnJugadorZombies)
                                    .addComponent(btnComenzar)
                                    .addComponent(btnEliminarDatosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(LimpiarForms)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerPlantas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVerZombies, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInsertarPlanta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInsertarZombies, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVerUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVerCola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnJugadorPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnJugadorZombies)
                                .addGap(40, 40, 40)
                                .addComponent(btnComenzar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarDatosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVerPlantas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerZombies)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerCola)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInsertarPlanta)
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertarZombies)
                            .addComponent(LimpiarForms)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPlantasActionPerformed
         ListaPlantas lp = Global.getInstance().plantas;
          if (lp == null)
        {
            lp = new ListaPlantas();
        }
        Global.getInstance().plantas = lp;
        area.setText(Global.getInstance().plantas.recorrer_Plantas());
    }//GEN-LAST:event_btnVerPlantasActionPerformed

    private void btnJugadorPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorPlantasActionPerformed
        Usuario_Plantas UP = new Usuario_Plantas();
        UP.setVisible(true);
    }//GEN-LAST:event_btnJugadorPlantasActionPerformed

    private void btnJugadorZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorZombiesActionPerformed
        Usuario_Zombies UZ = new Usuario_Zombies();
        UZ.setVisible(true);
    }//GEN-LAST:event_btnJugadorZombiesActionPerformed

    private void btnVerUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerUsuarioActionPerformed
        ListaUsuario lp = Global.getInstance().usuario;
          if (lp == null)
        {
            lp = new ListaUsuario();
        }
        Global.getInstance().usuario = lp;
        area2.setText(Global.getInstance().usuario.recorrer_cola());

    }//GEN-LAST:event_btnVerUsuarioActionPerformed

    private void btnEliminarDatosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDatosUsuariosActionPerformed
        ListaUsuario l = Global.getInstance().usuario;
        l.vaciarLista();
        area.setText("Lista vacia");
    }//GEN-LAST:event_btnEliminarDatosUsuariosActionPerformed

    private void btnVerZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerZombiesActionPerformed
        Lista_Zombies lp = Global.getInstance().zombies;
          if (lp == null)
        {
            lp = new Lista_Zombies();
        }
        Global.getInstance().zombies = lp;
        area1.setText(Global.getInstance().zombies.recorrer_Zombies());
    }//GEN-LAST:event_btnVerZombiesActionPerformed

    private void btnInsertarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPlantaActionPerformed
        CatalogoPlantas cp = new CatalogoPlantas();
        cp.setVisible(true);
    }//GEN-LAST:event_btnInsertarPlantaActionPerformed

    private void btnInsertarZombiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarZombiesActionPerformed
        CatalogoZombies cz = new CatalogoZombies();
        cz.setVisible(true);
    }//GEN-LAST:event_btnInsertarZombiesActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
      //  Tiempo t = new Tiempo();
        ListaPlantas lp = Global.getInstance().plantas;
        Cola c = Global.getInstance().cola;
        int a = (Integer)Global.getInstance().cantidad_Planta ;
        for (int i = 0; i<=a; i++)
        {
        //    t.sacar();
      Global.getInstance().plantas.sacarDatos();
      //if (c == null)
   /*     {
            c = new Cola();
        }
    c.insertarCola(Global.getInstance().plantas.imag, Global.getInstance().plantas.nom,Global.getInstance().plantas.tipa,Global.getInstance().plantas.puA , Global.getInstance().plantas.puD);
        }
          
        Global.getInstance().cola = c;
        area.setText(Global.getInstance().cola.recorrer_cola());
        //System.out.println("nombre: "+ Global.getInstance().plantas.nom);*/
          }
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void btnVerColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerColaActionPerformed
         Cola lp = Global.getInstance().cola;
          if (lp == null)
        {
            lp = new Cola();
        }
        Global.getInstance().cola = lp;
        area3.setText(Global.getInstance().cola.recorrer_cola());

    }//GEN-LAST:event_btnVerColaActionPerformed

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
    private javax.swing.JButton LimpiarForms;
    private javax.swing.JTextArea area;
    private javax.swing.JTextArea area1;
    private javax.swing.JTextArea area2;
    private javax.swing.JTextArea area3;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnEliminarDatosUsuarios;
    private javax.swing.JButton btnInsertarPlanta;
    private javax.swing.JButton btnInsertarZombies;
    private javax.swing.JButton btnJugadorPlantas;
    private javax.swing.JButton btnJugadorZombies;
    private javax.swing.JButton btnVerCola;
    private javax.swing.JButton btnVerPlantas;
    private javax.swing.JButton btnVerUsuario;
    private javax.swing.JButton btnVerZombies;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
