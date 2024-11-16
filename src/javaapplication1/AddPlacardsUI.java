/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lenovo
 */
public class AddPlacardsUI extends JFrame {
        Object[][] tableData=null;
//    
//    public AddPlacardsUI(String previousPage){
//        this.previousPage=previousPage;
//        initComponents();
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
//       setLocationRelativeTo(null); 
//       performSearch();
//    }
    /**
     * Creates new form AddAuthorUI
     */
    public AddPlacardsUI() {
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

        addPlBtn = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        plInput = new javax.swing.JTextField();
        etagereInput = new javax.swing.JTextField();
        plLabel = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        returnBtn1 = new javax.swing.JButton();
        tableTitle = new javax.swing.JLabel();
        addEtagereBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        placardId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        etLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addPlBtn.setBackground(new java.awt.Color(0, 153, 51));
        addPlBtn.setForeground(new java.awt.Color(255, 255, 255));
        addPlBtn.setText("Ajouter Placard");
        addPlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlBtnActionPerformed(evt);
            }
        });

        title.setText("Gérer Placards");

        plLabel.setText("Libelle Placards");

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_author (50).png"))); // NOI18N

        returnBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return_icon.png"))); // NOI18N
        returnBtn1.setAlignmentY(0.0F);
        returnBtn1.setBorderPainted(false);
        returnBtn1.setFocusPainted(false);
        returnBtn1.setFocusable(false);
        returnBtn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        returnBtn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        returnBtn1.setRequestFocusEnabled(false);
        returnBtn1.setRolloverEnabled(false);
        returnBtn1.setVerifyInputWhenFocusTarget(false);
        returnBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtn1ActionPerformed(evt);
            }
        });

        tableTitle.setText("Liste des placards");

        addEtagereBtn.setBackground(new java.awt.Color(0, 153, 51));
        addEtagereBtn.setForeground(new java.awt.Color(255, 255, 255));
        addEtagereBtn.setText("Ajouter etagère");
        addEtagereBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEtagereBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        placardId.setEditable(false);

        jLabel1.setText("Id Pl");

        etLabel.setText("Libelle Etagère");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(addPlBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(plInput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placardId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etLabel)
                            .addComponent(etagereInput)))
                    .addComponent(addEtagereBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(returnBtn1)
                        .addGap(115, 115, 115)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(img))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tableTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnBtn1)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plLabel)
                    .addComponent(jLabel1)
                    .addComponent(etLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etagereInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placardId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEtagereBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(tableTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlBtnActionPerformed

        if(plInput.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Libelle manquant","Alert",JOptionPane.WARNING_MESSAGE);

        }else{
        new Placards((String)plInput.getText()).addPlacard();
        JOptionPane.showMessageDialog(null, "Placard ajouté");
        }
    }//GEN-LAST:event_addPlBtnActionPerformed

    private void returnBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtn1ActionPerformed

        new AdminDashboardUI().setVisible(true);
        dispose();

    }//GEN-LAST:event_returnBtn1ActionPerformed

    private void addEtagereBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEtagereBtnActionPerformed
         if(etagereInput.getText().isEmpty() || placardId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Id placards ou libelle etagere manquant","Alert",JOptionPane.WARNING_MESSAGE);

        }else{
        new Etageres((String)etagereInput.getText(),Integer.parseInt(placardId.getText())).addEtagere();
        JOptionPane.showMessageDialog(null, "Placard ajouté");
        }
    }//GEN-LAST:event_addEtagereBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow=jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object plId = model.getValueAt(selectedRow,0);
         int placardIdValue = Integer.parseInt(plId.toString());
        placardId.setText(Integer.toString(placardIdValue));
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void performSearch(){
        tableData = new Placards().getPlacards();
                  jTable1.setModel(new javax.swing.table.DefaultTableModel(
                  tableData,
                new String[] {"num placard", "Libelle Placard","num etagere","Libelle etagere"} 
            )); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEtagereBtn;
    private javax.swing.JButton addPlBtn;
    private javax.swing.JLabel etLabel;
    private javax.swing.JTextField etagereInput;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField plInput;
    private javax.swing.JLabel plLabel;
    private javax.swing.JTextField placardId;
    private javax.swing.JButton returnBtn1;
    private javax.swing.JLabel tableTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
