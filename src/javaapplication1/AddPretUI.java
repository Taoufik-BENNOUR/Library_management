/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.sql.*;
import java.util.ArrayList;
import java.awt.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author lenovo
 */
public class AddPretUI extends javax.swing.JFrame {
String selectedCriteria="id";
Object[][] expTableData = null;
Object[][] subTableData = null;

    /**
     * Creates new form SearchDocumentUI
     */
  
    public AddPretUI() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLocationRelativeTo(null);
        performSearchExemplaires();
        performSearchSubscriber();
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
        successLabel = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        searchDocImg = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        expSearchBtn = new javax.swing.JButton();
        queryInput = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        subscriberTable = new javax.swing.JTable();
        subSearchBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        query = new javax.swing.JTextField();
        docIdInput = new javax.swing.JTextField();
        subIdInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();

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
        docTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(docTable);

        successLabel.setForeground(new java.awt.Color(0, 204, 51));

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
        title.setText("Ajouter Pret");

        expSearchBtn.setText("Rechercher");
        expSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expSearchBtnActionPerformed(evt);
            }
        });

        queryInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryInputActionPerformed(evt);
            }
        });

        subscriberTable.getTableHeader().setBackground(new java.awt.Color(0, 0, 255));
        subscriberTable.getTableHeader().setForeground(new java.awt.Color(255, 255, 255));
        subscriberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    subscriberTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    subscriberTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            subscriberTableMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(subscriberTable);

    subSearchBtn.setText("Rechercher");
    subSearchBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            subSearchBtnActionPerformed(evt);
        }
    });

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "nom", "prenom", "cin", "adresse", "tel" }));
    jComboBox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox1ActionPerformed(evt);
        }
    });

    query.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            queryActionPerformed(evt);
        }
    });

    docIdInput.setEditable(false);
    docIdInput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

    subIdInput.setEditable(false);
    subIdInput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

    jLabel1.setText("Id Abonné");

    jLabel2.setText("Id Exemplaire");

    addBtn.setText("Enregistrer");
    addBtn.setBackground(new java.awt.Color(0, 204, 51));
    addBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    addBtn.setForeground(new java.awt.Color(255, 255, 255));
    addBtn.setHideActionText(true);
    addBtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addBtnActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(title)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(returnBtn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchDocImg)))
            .addGap(258, 258, 258)
            .addComponent(homeBtn))
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(query, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(subSearchBtn)
            .addContainerGap())
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(subIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(docIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(queryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(expSearchBtn)
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jScrollPane1))))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 207, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeBtn)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(returnBtn)
                        .addComponent(searchDocImg))))
            .addGap(18, 18, 18)
            .addComponent(title)
            .addGap(16, 16, 16)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(subSearchBtn)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(query, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expSearchBtn)
                            .addComponent(queryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(successLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(subIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(docIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(52, 52, 52))))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        new AdminDashboardUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        new PretManagementUI().setVisible(true);
        dispose();  
    }//GEN-LAST:event_returnBtnActionPerformed

    private void queryInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryInputActionPerformed
        performSearchExemplaires();
//        successLabel.setText(tableData.length+" exemplaires disponible");
    }//GEN-LAST:event_queryInputActionPerformed

    private void expSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expSearchBtnActionPerformed
         performSearchExemplaires();
//         successLabel.setText(tableData.length+" exemplaires disponible");
    }//GEN-LAST:event_expSearchBtnActionPerformed

    private void docTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docTableMouseClicked
          int selectedRow = docTable.getSelectedRow(); 
         DefaultTableModel model = (DefaultTableModel) docTable.getModel();
         Object docId = model.getValueAt(selectedRow, 0);
         docIdInput.setText((String)docId);
    }//GEN-LAST:event_docTableMouseClicked

    private void subscriberTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subscriberTableMouseClicked
        int selectedRow=subscriberTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) subscriberTable.getModel();
        Object subId = model.getValueAt(selectedRow, 0);
        subIdInput.setText(Integer.toString((int)subId));

    }//GEN-LAST:event_subscriberTableMouseClicked

    private void subSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subSearchBtnActionPerformed
        performSearchSubscriber();
    }//GEN-LAST:event_subSearchBtnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        selectedCriteria = (String) jComboBox1.getSelectedItem();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void queryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryActionPerformed
        performSearchSubscriber();
    }//GEN-LAST:event_queryActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
     
        String docId = docIdInput.getText();
        String subId = subIdInput.getText();
      

        if(docId.isEmpty() || subId.isEmpty()){
            JOptionPane.showMessageDialog(this,"Veuillez selectionner un document et un abonné");
        }else{
            try {
                new Pret(Integer.parseInt(docId),Integer.parseInt(subId)).addPret();
                new Exemplaires().setStatut("prete", Integer.parseInt(subId));
                performSearchExemplaires();
            JOptionPane.showMessageDialog(this,"Pret enregistré.");
            } catch (ParseException ex) {
                Logger.getLogger(AddPretUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_addBtnActionPerformed
      private void performSearchExemplaires() {
        String queryStr= queryInput.getText();
          expTableData = new Exemplaires().getExemplaires(queryStr,"pret");
            if (expTableData != null && expTableData.length > 0) {
                     
                    docTable.setModel(new javax.swing.table.DefaultTableModel(
                        expTableData,
                        new String[]{"ID","Doc","Cote","Titre","Auteur","Placard","Etagere","Statut"} 
                    ){
                        public boolean isCellEditable(int row, int column) {
                            return false;
                        }
                    });
                } else {
                        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"ID","Doc", "Cote", "Titre", "Auteur", "Placard", "Etagere", "Statut"}
        ));
                    } 
                TableColumnModel columnModel = docTable.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(20);
                columnModel.getColumn(1).setPreferredWidth(20);
    }
    private void performSearchSubscriber() {
        String queryStr = query.getText();
       
        Subscriber userSubscriber = new Subscriber();

        subTableData = userSubscriber.getUsers(queryStr, selectedCriteria);
        subscriberTable.setModel(new javax.swing.table.DefaultTableModel(
            subTableData,
            new String[]{"Id", "Prénom","Nom","CIN","Adresse","Tel"}
                
        ));
                TableColumnModel columnModel = subscriberTable.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(5);
    }
          
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField docIdInput;
    private javax.swing.JTable docTable;
    private javax.swing.JButton expSearchBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField query;
    private javax.swing.JTextField queryInput;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel searchDocImg;
    private javax.swing.JTextField subIdInput;
    private javax.swing.JButton subSearchBtn;
    private javax.swing.JTable subscriberTable;
    private javax.swing.JLabel successLabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
