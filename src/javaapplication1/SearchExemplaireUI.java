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
        searchDocImg = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RT | Rechercher Exemplaire");

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

        searchDocImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search Doc 50.png"))); // NOI18N

        title.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        title.setText("Rechercher Exemplaire ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchDocImg)
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(271, 271, 271))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchDocImg)
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
      private void performSearch() {
        
        tableData = new Exemplaires().getExemplaires(this.docId,"all");
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
                errorLabel.setText("Aucun enregistrement trouvé");
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel searchDocImg;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
