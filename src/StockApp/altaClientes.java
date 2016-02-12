package StockApp;

import javax.swing.*;
import java.sql.*;


/**
 *
 * @author Matias Silva
 */
public class altaClientes extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public altaClientes() {
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("mydatabase?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        empresasclientesQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Empresasclientes e");
        empresasclientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : empresasclientesQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        altaButton = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        redCombo = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        verEquiposButton = new javax.swing.JMenu();
        verPartesButton = new javax.swing.JMenu();
        verSucursalesButton = new javax.swing.JMenu();
        verLocalidadesButton = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        altaEquiposButton = new javax.swing.JMenuItem();
        altaPartesButton = new javax.swing.JMenuItem();
        altaLocalidadesButton = new javax.swing.JMenuItem();
        altaSucursalesButton = new javax.swing.JMenuItem();
        altaPuestosButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NCR stock manager");
        setName("NCR stock manager"); // NOI18N

        jLabel1.setText("Nombre del Cliente");

        altaButton.setText("Dar de alta");
        altaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Red:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Formulario de nuevo Cliente");

        redCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Link", "Banelco" }));
        redCombo.setSelectedIndex(1);
        redCombo.setToolTipText("");
        redCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redComboActionPerformed(evt);
            }
        });

        verEquiposButton.setText("Equipos");
        jMenuBar1.add(verEquiposButton);

        verPartesButton.setText("Partes");
        jMenuBar1.add(verPartesButton);

        verSucursalesButton.setText("Sucursales");
        jMenuBar1.add(verSucursalesButton);

        verLocalidadesButton.setText("Localidades");
        jMenuBar1.add(verLocalidadesButton);

        jMenu5.setText("Dar de alta");

        altaEquiposButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        altaEquiposButton.setText("Equipos");
        altaEquiposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaEquiposButtonActionPerformed(evt);
            }
        });
        jMenu5.add(altaEquiposButton);

        altaPartesButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        altaPartesButton.setText("Partes");
        jMenu5.add(altaPartesButton);

        altaLocalidadesButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        altaLocalidadesButton.setText("Localidades");
        jMenu5.add(altaLocalidadesButton);

        altaSucursalesButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        altaSucursalesButton.setText("Sucursales");
        altaSucursalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaSucursalesButtonActionPerformed(evt);
            }
        });
        jMenu5.add(altaSucursalesButton);

        altaPuestosButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        altaPuestosButton.setText("Puestos");
        jMenu5.add(altaPuestosButton);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(altaButton)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(redCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 247, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(redCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(altaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaEquiposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaEquiposButtonActionPerformed
        this.setVisible(false);
        new altaClientes().setVisible(true);
    }//GEN-LAST:event_altaEquiposButtonActionPerformed

    private void altaSucursalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaSucursalesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altaSucursalesButtonActionPerformed

    private void altaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaButtonActionPerformed
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String red = redCombo.getSelectedItem().toString();
            String query = "INSERT INTO `mydatabase`.`empresasclientes` (`nombreCliente`,`redCliente`) VALUES ('"+ nameText.getText() +"','"+ red +"');";
            stmt.execute(query);
            JOptionPane.showMessageDialog(this, "El nuevo cliente ha sido agregado a la base de datos con exito");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_altaButtonActionPerformed

    private void redComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redComboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaButton;
    private javax.swing.JMenuItem altaEquiposButton;
    private javax.swing.JMenuItem altaLocalidadesButton;
    private javax.swing.JMenuItem altaPartesButton;
    private javax.swing.JMenuItem altaPuestosButton;
    private javax.swing.JMenuItem altaSucursalesButton;
    private java.util.List<StockApp.Empresasclientes> empresasclientesList;
    private javax.persistence.Query empresasclientesQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox<String> redCombo;
    private javax.swing.JMenu verEquiposButton;
    private javax.swing.JMenu verLocalidadesButton;
    private javax.swing.JMenu verPartesButton;
    private javax.swing.JMenu verSucursalesButton;
    // End of variables declaration//GEN-END:variables

}
