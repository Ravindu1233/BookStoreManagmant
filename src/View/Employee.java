
package View;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;

public class Employee extends javax.swing.JFrame {


    public Employee() {
        initComponents();
        DisplayEmployee();
        counRow();
        txt_eID.setEditable(false);
        
        txt_eContact.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
        eContactFieldKeyTyped(evt);
    }
});
        txt_eName.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        eNameFieldKeyTyped(evt);
    }
});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_employee = new javax.swing.JLabel();
        lbl_books = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_eID = new javax.swing.JTextField();
        txt_eName = new javax.swing.JTextField();
        txt_eAddress = new javax.swing.JTextField();
        txt_eContact = new javax.swing.JTextField();
        txt_ePassword = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_employee = new javax.swing.JTable();
        btn_print = new javax.swing.JButton();
        btn_back = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(810, 510));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(830, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_employee.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_employee.setForeground(new java.awt.Color(51, 51, 255));
        lbl_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-employee-48.png"))); // NOI18N
        lbl_employee.setText("Employees");
        lbl_employee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));
        jPanel1.add(lbl_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 190, -1));

        lbl_books.setBackground(new java.awt.Color(255, 255, 255));
        lbl_books.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_books.setForeground(new java.awt.Color(51, 51, 255));
        lbl_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-books-50.png"))); // NOI18N
        lbl_books.setText("Books");
        lbl_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_booksMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-supplier-50 2.png"))); // NOI18N
        jLabel4.setText("Suppliers");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Employee ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Contact ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        txt_eID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_eID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eIDActionPerformed(evt);
            }
        });
        jPanel1.add(txt_eID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, -1));

        txt_eName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_eName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eNameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_eName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 180, -1));

        txt_eAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_eAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txt_eAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 150, -1));

        txt_eContact.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_eContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eContactActionPerformed(evt);
            }
        });
        jPanel1.add(txt_eContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 160, -1));

        txt_ePassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 140, -1));

        btn_register.setBackground(new java.awt.Color(51, 51, 255));
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setText("Register");
        btn_register.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registerMouseClicked(evt);
            }
        });
        jPanel1.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, -1));

        btn_edit.setBackground(new java.awt.Color(51, 51, 255));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
        });
        jPanel1.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 110, -1));

        btn_delete.setBackground(new java.awt.Color(51, 51, 255));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deleteMouseClicked(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 110, -1));

        btn_clear.setBackground(new java.awt.Color(51, 51, 255));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear All");
        btn_clear.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clearMouseClicked(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 130, -1));

        tbl_employee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbl_employee.setForeground(new java.awt.Color(153, 0, 255));
        tbl_employee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Contact", "Password"
            }
        ));
        tbl_employee.setRowHeight(40);
        tbl_employee.setSelectionBackground(new java.awt.Color(153, 0, 255));
        tbl_employee.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbl_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_employeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_employee);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 830, 290));

        btn_print.setBackground(new java.awt.Color(51, 51, 255));
        btn_print.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_print.setForeground(new java.awt.Color(255, 255, 255));
        btn_print.setText("Print");
        btn_print.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_printMouseClicked(evt);
            }
        });
        jPanel1.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, 90, -1));

        btn_back.setBackground(new java.awt.Color(255, 255, 255));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(51, 51, 255));
        btn_back.setText("Back");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 540, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Employee List");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        lbl_close.setBackground(new java.awt.Color(255, 255, 255));
        lbl_close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(153, 0, 255));
        lbl_close.setText("Close");
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, -1, 28));

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(153, 0, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-logout-30.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-books-50 1.png"))); // NOI18N
        jLabel25.setText("BOOKMART");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, 10));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1056, 690));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_eIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eIDActionPerformed

    private void txt_eNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eNameActionPerformed

    private void txt_eAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eAddressActionPerformed

    private void txt_eContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eContactActionPerformed

    private void txt_ePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ePasswordActionPerformed

    private void eContactFieldKeyTyped(java.awt.event.KeyEvent evt) {
    char c = evt.getKeyChar();
    if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
        evt.consume(); // ignore numbers
    }
}
        private void eNameFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE)) {
            evt.consume(); // Ignore non-letter characters 
        }
    }
    
    Connection con = null;
    Statement st = null;
    ResultSet Rs = null;

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        new UserLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void lbl_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_booksMouseClicked
        new Books().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_booksMouseClicked

    private void DisplayEmployee(){
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        st = con.createStatement();
        Rs = st.executeQuery("SELECT * FROM bookstore.Employee");
        tbl_employee.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
         e.printStackTrace();
    }
}
    
    private void counRow() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        st = con.createStatement();
        Rs = st.executeQuery("SELECT MAX(eID) AS max_id FROM bookstore.Employee");

        if (Rs.next()) {
            int bno = Rs.getInt("max_id") + 1;
            txt_eID.setText(String.valueOf(bno));
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
    private void clearALL(){
    txt_eID.setText("");
    txt_eName.setText("");
    txt_eContact.setText("");
    txt_eAddress.setText("");
    txt_ePassword.setText("");
    counRow();
    }
    
    private void btn_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseClicked
         if(txt_eID.getText().isEmpty() || txt_eName.getText().isEmpty() || txt_eContact.getText().isEmpty() || txt_eAddress.getText().isEmpty() || txt_ePassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"MISSING INFORMATION!");
        }
        else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                PreparedStatement add = con.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?,?)");
                add.setInt(1,Integer.parseInt(txt_eID.getText()));
                add.setString(2, txt_eName.getText());  
                add.setInt(3,Integer.parseInt(txt_eContact.getText()));
                add.setString(4, txt_eAddress.getText());
                add.setString(5, txt_ePassword.getText());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this,"EMPLOYEE REGISTERED.");
                DisplayEmployee();
                clearALL();
                counRow();
                       
            } catch ( SQLException | NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error registering Employee: " + e.getMessage());
            }         
        }
    }//GEN-LAST:event_btn_registerMouseClicked

    private void tbl_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_employeeMouseClicked
        DefaultTableModel model = (DefaultTableModel)tbl_employee.getModel();
        int myIndex = tbl_employee.getSelectedRow();
        txt_eID.setText(model.getValueAt(myIndex, 0).toString());
        txt_eName.setText(model.getValueAt(myIndex, 1).toString());
        txt_eContact.setText(model.getValueAt(myIndex, 2).toString());
        txt_eAddress.setText(model.getValueAt(myIndex, 3).toString());
        txt_ePassword.setText(model.getValueAt(myIndex, 4).toString());
    }//GEN-LAST:event_tbl_employeeMouseClicked

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
        System.exit(0);  
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void btn_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseClicked
        clearALL();
    }//GEN-LAST:event_btn_clearMouseClicked

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
         if (txt_eID.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the Employee ID to delete.");
    } else {
        Connection con = null;
        Statement delete = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
            String eid = txt_eID.getText();
            String query = "DELETE FROM bookstore.Employee WHERE eID =" + eid;
            delete = con.createStatement();
            int rowsDeleted = delete.executeUpdate(query);

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "EMPLOYEE DELETED");
                DisplayEmployee();
                clearALL();
            } else {
                JOptionPane.showMessageDialog(this, "No Employee with the specified ID found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting Employee: " + e.getMessage());
        } finally {
            try {
                if (delete != null) {
                    delete.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_btn_deleteMouseClicked

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        if(txt_eID.getText().isEmpty() || txt_eName.getText().isEmpty() || txt_eContact.getText().isEmpty() ||  txt_eAddress.getText().isEmpty() || txt_ePassword.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"MISSING INFORMATION!");
    }
    else {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
            
            String updateQuery = "UPDATE bookstore.Employee SET eName = ?, eContact = ?, eAddress = ?, ePassword = ? WHERE eID = ?";
            
            PreparedStatement update = con.prepareStatement(updateQuery);
            
        
            update.setString(1, txt_eName.getText());
            update.setInt(2, Integer.parseInt(txt_eContact.getText()));
            update.setString(3, txt_eAddress.getText());
            update.setString(4, txt_ePassword.getText());
            update.setInt(5, Integer.parseInt(txt_eID.getText()));
            
            int rowsAffected = update.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "EMPLOYEE EDITED");
                DisplayEmployee();
                clearALL();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to edit Employee.");
            }
            
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error editing Emplooyee: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_btn_editMouseClicked

    private void btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_printMouseClicked
        try {
            tbl_employee.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_printMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_books;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_employee;
    private javax.swing.JTable tbl_employee;
    private javax.swing.JTextField txt_eAddress;
    private javax.swing.JTextField txt_eContact;
    private javax.swing.JTextField txt_eID;
    private javax.swing.JTextField txt_eName;
    private javax.swing.JTextField txt_ePassword;
    // End of variables declaration//GEN-END:variables
}
