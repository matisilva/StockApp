package StockApp;

import java.sql.*;
import javax.swing.*;

public class searchPart extends javax.swing.JFrame {

    final void FillList(){     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM mydatabase.parte;";
            ResultSet queryset = stmt.executeQuery(query);
            DefaultListModel DLM = new DefaultListModel();
            while (queryset.next()) {
                DLM.addElement(queryset.getString(1)+" - "+queryset.getString(2));
            }
            List1.setModel(DLM);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }
    public searchPart() {
        initComponents();
        okButton.setVisible(false);
        backButton.setVisible(false);
        modifyButton.setVisible(false);
        comboEquipo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        equipoLabel = new javax.swing.JLabel();
        equipoText = new javax.swing.JTextField();
        descriptionText = new javax.swing.JTextField();
        partNumberText = new javax.swing.JTextField();
        comboEquipo = new javax.swing.JComboBox<>();
        altaDisponibleCheck = new javax.swing.JCheckBox();
        allButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        okButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        partNumberFilter = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NCR stock manager");

        jLabel1.setText("Descripcion:");

        jLabel2.setText("Numero de parte:");

        equipoLabel.setText("Equipo:");

        equipoText.setEditable(false);
        equipoText.setEnabled(false);
        equipoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoTextActionPerformed(evt);
            }
        });

        descriptionText.setEditable(false);
        descriptionText.setEnabled(false);

        partNumberText.setEditable(false);
        partNumberText.setEnabled(false);

        comboEquipo.setEditable(true);
        comboEquipo.setEnabled(false);

        altaDisponibleCheck.setSelected(true);
        altaDisponibleCheck.setText("Disponible");
        altaDisponibleCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaDisponibleCheckActionPerformed(evt);
            }
        });

        allButton.setText("Buscar todos");
        allButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allButtonActionPerformed(evt);
            }
        });

        filterButton.setText("Buscar");
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

        partNumberFilter.setToolTipText("partNumber");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(okButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(backButton))
                        .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filterButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partNumberFilter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(587, 587, 587)
                        .addComponent(altaDisponibleCheck))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(equipoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equipoText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(partNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(descriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(partNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(altaDisponibleCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180)
                        .addComponent(partNumberFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaDisponibleCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaDisponibleCheckActionPerformed
        if (altaDisponibleCheck.isSelected()) {
            comboEquipo.setEnabled(false);
        } else{
            comboEquipo.setEnabled(true);

        }
    }//GEN-LAST:event_altaDisponibleCheckActionPerformed

    private void allButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allButtonActionPerformed
        FillList();
    }//GEN-LAST:event_allButtonActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM mydatabase.parte WHERE partNumber='"+partNumberFilter.getText()+"';";
            ResultSet queryset = stmt.executeQuery(query);
            DefaultListModel DLM = new DefaultListModel();
            while (queryset.next()) {
                DLM.addElement(queryset.getString(1)+" - "+queryset.getString(2));
            }
            List1.setModel(DLM);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_filterButtonActionPerformed

    private void List1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_List1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_List1PropertyChange

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM mydatabase.parte where idparte="+List1.getSelectedValue().charAt(0)+";";
            ResultSet queryset = stmt.executeQuery(query);
            while (queryset.next()){
                descriptionText.setText(queryset.getString("descripcionParte"));
                partNumberText.setText(queryset.getString("partNumber"));
                equipoText.setText(queryset.getString("equipoInstalado"));
                if ("yes".equals(queryset.getString("disponible"))) {
                    altaDisponibleCheck.setSelected(true);
                } else {
                    altaDisponibleCheck.setSelected(false);
                }
            }
            modifyButton.setVisible(true);
            altaDisponibleCheck.setEnabled(false);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_List1ValueChanged

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        okButton.setVisible(false);
        backButton.setVisible(false);
        modifyButton.setVisible(true);
        descriptionText.setEnabled(false);
        partNumberText.setEnabled(false);
        comboEquipo.setEnabled(false);
        String query = "";
        comboEquipo.setVisible(false);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            if (altaDisponibleCheck.isSelected()){
                query = "UPDATE `mydatabase`.`parte` SET `partNumber`='"+partNumberText.getText()+"', `descripcionParte`='"+ descriptionText.getText()+"', `equipoInstalado`="+"NULL"+", `disponible`='yes' WHERE `idparte`='"+List1.getSelectedValue().charAt(0)+"';";
            }else{
                query = "UPDATE `mydatabase`.`parte` SET `partNumber`='"+partNumberText.getText()+"', `descripcionParte`='"+ descriptionText.getText()+"', `equipoInstalado`='"+comboEquipo.getSelectedItem().toString().charAt(0)+"', `disponible`='no' WHERE `idparte`='"+List1.getSelectedValue().charAt(0)+"';";            
            }
            stmt.execute(query);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void equipoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipoTextActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        descriptionText.setEditable(true);
        partNumberText.setEditable(true);
        descriptionText.setEnabled(true);
        partNumberText.setEnabled(true);
        comboEquipo.setEnabled(true);
        altaDisponibleCheck.setEnabled(true);
        modifyButton.setVisible(false);
        okButton.setVisible(true);
        backButton.setVisible(true);
        comboEquipo.setVisible(true);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "matias18");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM mydatabase.equipo;";
            ResultSet queryset = stmt.executeQuery(query);
            while (queryset.next()) {
                String nombre = queryset.getString("descripcionEquipo");
                Integer index = queryset.getInt("idequipo");
                comboEquipo.addItem(index.toString() + "-"+nombre);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }

    }//GEN-LAST:event_modifyButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        okButton.setVisible(false);
        backButton.setVisible(false);
        modifyButton.setVisible(true);
        descriptionText.setEnabled(false);
        partNumberText.setEnabled(false);
        comboEquipo.setEnabled(false);
        altaDisponibleCheck.setEnabled(false);
        comboEquipo.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List1;
    private javax.swing.JButton allButton;
    private javax.swing.JCheckBox altaDisponibleCheck;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> comboEquipo;
    private javax.swing.JTextField descriptionText;
    private javax.swing.JLabel equipoLabel;
    private javax.swing.JTextField equipoText;
    private javax.swing.JButton filterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField partNumberFilter;
    private javax.swing.JTextField partNumberText;
    // End of variables declaration//GEN-END:variables

}
