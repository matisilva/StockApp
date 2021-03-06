package NCRHelper;

import javax.swing.*;
import java.sql.*;


/**
 *
 * @author Matias Silva
 */
public class altaSucursales extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    public altaSucursales() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM mydatabase.empresasClientes;";
            ResultSet queryset = stmt.executeQuery(query);
            while (queryset.next()) {
                String nombre = queryset.getString("nombreCliente");

                clienteCombo.addItem(nombre);
            }
            query = "SELECT * FROM mydatabase.localidad;";
            queryset = stmt.executeQuery(query);
            while (queryset.next()) {
                String nombre = queryset.getString("nombreLocalidad");
                localCombo.addItem(nombre);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
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
        idText = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        clienteCombo = new javax.swing.JComboBox<>();
        localCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NCR manager");
        setName("NCR stock manager"); // NOI18N

        jLabel1.setText("Nombre:");

        altaButton.setText("Dar de alta");
        altaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Formulario de nueva Sucursal");

        jLabel2.setText("Cliente:");

        jLabel3.setText("Localidad:");

        jLabel4.setText("ID:");

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
                        .addComponent(title)
                        .addGap(0, 230, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idText)
                            .addComponent(clienteCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(localCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameText, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(localCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clienteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(altaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaButtonActionPerformed
        String selectedLocation = localCombo.getSelectedItem().toString();
        String  selectedClient = clienteCombo.getSelectedItem().toString();
        String indexLocation ="";
        String indexClient="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT idLocalidad FROM mydatabase.localidad where nombreLocalidad='"+selectedLocation +"';";
            ResultSet queryset = stmt.executeQuery(query);
            while (queryset.next()){
                indexLocation = queryset.getString("idLocalidad");
            }
            query = "SELECT idempresasClientes FROM mydatabase.empresasClientes where nombreCliente='"+selectedClient +"';";
            queryset = stmt.executeQuery(query);
            while (queryset.next()){
                indexClient = queryset.getString("idempresasClientes");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "INSERT INTO `mydatabase`.`sucursal` (`idSucursal`,`nombreSucursal`, `localidadSucursal`, `clienteSucursal`) VALUES ('"+ idText.getText() +"','"+ nameText.getText() +"', '"+ indexLocation+"', '"+indexClient+"');";
            stmt.execute(query);
            JOptionPane.showMessageDialog(this, "La nueva sucursal "+nameText.getText()+" ha sido agregado a la base de datos con exito");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_altaButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaButton;
    private javax.swing.JComboBox<String> clienteCombo;
    private java.util.List<NCRHelper.Empresasclientes> empresasclientesList;
    private javax.persistence.Query empresasclientesQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> localCombo;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
