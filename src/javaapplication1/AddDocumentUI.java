/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import javax.swing.OverlayLayout;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class AddDocumentUI extends javax.swing.JFrame {
 String selectedType;
 String selectedMemoire="licence";
ArrayList<String> selectedAuthors = new ArrayList<>();
ArrayList<Integer> selectedAuthorsId = new ArrayList<>();


    /**
     * Creates new form AddDocumentUI
     */
    public AddDocumentUI() {
        initComponents();
            type.setSelectedItem("ouvrage");
        setLocationRelativeTo(null); 
        getAuthors();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpMemoire = new javax.swing.ButtonGroup();
        cote = new javax.swing.JTextField();
        titre = new javax.swing.JTextField();
        etat = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        coteLabel = new javax.swing.JLabel();
        titreLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        memoirePanel = new javax.swing.JPanel();
        licenceBtn = new javax.swing.JRadioButton();
        mastereBtn = new javax.swing.JRadioButton();
        doctoratBtn = new javax.swing.JRadioButton();
        ouvragePanel = new javax.swing.JPanel();
        editeur = new javax.swing.JTextField();
        isbn = new javax.swing.JTextField();
        isbnLabel1 = new javax.swing.JLabel();
        editeurLabel1 = new javax.swing.JLabel();
        etatLabel = new javax.swing.JLabel();
        nomAuteurLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nomAuteurs = new javax.swing.JTextArea();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        newAuthorBtn = new javax.swing.JToggleButton();
        homeBtn1 = new javax.swing.JButton();
        returnBtn1 = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        addDocImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        cote.setText("1");

        titre.setText("titre");

        etat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "disponible", "non disponible" }));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ouvrage", "memoire" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.setBackground(new java.awt.Color(0, 204, 51));
        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setHideActionText(true);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        coteLabel.setText("Cote");

        titreLabel.setText("Titre");

        dateLabel.setText("Date partution");

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
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memoirePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGrpMemoire.add(licenceBtn);
        licenceBtn.setSelected(true);
        licenceBtn.setText("Licence");
        licenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenceBtnActionPerformed(evt);
            }
        });
        memoirePanel.add(licenceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnGrpMemoire.add(mastereBtn);
        mastereBtn.setText("Mastere");
        mastereBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mastereBtnActionPerformed(evt);
            }
        });
        memoirePanel.add(mastereBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnGrpMemoire.add(doctoratBtn);
        doctoratBtn.setText("Doctorat");
        doctoratBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctoratBtnActionPerformed(evt);
            }
        });
        memoirePanel.add(doctoratBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLayeredPane2.add(memoirePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 100));

        editeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editeurActionPerformed(evt);
            }
        });

        isbnLabel1.setText("ISBN");

        editeurLabel1.setText("Editeur");

        javax.swing.GroupLayout ouvragePanelLayout = new javax.swing.GroupLayout(ouvragePanel);
        ouvragePanel.setLayout(ouvragePanelLayout);
        ouvragePanelLayout.setHorizontalGroup(
            ouvragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ouvragePanelLayout.createSequentialGroup()
                .addGroup(ouvragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ouvragePanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(editeurLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ouvragePanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(isbnLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editeur, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        ouvragePanelLayout.setVerticalGroup(
            ouvragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ouvragePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(ouvragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnLabel1)
                    .addComponent(editeur, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(ouvragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editeurLabel1)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jLayeredPane2.add(ouvragePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        etatLabel.setText("Etat");

        nomAuteurLabel.setText("Nom auteur(s)");

        nomAuteurs.setColumns(20);
        nomAuteurs.setRows(5);
        jScrollPane2.setViewportView(nomAuteurs);

        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        newAuthorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_author (50).png"))); // NOI18N
        newAuthorBtn.setText("Nouveau Auteur");
        newAuthorBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newAuthorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAuthorBtnActionPerformed(evt);
            }
        });

        homeBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_icon.png"))); // NOI18N
        homeBtn1.setBackground(new Color(0, 0, 0, 0));
        homeBtn1.setBorder(null);
        homeBtn1.setBorderPainted(false);
        homeBtn1.setFocusPainted(false);
        homeBtn1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home icon 50.png"))); // NOI18N
        homeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtn1ActionPerformed(evt);
            }
        });

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

        title.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 204));
        title.setText("Ajouter Document");

        addDocImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add Doc 50.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomAuteurLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(returnBtn1)
                        .addGap(296, 296, 296)
                        .addComponent(addDocImg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(titreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(coteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(49, 49, 49))
                                        .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(etatLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(datePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titre)
                                        .addComponent(etat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cote)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(newAuthorBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeBtn1))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addDocImg))
                            .addComponent(returnBtn1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cote, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coteLabel))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etatLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(homeBtn1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newAuthorBtn)
                        .addContainerGap(131, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomAuteurLabel))
                        .addGap(113, 113, 113)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
         selectedType = (String) type.getSelectedItem();
        if("ouvrage".equals(selectedType)){
            ouvragePanel.setVisible(true);
            memoirePanel.setVisible(false);
        }else{
            memoirePanel.setVisible(true);
            ouvragePanel.setVisible(false);
        }
        
    }//GEN-LAST:event_typeActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
      int docId = addDocument();

    
    if (docId != -1) {
        addDocAuth(docId);
    } else {
        JOptionPane.showMessageDialog(null, "Failed to add document. Cannot proceed with adding authors.");
    }
    }//GEN-LAST:event_addBtnActionPerformed

    private void licenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenceBtnActionPerformed
        selectedMemoire = licenceBtn.getText();
    }//GEN-LAST:event_licenceBtnActionPerformed

    private void mastereBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mastereBtnActionPerformed
        selectedMemoire = mastereBtn.getText();
    }//GEN-LAST:event_mastereBtnActionPerformed

    private void doctoratBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctoratBtnActionPerformed
        selectedMemoire = doctoratBtn.getText();
    }//GEN-LAST:event_doctoratBtnActionPerformed

    private void editeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editeurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editeurActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int[] selectedRows=jTable1.getSelectedRows();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int rowIndex : selectedRows) {
                     Object id = model.getValueAt(rowIndex, 0);
                     Object nom = model.getValueAt(rowIndex, 1);
                     Object prenom = model.getValueAt(rowIndex, 2);
                         String fullName = nom + " " + prenom;
                      if (selectedAuthors.contains((String)fullName)) {
                             selectedAuthors.remove((String)fullName);
                            selectedAuthorsId.remove(Integer.valueOf((int) id));
                         } else {
                             selectedAuthors.add((String) fullName);
                             selectedAuthorsId.add((int)id);
                         }
                     nomAuteurs.setText(String.join(", ", selectedAuthors));
                     System.out.println(selectedAuthorsId);
                }
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        getAuthors();
    }//GEN-LAST:event_searchInputActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        getAuthors();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void newAuthorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAuthorBtnActionPerformed
          AddAuthorUI addAuthorUI = new AddAuthorUI();
    addAuthorUI.setVisible(true);
    }//GEN-LAST:event_newAuthorBtnActionPerformed

    private void homeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtn1ActionPerformed
       new AdminDashboardUI().setVisible(true);
       dispose();
    }//GEN-LAST:event_homeBtn1ActionPerformed

    private void returnBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtn1ActionPerformed
        new DocumentManagementUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnBtn1ActionPerformed
    private int addDocument(){
       Connection conn=null;
       PreparedStatement statement=null;
       ResultSet generatedKeys = null;
        int docId = -1;
        
        try {
      conn = DBConnection.getConnection();
      String sql = "INSERT INTO documents (cote, titre, date_parution,etat,type, isbn, editeur, diplome) VALUES (?,?,?,?,?,?,?,?)";
        statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    // Gather the data from the text fields
    String coteData = cote.getText();
    String titreData = titre.getText();
    String dateString = datePicker1.getText();  // '1 novembre 2024'
    
    SimpleDateFormat inputFormat = new SimpleDateFormat("d MMMM yyyy", Locale.FRENCH);  
    java.util.Date utilDate = inputFormat.parse(dateString);             
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());  
  

    // Set the common fields
    statement.setString(1, coteData);
    statement.setString(2, titreData);
    statement.setDate(3, sqlDate); 
    statement.setString(4, (String) etat.getSelectedItem());
    statement.setString(5, selectedType);
    
    // Depending on the selected type, set additional fields
    if ("ouvrage".equals(selectedType)) {
        statement.setString(6, isbn.getText()); 
        statement.setString(7, editeur.getText()); 
        statement.setString(8, null); 
    } else {
        // Set diplome for the other case
        statement.setString(6, null); 
        statement.setString(7, null); 
        statement.setString(8, selectedMemoire); 
    }
    
        int affectedRows = statement.executeUpdate();
    
            if (affectedRows > 0) {
           
            generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                docId = generatedKeys.getInt(1);  
            }
        }
    
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding users: " + e.getMessage());
        } catch (ParseException ex) {
                        JOptionPane.showMessageDialog(null, "Error adding users: " + ex.getMessage());

         Logger.getLogger(AddDocumentUI.class.getName()).log(Level.SEVERE, null, ex);
     }
         return docId;
    }
    private void addDocAuth(int documentId){
     Connection conn=null;
      PreparedStatement statement=null;
        try {
      conn = DBConnection.getConnection();
      String sql = "INSERT INTO documents_authors (document_id,author_id) VALUES (?,?)";
    statement = conn.prepareStatement(sql);

     for (int authorId : selectedAuthorsId) {
        statement.setInt(1, documentId);  
        statement.setInt(2, authorId);      

        // Execute the insert for this row
        statement.addBatch();  // Use addBatch to batch the inserts for performance
    }

    // Execute the batch insert
    statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding users: " + e.getMessage());
        } 
    }
    private void getAuthors(){

        Connection conn=null;
       ResultSet resultSet=null;
       PreparedStatement statement=null;
       String queryStr = (String) searchInput.getText();
        try {
            conn = DBConnection.getConnection();
            statement = conn.prepareStatement("SELECT * FROM authors WHERE nom_auteur LIKE ? OR prenom_auteur LIKE ?");
            statement.setString(1,"%" + queryStr + "%" );
            statement.setString(2,"%" + queryStr + "%" );
            resultSet = statement.executeQuery();
            
            ArrayList<Object[]> data = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("code_auteur");
                String lastName = resultSet.getString("prenom_auteur");
                String firstName = resultSet.getString("nom_auteur");
                data.add(new Object[]{id,lastName, firstName});
            }
            Object[][] tableData = data.toArray(new Object[0][]);
      jTable1.setModel(new javax.swing.table.DefaultTableModel(
                tableData,
                new String[] {"code_auteur", "Nom","Prenom"} // Column names
            ));
      
               
        } catch (SQLException e) {
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel addDocImg;
    private javax.swing.ButtonGroup btnGrpMemoire;
    private javax.swing.JTextField cote;
    private javax.swing.JLabel coteLabel;
    private javax.swing.JLabel dateLabel;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JRadioButton doctoratBtn;
    private javax.swing.JTextField editeur;
    private javax.swing.JLabel editeurLabel1;
    private javax.swing.JComboBox<String> etat;
    private javax.swing.JLabel etatLabel;
    private javax.swing.JButton homeBtn1;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel isbnLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton licenceBtn;
    private javax.swing.JRadioButton mastereBtn;
    private javax.swing.JPanel memoirePanel;
    private javax.swing.JToggleButton newAuthorBtn;
    private javax.swing.JLabel nomAuteurLabel;
    private javax.swing.JTextArea nomAuteurs;
    private javax.swing.JPanel ouvragePanel;
    private javax.swing.JButton returnBtn1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel title;
    private javax.swing.JTextField titre;
    private javax.swing.JLabel titreLabel;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
