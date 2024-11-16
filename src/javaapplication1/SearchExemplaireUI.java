/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.sql.*;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author lenovo
 */
public class SearchExemplaireUI extends javax.swing.JFrame {
String docId;
Object[][] tableData = null;

    /**
     * Creates new form SearchDocumentUI
     * @param docId
     */
    public SearchExemplaireUI(String docId) {
       
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLocationRelativeTo(null);
        this.docId=docId;
        performSearch();
    }
    public SearchExemplaireUI() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
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
        errorLabel = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        searchDocImg = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

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

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));

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
        title.setText("Exemplaire ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchDocImg)))
                .addGap(258, 258, 258)
                .addComponent(homeBtn))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeBtn)
                    .addComponent(returnBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchDocImg)))
                .addGap(18, 18, 18)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
 
 
    }//GEN-LAST:event_homeBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed

        

    }//GEN-LAST:event_returnBtnActionPerformed
      private void performSearch() {
        System.out.println(docId);
        tableData = new Exemplaires().getExemplaires(this.docId);
            if (tableData != null && tableData.length > 0) {
                    errorLabel.setText(""); 
                    docTable.setModel(new javax.swing.table.DefaultTableModel(
                        tableData,
                        new String[]{"ID","Doc","Cote","Titre","Auteur","Placard","Etagere","Statut"} 
                    ){
                        public boolean isCellEditable(int row, int column) {
                            return false;
                        }
                    });
                } else {
                errorLabel.setText("No records found");
                        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"ID","Doc", "Cote", "Titre", "Auteur", "Placard", "Etagere", "Statut"}
        ));
                    } 
                TableColumnModel columnModel = docTable.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(20);
                columnModel.getColumn(1).setPreferredWidth(20);
    }
    
          
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable docTable;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton homeBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel searchDocImg;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}