/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import java.sql.*;
import java.awt.*;

/**
 *
 * @author lenovo
 */
public class AdminDashboardUI extends javax.swing.JFrame {
    String currentUser=CurrentUser.instance.getUsername();
    String user;
    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboardUI() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public AdminDashboardUI(String r) {
        this();
        this.currentUser=r;
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
        jTable1 = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        addPretBtn = new javax.swing.JButton();
        addSubBtn = new javax.swing.JButton();
        addDocBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        addAuthorBtn = new javax.swing.JButton();
        addPlBtn = new javax.swing.JButton();
        addExpBtn = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        title.setForeground(new java.awt.Color(0, 51, 153));
        title.setText("Welcome " + currentUser);

        addPretBtn.setBackground(new java.awt.Color(204, 255, 204));
        addPretBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerer pret 50.png"))); // NOI18N
        addPretBtn.setText("Gérer  Prêt");
        addPretBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addPretBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPretBtnActionPerformed(evt);
            }
        });

        addSubBtn.setBackground(new java.awt.Color(204, 255, 204));
        addSubBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerer abonne.png"))); // NOI18N
        addSubBtn.setText("Gérer Abonné");
        addSubBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addSubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubBtnActionPerformed(evt);
            }
        });

        addDocBtn.setBackground(new java.awt.Color(204, 255, 204));
        addDocBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerer doc 50.png"))); // NOI18N
        addDocBtn.setText("Gérer Document");
        addDocBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDocBtnActionPerformed(evt);
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

        addAuthorBtn.setBackground(new java.awt.Color(204, 255, 204));
        addAuthorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_author (50).png"))); // NOI18N
        addAuthorBtn.setText("Ajouter Auteur");
        addAuthorBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addAuthorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuthorBtnActionPerformed(evt);
            }
        });

        addPlBtn.setBackground(new java.awt.Color(204, 255, 204));
        addPlBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerer placard.png"))); // NOI18N
        addPlBtn.setText("Gérer  Placard");
        addPlBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addPlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlBtnActionPerformed(evt);
            }
        });

        addExpBtn.setBackground(new java.awt.Color(204, 255, 204));
        addExpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gerer exemplaire.png"))); // NOI18N
        addExpBtn.setText("Gérer Exemplaire");
        addExpBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addExpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addSubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addPretBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addExpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPlBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addAuthorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSubBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(addDocBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addAuthorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(addPretBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addExpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(addPlBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPretBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPretBtnActionPerformed
        new PretManagementUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_addPretBtnActionPerformed

    private void addSubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubBtnActionPerformed
        new SubscriberManagementUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_addSubBtnActionPerformed

    private void addDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDocBtnActionPerformed
   new DocumentManagementUI().setVisible(true);

        dispose();    }//GEN-LAST:event_addDocBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
       CurrentUser. logout();
       new Welcome().setVisible(true);
       dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void addAuthorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuthorBtnActionPerformed
       new AddAuthorUI("home").setVisible(true);
       dispose();
    }//GEN-LAST:event_addAuthorBtnActionPerformed

    private void addPlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlBtnActionPerformed
       new AddPlacardsUI().setVisible(true);
       dispose();
    }//GEN-LAST:event_addPlBtnActionPerformed

    private void addExpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExpBtnActionPerformed
        new AddExemplairesUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_addExpBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAuthorBtn;
    private javax.swing.JButton addDocBtn;
    private javax.swing.JButton addExpBtn;
    private javax.swing.JButton addPlBtn;
    private javax.swing.JButton addPretBtn;
    private javax.swing.JButton addSubBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
