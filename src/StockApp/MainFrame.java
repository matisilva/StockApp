package StockApp;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableColumn;


/**
 *
 * @author Matias Silva
 */
public class MainFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public MainFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        clientes = new javax.swing.JMenuItem();
        equipos = new javax.swing.JMenuItem();
        localidades = new javax.swing.JMenuItem();
        partes = new javax.swing.JMenuItem();
        puestos = new javax.swing.JMenuItem();
        sucursales = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        altaEquiposButton = new javax.swing.JMenuItem();
        altaPartesButton = new javax.swing.JMenuItem();
        altaLocalidadesButton = new javax.swing.JMenuItem();
        altaSucursalesButton = new javax.swing.JMenuItem();
        altaPuestosButton = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NCR stock manager");
        setName("NCR stock manager"); // NOI18N

        jMenu1.setText("Stock");

        clientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        clientes.setText("Clientes");
        clientes.setEnabled(false);
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        jMenu1.add(clientes);

        equipos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        equipos.setText("Equipos");
        equipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equiposActionPerformed(evt);
            }
        });
        jMenu1.add(equipos);

        localidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        localidades.setText("Localidades");
        localidades.setEnabled(false);
        jMenu1.add(localidades);

        partes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        partes.setText("Partes");
        partes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partesActionPerformed(evt);
            }
        });
        jMenu1.add(partes);

        puestos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        puestos.setText("Puestos");
        puestos.setEnabled(false);
        jMenu1.add(puestos);

        sucursales.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        sucursales.setText("Sucursales");
        sucursales.setEnabled(false);
        jMenu1.add(sucursales);

        MenuBar.add(jMenu1);

        jMenu5.setText("Dar de alta");

        altaEquiposButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        altaEquiposButton.setText("Equipos");
        altaEquiposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaEquiposButtonActionPerformed(evt);
            }
        });
        jMenu5.add(altaEquiposButton);

        altaPartesButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        altaPartesButton.setText("Partes");
        altaPartesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPartesButtonActionPerformed(evt);
            }
        });
        jMenu5.add(altaPartesButton);

        altaLocalidadesButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        altaLocalidadesButton.setText("Localidades");
        altaLocalidadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaLocalidadesButtonActionPerformed(evt);
            }
        });
        jMenu5.add(altaLocalidadesButton);

        altaSucursalesButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        altaSucursalesButton.setText("Sucursales");
        altaSucursalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaSucursalesButtonActionPerformed(evt);
            }
        });
        jMenu5.add(altaSucursalesButton);

        altaPuestosButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        altaPuestosButton.setText("Puestos");
        altaPuestosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPuestosButtonActionPerformed(evt);
            }
        });
        jMenu5.add(altaPuestosButton);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        MenuBar.add(jMenu5);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaEquiposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaEquiposButtonActionPerformed
        new altaEquipos().setVisible(true);
    }//GEN-LAST:event_altaEquiposButtonActionPerformed

    private void altaSucursalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaSucursalesButtonActionPerformed
        new altaSucursales().setVisible(true);
    }//GEN-LAST:event_altaSucursalesButtonActionPerformed

    private void altaLocalidadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaLocalidadesButtonActionPerformed
        new altaLocalidades().setVisible(true);
    }//GEN-LAST:event_altaLocalidadesButtonActionPerformed

    private void altaPuestosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPuestosButtonActionPerformed
        new altaPuestos().setVisible(true);
    }//GEN-LAST:event_altaPuestosButtonActionPerformed

    private void altaPartesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPartesButtonActionPerformed
        new altaPartes().setVisible(true);
    }//GEN-LAST:event_altaPartesButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new altaClientes().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed

    }//GEN-LAST:event_clientesActionPerformed

    private void partesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partesActionPerformed
        new searchPart().setVisible(true);
    }//GEN-LAST:event_partesActionPerformed

    private void equiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equiposActionPerformed
        new searchEquipos().setVisible(true);
    }//GEN-LAST:event_equiposActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem altaEquiposButton;
    private javax.swing.JMenuItem altaLocalidadesButton;
    private javax.swing.JMenuItem altaPartesButton;
    private javax.swing.JMenuItem altaPuestosButton;
    private javax.swing.JMenuItem altaSucursalesButton;
    private javax.swing.JMenuItem clientes;
    private javax.swing.JMenuItem equipos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem localidades;
    private javax.swing.JMenuItem partes;
    private javax.swing.JMenuItem puestos;
    private javax.swing.JMenuItem sucursales;
    // End of variables declaration//GEN-END:variables

}
