/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author lenovo
 */
public class AddAuthorUI extends JFrame {
    private String previousPage;
    
    public AddAuthorUI(String previousPage){
        this.previousPage=previousPage;
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
       setLocationRelativeTo(null); 
    }
    /**
     * Creates new form AddAuthorUI
     */
    public AddAuthorUI() {
        initComponents();
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
       setLocationRelativeTo(null); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addAuthorBtn = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        lastNameInput = new javax.swing.JTextField();
        firstNameInput = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        returnBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RT | Ajouter un auteur");

        addAuthorBtn.setBackground(new java.awt.Color(0, 153, 51));
        addAuthorBtn.setForeground(new java.awt.Color(255, 255, 255));
        addAuthorBtn.setText("Enregistrer");
        addAuthorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuthorBtnActionPerformed(evt);
            }
        });

        title.setText("Ajouter Auteur");

        lastNameLabel.setText("Nom");

        firstNameLabel.setText("Prénom");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_author (50).png"))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(returnBtn1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(firstNameInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addAuthorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnBtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addGap(18, 18, 18)
                .addComponent(addAuthorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAuthorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuthorBtnActionPerformed
        if(lastNameInput.getText().isEmpty() || firstNameInput.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "nom et prénom sont requis","Alert",JOptionPane.WARNING_MESSAGE);
        }else{
        addAuthor();
        }
        
    }//GEN-LAST:event_addAuthorBtnActionPerformed

    private void returnBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtn1ActionPerformed
        if("home".equals(this.previousPage)){
        new AdminDashboardUI().setVisible(true);
        dispose();
        }else{
            dispose();
        }
    }//GEN-LAST:event_returnBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void addAuthor(){
        Connection conn=null;
        PreparedStatement statement=null;
        try {
         conn = DBConnection.getConnection();
         statement = conn.prepareStatement("INSERT INTO Authors (nom_auteur,prenom_auteur) VALUES (?,?)");
         statement.setString(1, lastNameInput.getText());
         statement.setString(2, firstNameInput.getText());
        int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
             JOptionPane.showMessageDialog(this, "Auteur ajouté avec succès!");
            lastNameInput.setText(""); 
            firstNameInput.setText("");
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
        try {
            if (statement != null) statement.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println("Error closing resources: " + e.getMessage());
        }
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAuthorBtn;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton returnBtn1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
