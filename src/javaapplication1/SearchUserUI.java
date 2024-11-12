/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 */
public class SearchUserUI extends javax.swing.JFrame {
String selectedCriteria="username";
/**
     * Creates new form SearchBook
     */
    public SearchUserUI() {
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        query = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
    jTable1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButton1.setText("Search");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    query.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            queryActionPerformed(evt);
        }
    });

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "username", "password", "Item 3", "Item 4" }));
    jComboBox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(query, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton1)))
            .addGap(0, 17, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(91, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(query, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(46, 46, 46))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(55, 55, 55)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryActionPerformed
    performSearch();
    }//GEN-LAST:event_queryActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                selectedCriteria = (String) jComboBox1.getSelectedItem();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    performSearch();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         int selectedRow=jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Iterate over all selected rows and get the value of the first column (e.g., username)
        // Get the value in the first column (index 0)
        Object username = model.getValueAt(selectedRow, 0);
        System.out.println(username); 
        String currentText = jTextField1.getText();
        jTextField1.setText((String)username);
    
//        jTextField1.setText((String)username);
    }//GEN-LAST:event_jTable1MouseClicked
    /**
     * @param args the command line arguments
     */
    private void searchUser(){
         Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
            String st;
    String usernameD = query.getText();
            switch (selectedCriteria) { 
              case "username":
                  st = "SELECT * FROM users WHERE username LIKE ?";
                  break;
              case "password":
                  st = "SELECT * FROM users WHERE password LIKE ?"; 
                  break;
              default:
                  st = "SELECT * FROM users WHERE username LIKE ?";
                  break;
          }

        try {
            conn = DBConnection.getConnection();
            statement = conn.prepareStatement(st);
        statement.setString(1, "%" + usernameD + "%");
            resultSet = statement.executeQuery();
                ArrayList<Object[]> data = new ArrayList<>();

            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                data.add(new Object[]{username, password});
            }
            Object[][] tableData = data.toArray(new Object[0][]);
      jTable1.setModel(new javax.swing.table.DefaultTableModel(
                tableData,
                new String[] {"Username", "Password"} // Column names
            ));

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error retrieving users: " + e.getMessage());
        } finally {
            // Close resources in finally block
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
        private void performSearch() {
        String usernameD = query.getText();
       
        Subscriber userSubscriber = new Subscriber();

        Object[][] tableData = userSubscriber.getUsers(usernameD, selectedCriteria);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            tableData,
            new String[]{"Username", "Password"} 
        ));
    }
     private void showUsers() {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
    
        setTitle("Users");
    
    
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
            statement = conn.prepareStatement("SELECT * FROM users");
            resultSet = statement.executeQuery();
    
            // Displaying the list of users
                ArrayList<Object[]> data = new ArrayList<>();

            // Collect data from ResultSet
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                data.add(new Object[]{username, password, null, null});
            }
            Object[][] tableData = data.toArray(new Object[0][]);
      jTable1.setModel(new javax.swing.table.DefaultTableModel(
                tableData,
                new String[] {"Username", "Password"} // Column names
            ));

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error retrieving users: " + e.getMessage());
        } finally {
            // Close resources in finally block
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        // Update the main frame with the user panel
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField query;
    // End of variables declaration//GEN-END:variables
}
