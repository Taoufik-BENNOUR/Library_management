/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.sql.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author lenovo
 */
public class SearchDocumentUI extends javax.swing.JFrame {
String selectedCriteria="";
Object[][] tableData = null;
String currentUser = (CurrentUser.instance != null && CurrentUser.instance.getUsername() != null) ? CurrentUser.instance.getUsername() : null;

    /**
     * Creates new form SearchDocumentUI
     */
    public SearchDocumentUI() {
        initComponents();
        setLocationRelativeTo(null);
        performSearch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        docTable = new javax.swing.JTable();
        queryInput = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        errorLabel = new javax.swing.JLabel();
        searchBtn = new javax.swing.JToggleButton();
        homeBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        searchDocImg = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        checkExpBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        docTable.getTableHeader().setBackground(new java.awt.Color(0, 153, 51));
        docTable.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        docTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jScrollPane1.setViewportView(docTable);

        queryInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryInputActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selectionner", "id", "cote", "titre", "auteur", "theme", "etat", "type" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        homeBtn.setBackground(new Color(0, 0, 0, 0));
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_icon.png"))); // NOI18N
        homeBtn.setBorder(null);
        homeBtn.setBorderPainted(false);
        homeBtn.setFocusPainted(false);
        homeBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home icon 50.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        returnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return_icon.png"))); // NOI18N
        returnBtn.setAlignmentY(0.0F);
        returnBtn.setBorderPainted(false);
        returnBtn.setFocusPainted(false);
        returnBtn.setFocusable(false);
        returnBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        returnBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        returnBtn.setRequestFocusEnabled(false);
        returnBtn.setRolloverEnabled(false);
        returnBtn.setVerifyInputWhenFocusTarget(false);
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        searchDocImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search Doc 50.png"))); // NOI18N

        title.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 204));
        title.setText("Rechercher Document");

        checkExpBtn.setBackground(new java.awt.Color(0, 0, 0));
        checkExpBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkExpBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkExpBtn.setText("Voir Exemplaire");
        checkExpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkExpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkExpBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(queryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(returnBtn)
                .addGap(259, 259, 259)
                .addComponent(searchDocImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeBtn))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(homeBtn)
                            .addComponent(returnBtn))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchDocImg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(queryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtn)
                        .addComponent(checkExpBtn))
                    .addComponent(errorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queryInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryInputActionPerformed
          performSearch();
    }//GEN-LAST:event_queryInputActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
            selectedCriteria = (String) jComboBox1.getSelectedItem();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
       performSearch();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
            if(currentUser!=null){
            new AdminDashboardUI().setVisible(true);
            dispose(); 
        }else{
              new Welcome().setVisible(true);
              dispose();
        }
 
    }//GEN-LAST:event_homeBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
      if(currentUser!=null){
        new DocumentManagementUI().setVisible(true);
        dispose();
        }else{
        homeBtn.setVisible(false);   
        new Welcome().setVisible(true);
        dispose();
        }
        

    }//GEN-LAST:event_returnBtnActionPerformed

    private void checkExpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkExpBtnActionPerformed
        int selectedRow = docTable.getSelectedRow(); 
           
    if (selectedRow != -1) {
         DefaultTableModel model = (DefaultTableModel) docTable.getModel();
         Object id = model.getValueAt(selectedRow, 0);
        new SearchExemplaireUI((String)id).setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row first.");
    }
    }//GEN-LAST:event_checkExpBtnActionPerformed
      private void performSearch() {
        String query = queryInput.getText();
       
        tableData = new Documents().getDocuments(query, selectedCriteria);
            if (tableData != null && tableData.length > 0) {
                    errorLabel.setText(""); 
                    docTable.setModel(new javax.swing.table.DefaultTableModel(
                        tableData,
                        new String[]{"ID","Cote","Titre","Auteur","Theme","Date","Type","Diplome","Editeur","ISBN", "Etat"} 
                    ){
    public boolean isCellEditable(int row, int column) {
        return false;
    }
});
                } else {
                errorLabel.setText("No records found");
                    } 
                TableColumnModel columnModel = docTable.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(20);
                columnModel.getColumn(1).setPreferredWidth(20);
    }
    
          
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton checkExpBtn;
    private javax.swing.JTable docTable;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton homeBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField queryInput;
    private javax.swing.JButton returnBtn;
    private javax.swing.JToggleButton searchBtn;
    private javax.swing.JLabel searchDocImg;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
