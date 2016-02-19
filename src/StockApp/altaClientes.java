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
        title = new javax.swing.JLabel();
        redCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        categoriaCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();

        setTitle("NCR manager");
        setName("NCR stock manager"); // NOI18N

        jLabel1.setText("Nombre del Cliente");

        altaButton.setText("Dar de alta");
        altaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Red:");

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Formulario de nuevo Cliente");

        redCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Link", "Banelco", "Propia" }));
        redCombo.setToolTipText("");
        redCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redComboActionPerformed(evt);
            }
        });

        jLabel4.setText("Categoria");

        categoriaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finanza", "Retail" }));

        jLabel2.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 446, Short.MAX_VALUE)
                        .addComponent(altaButton)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(redCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(categoriaCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idText, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title)
                                .addGap(0, 246, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(categoriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(altaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaButtonActionPerformed
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String red = redCombo.getSelectedItem().toString();
            String categoria = categoriaCombo.getSelectedItem().toString();
            String query = "INSERT INTO `mydatabase`.`empresasclientes` (`nombreCliente`,`idempresasClientes`,`categoria`,`redCliente`) VALUES ('"+ nameText.getText() +"','"+ idText.getText() +"','"+categoria+"','"+ red +"');";
            stmt.execute(query);
            JOptionPane.showMessageDialog(this, "El nuevo cliente "+nameText.getText()+" ha sido agregado a la base de datos con exito");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_altaButtonActionPerformed

    private void redComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaButton;
    private javax.swing.JComboBox<String> categoriaCombo;
    private java.util.List<StockApp.Empresasclientes> empresasclientesList;
    private javax.persistence.Query empresasclientesQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox<String> redCombo;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
