package StockApp;

import java.sql.*;
import javax.swing.*;

public class searchEquipos extends javax.swing.JFrame {

    final void FillList(){     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM mydatabase.equipo;";
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
    }
    
    final void FillSucursal(){     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT idSucursal FROM mydatabase.sucursal;";
            ResultSet queryset = stmt.executeQuery(query);
            while (queryset.next()) {
                sucursalCombo.addItem(queryset.getString("idSucursal"));
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }
    final void FillCount(){
        Integer count = List1.getModel().getSize();
        countText.setText(count.toString());
        System.out.println(List1.getComponentCount());
    }
        
    public searchEquipos() {
        initComponents();
        okButton.setVisible(false);
        backButton.setVisible(false);
        modifyButton.setVisible(false);
        sucursalCombo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        serialText = new javax.swing.JTextField();
        descriptionText = new javax.swing.JTextField();
        vigenteCheck = new javax.swing.JCheckBox();
        allButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        okButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        modeloFilter = new javax.swing.JTextField();
        modeloText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sucursalCombo = new javax.swing.JComboBox<>();
        nombreSucursal = new javax.swing.JLabel();
        clienteSucursal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sucursalText = new javax.swing.JTextField();
        countText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        neutralesButton = new javax.swing.JButton();
        menoresButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        distanciaText = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NCR manager");

        jLabel2.setText("Descripcion:");

        serialText.setEditable(false);
        serialText.setEnabled(false);

        descriptionText.setEditable(false);
        descriptionText.setEnabled(false);

        vigenteCheck.setSelected(true);
        vigenteCheck.setText("En actividad");
        vigenteCheck.setEnabled(false);
        vigenteCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vigenteCheckActionPerformed(evt);
            }
        });

        allButton.setText("Buscar todos");
        allButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allButtonActionPerformed(evt);
            }
        });

        filterButton.setText("Buscar (modelo)");
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

        modeloFilter.setToolTipText("partNumber");

        modeloText.setEnabled(false);

        jLabel3.setText("Modelo:");

        jLabel4.setText("Serial(unico):");

        sucursalCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NULL" }));
        sucursalCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalComboActionPerformed(evt);
            }
        });

        nombreSucursal.setText("nombreSucursal");

        clienteSucursal.setText("clienteSucursal");

        jLabel5.setText("Sucursal:");

        sucursalText.setEnabled(false);

        countText.setText("0");

        jLabel6.setText("Total:");

        neutralesButton.setText("Neutrales");
        neutralesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neutralesButtonActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(vigenteCheck))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modeloText)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sucursalText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sucursalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(descriptionText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(clienteSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(63, 63, 63))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(countText)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(okButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(filterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(allButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modifyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modeloFilter, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(neutralesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menoresButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(serialText)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(modeloText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sucursalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sucursalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreSucursal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clienteSucursal))
                    .addComponent(vigenteCheck))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(neutralesButton)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menoresButton)
                        .addGap(42, 42, 42)
                        .addComponent(modeloFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vigenteCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vigenteCheckActionPerformed
    }//GEN-LAST:event_vigenteCheckActionPerformed

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
            if (modeloFilter.getText().isEmpty()){
                query = "SELECT * FROM mydatabase.equipo";
            } else  {
                query = "SELECT * FROM mydatabase.equipo WHERE modelo='"+modeloFilter.getText()+"';";

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
        try {
            nombreSucursal.setVisible(true);
            clienteSucursal.setVisible(true);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM mydatabase.equipo where serial="+List1.getSelectedValue()+";";
            ResultSet queryset = stmt.executeQuery(query);
            while (queryset.next()){
                descriptionText.setText(queryset.getString("descripcionEquipo"));
                serialText.setText(queryset.getString("serial"));
                sucursalText.setText(queryset.getString("sucursal"));
                modeloText.setText(queryset.getString("modelo"));
                if ("active".equals(queryset.getString("vigencia"))) {
                    vigenteCheck.setSelected(true);
                } else {
                    vigenteCheck.setSelected(false);
                }
            }
            query = "SELECT * FROM mydatabase.sucursal WHERE idSucursal='"+sucursalText.getText()+"';";
            queryset = stmt.executeQuery(query);
            while (queryset.next()){
                nombreSucursal.setText(queryset.getString("nombreSucursal"));
                clienteSucursal.setText(queryset.getString("clienteSucursal"));
            }
            if (sucursalText.getText().isEmpty()){
                nombreSucursal.setText("nombreSucursal");
                clienteSucursal.setText("clienteSucursal");
            }
            modifyButton.setVisible(true);
            vigenteCheck.setEnabled(false);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        okButton.setVisible(false);
        sucursalCombo.setVisible(false);
        backButton.setVisible(false);
        modifyButton.setVisible(true);
        descriptionText.setEnabled(false);
        vigenteCheck.setEnabled(false);
        modeloText.setEnabled(false);
        serialText.setEnabled(false);
        String query ;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            if (sucursalText.getText().equals("NULL")){
                if (vigenteCheck.isSelected()){
                    query = "UPDATE `mydatabase`.`equipo` SET `descripcionEquipo`='"+descriptionText.getText()+"', `vigencia`='active',`modelo`='"+modeloText.getText()+"' ,`serial`='"+serialText.getText()+"',`sucursal`="+sucursalText.getText()+" WHERE `serial`='"+List1.getSelectedValue()+"';";
                }else{
                    query = "UPDATE `mydatabase`.`equipo` SET `descripcionEquipo`='"+descriptionText.getText()+"', `vigencia`='obsolete',`modelo`='"+modeloText.getText()+"' ,`serial`='"+serialText.getText()+"',`sucursal`="+sucursalText.getText()+" WHERE `serial`='"+List1.getSelectedValue()+"';";
                }
            } else {
                if (vigenteCheck.isSelected()){
                    query = "UPDATE `mydatabase`.`equipo` SET `descripcionEquipo`='"+descriptionText.getText()+"', `vigencia`='active',`modelo`='"+modeloText.getText()+"' ,`serial`='"+serialText.getText()+"',`sucursal`='"+sucursalText.getText()+"' WHERE `serial`='"+List1.getSelectedValue()+"';";
                }else{
                    query = "UPDATE `mydatabase`.`equipo` SET `descripcionEquipo`='"+descriptionText.getText()+"', `vigencia`='obsolete',`modelo`='"+modeloText.getText()+"' ,`serial`='"+serialText.getText()+"',`sucursal`='"+sucursalText.getText()+"' WHERE `serial`='"+List1.getSelectedValue()+"';";
                }
            }
            stmt.execute(query);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        descriptionText.setEditable(true);
        descriptionText.setEnabled(true);
        vigenteCheck.setEnabled(true);
        sucursalCombo.setVisible(true);
        FillSucursal();
        serialText.setEnabled(true);
        modeloText.setEnabled(true);
        modifyButton.setVisible(false);
        okButton.setVisible(true);
        backButton.setVisible(true);

    }//GEN-LAST:event_modifyButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        okButton.setVisible(false);
        backButton.setVisible(false);
        modifyButton.setVisible(true);
        descriptionText.setEnabled(false);
        vigenteCheck.setEnabled(false);
        modeloText.setEnabled(false);
        serialText.setEnabled(false);
        sucursalCombo.setVisible(false);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void sucursalComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalComboActionPerformed
        if (!sucursalCombo.getSelectedItem().toString().equals("NULL")){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
                Statement stmt = con.createStatement();
                String query;
                query = "SELECT * FROM mydatabase.sucursal WHERE `idSucursal`= '"+sucursalCombo.getSelectedItem().toString()+"';";
                ResultSet queryset = stmt.executeQuery(query);
                while(queryset.next()){
                    sucursalText.setText(queryset.getString("idSucursal"));
                    clienteSucursal.setVisible(true);
                    nombreSucursal.setVisible(true);
                    nombreSucursal.setText(queryset.getString("nombreSucursal"));
                    clienteSucursal.setText(queryset.getString("clienteSucursal"));
                }
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.toString());
            }
        } else {
            nombreSucursal.setVisible(false);
            clienteSucursal.setVisible(false);
            sucursalText.setText("NULL");
        }

    }//GEN-LAST:event_sucursalComboActionPerformed

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

    private void neutralesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neutralesButtonActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT `serial` FROM mydatabase.equipo WHERE `sucursal` is NULL;";
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
    }//GEN-LAST:event_neutralesButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List1;
    private javax.swing.JButton allButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel clienteSucursal;
    private javax.swing.JLabel countText;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JTextPane distanciaText;
    private javax.swing.JButton filterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton menoresButton;
    private javax.swing.JTextField modeloFilter;
    private javax.swing.JTextField modeloText;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton neutralesButton;
    private javax.swing.JLabel nombreSucursal;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField serialText;
    private javax.swing.JComboBox<String> sucursalCombo;
    private javax.swing.JTextField sucursalText;
    private javax.swing.JCheckBox vigenteCheck;
    // End of variables declaration//GEN-END:variables

}
