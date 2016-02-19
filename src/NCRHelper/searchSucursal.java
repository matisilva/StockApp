package NCRHelper;

import java.sql.*;
import javax.swing.*;

public class searchSucursal extends javax.swing.JFrame {

    final void FillList(){     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM mydatabase.sucursal;";
            ResultSet queryset = stmt.executeQuery(query);
            DefaultListModel DLM = new DefaultListModel();
            while (queryset.next()) {
                DLM.addElement(queryset.getString("idSucursal"));
            }
            List1.setModel(DLM);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        FillCount();
    }
    
    final void FillLocalidad(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT idLocalidad FROM mydatabase.localidad;";
            ResultSet queryset = stmt.executeQuery(query);
            while (queryset.next()) {
                localidadCombo.addItem(queryset.getString("idLocalidad"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }
    
    final void FillCliente(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT idempresasClientes FROM mydatabase.empresasclientes;";
            ResultSet queryset = stmt.executeQuery(query);
            while (queryset.next()) {
                clienteCombo.addItem(queryset.getString("idempresasClientes"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }

    final void FillCount(){
        Integer count = List1.getModel().getSize();
        countText.setText(count.toString());
    }
        
    public searchSucursal() {
        initComponents();
        clienteLabel.setVisible(false);
        localidadLabel.setVisible(false);
        okButton.setVisible(false);
        backButton.setVisible(false);
        modifyButton.setVisible(false);
        clienteCombo.setVisible(false);
        localidadCombo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        localidadText = new javax.swing.JTextField();
        allButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        okButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        localidadFilter = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clienteCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        clienteText = new javax.swing.JTextField();
        countText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menoresButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        distanciaText = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        localidadCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        localidadFilter1 = new javax.swing.JTextField();
        localidadLabel = new javax.swing.JLabel();
        clienteLabel = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NCR manager");

        jLabel2.setText("Localidad:");

        idText.setEditable(false);
        idText.setEnabled(false);

        localidadText.setEditable(false);
        localidadText.setEnabled(false);

        allButton.setText("Buscar todos");
        allButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allButtonActionPerformed(evt);
            }
        });

        filterButton.setText("Filtrar");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        List1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                List1PropertyChange(evt);
            }
        });
        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(List1);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        modifyButton.setText("Modificar");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        localidadFilter.setToolTipText("partNumber");

        nameText.setEnabled(false);

        jLabel3.setText("Nombre:");

        jLabel4.setText("ID(unico):");

        clienteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NULL" }));
        clienteCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteComboActionPerformed(evt);
            }
        });

        jLabel5.setText("Cliente:");

        clienteText.setEnabled(false);

        countText.setText("0");

        jLabel6.setText("Total:");

        menoresButton.setText("Distantes <");
        menoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menoresButtonActionPerformed(evt);
            }
        });

        distanciaText.setText("0");
        distanciaText.setToolTipText("solo distancias");
        jScrollPane4.setViewportView(distanciaText);

        jLabel1.setText("KM");

        localidadCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NULL" }));
        localidadCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadComboActionPerformed(evt);
            }
        });

        jLabel7.setText("Localidad:");

        jLabel8.setText("Cliente:");

        localidadFilter1.setToolTipText("partNumber");

        localidadLabel.setText("localidad");

        clienteLabel.setText("cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameText)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(okButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(filterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(allButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modifyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(localidadFilter, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menoresButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(localidadFilter1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(clienteLabel)
                                            .addComponent(localidadLabel)))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(localidadText)
                            .addComponent(clienteText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localidadCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addComponent(idText))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clienteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(localidadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localidadCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localidadLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(clienteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clienteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clienteLabel))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menoresButton)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localidadFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addComponent(localidadFilter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(allButton)
                        .addGap(21, 21, 21)
                        .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countText)
                    .addComponent(jLabel6))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allButtonActionPerformed
        FillList();
        FillCount();
    }//GEN-LAST:event_allButtonActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query;
            if (localidadFilter.getText().isEmpty()){
                query = "SELECT * FROM mydatabase.equipo";
            } else  {
                query = "SELECT * FROM mydatabase.equipo WHERE modelo='"+localidadFilter.getText()+"';";

            }
            ResultSet queryset = stmt.executeQuery(query);
            DefaultListModel DLM = new DefaultListModel();
            while (queryset.next()) {
                DLM.addElement(queryset.getString("serial"));
            }
            List1.setModel(DLM);
            FillCount();
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_filterButtonActionPerformed

    private void List1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_List1PropertyChange
    }//GEN-LAST:event_List1PropertyChange

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        FillCount();
        modifyButton.setVisible(true);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM mydatabase.sucursal where idSucursal="+List1.getSelectedValue()+";";
            ResultSet queryset = stmt.executeQuery(query);
            while (queryset.next()){
                localidadText.setText(queryset.getString("localidadSucursal"));
                idText.setText(queryset.getString("idSucursal"));
                clienteText.setText(queryset.getString("clienteSucursal"));
                nameText.setText(queryset.getString("nombreSucursal"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        clienteLabel.setVisible(false);
        localidadLabel.setVisible(false);
        okButton.setVisible(false);
        clienteCombo.setVisible(false);
        localidadCombo.setVisible(false);
        backButton.setVisible(false);
        modifyButton.setVisible(true);
        localidadText.setEnabled(false);
        nameText.setEnabled(false);
        idText.setEnabled(false);
        String query ;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            query = "UPDATE `mydatabase`.`sucursal` SET `idSucursal`='"+idText.getText()+"', `nombreSucursal`='"+nameText.getText()+"',`localidadSucursal`='"+localidadText.getText()+"' ,`clienteSucursal`='"+clienteText.getText()+"' WHERE `idSucursal`='"+List1.getSelectedValue()+"';";
            stmt.execute(query);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        clienteLabel.setVisible(true);
        localidadLabel.setVisible(true);
        clienteCombo.setVisible(true);
        localidadCombo.setVisible(true);
        FillCliente();
        FillLocalidad();
        idText.setEnabled(true);
        nameText.setEnabled(true);
        modifyButton.setVisible(false);
        okButton.setVisible(true);
        backButton.setVisible(true);

    }//GEN-LAST:event_modifyButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        okButton.setVisible(false);
        backButton.setVisible(false);
        modifyButton.setVisible(true);
        localidadText.setEnabled(false);
        nameText.setEnabled(false);
        idText.setEnabled(false);
        clienteCombo.setVisible(false);
        localidadCombo.setVisible(false);
        clienteLabel.setVisible(false);
        localidadLabel.setVisible(false);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void clienteComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteComboActionPerformed
        if (!clienteCombo.getSelectedItem().toString().equals("NULL")){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
                Statement stmt = con.createStatement();
                String query;
                query = "SELECT * FROM mydatabase.empresasClientes WHERE `idempresasClientes`= '"+clienteCombo.getSelectedItem().toString()+"';";
                ResultSet queryset = stmt.executeQuery(query);
                while(queryset.next()){
                    clienteText.setText(queryset.getString("idempresasClientes"));
                    clienteLabel.setText(queryset.getString("nombreCliente"));
                }
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.toString());
            }
        } else {
            clienteText.setText("NULL");
            clienteLabel.setText("");
        }

    }//GEN-LAST:event_clienteComboActionPerformed

    private void localidadComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidadComboActionPerformed
        if (!localidadCombo.getSelectedItem().toString().equals("NULL")){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
                Statement stmt = con.createStatement();
                String query;
                query = "SELECT * FROM mydatabase.localidad WHERE `idLocalidad`= '"+localidadCombo.getSelectedItem().toString()+"';";
                ResultSet queryset = stmt.executeQuery(query);
                while(queryset.next()){
                    localidadText.setText(queryset.getString("idLocalidad"));
                    localidadLabel.setText(queryset.getString("nombreLocalidad"));
                }
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.toString());
            }
        } else {
            localidadText.setText("NULL");
            localidadLabel.setText("");
        }
    }//GEN-LAST:event_localidadComboActionPerformed

    private void menoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menoresButtonActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT distinct `serial` FROM mydatabase.equipo inner join mydatabase.sucursal inner join mydatabase.localidad where localidad.distanciaNeuquen<"+distanciaText.getText()+";";
            ResultSet queryset = stmt.executeQuery(query);
            DefaultListModel DLM = new DefaultListModel();
            while (queryset.next()) {
                DLM.addElement(queryset.getString("serial"));
            }
            List1.setModel(DLM);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        FillCount();
    }//GEN-LAST:event_menoresButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List1;
    private javax.swing.JButton allButton;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> clienteCombo;
    private javax.swing.JLabel clienteLabel;
    private javax.swing.JTextField clienteText;
    private javax.swing.JLabel countText;
    private javax.swing.JTextPane distanciaText;
    private javax.swing.JButton filterButton;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> localidadCombo;
    private javax.swing.JTextField localidadFilter;
    private javax.swing.JTextField localidadFilter1;
    private javax.swing.JLabel localidadLabel;
    private javax.swing.JTextField localidadText;
    private javax.swing.JButton menoresButton;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

}
