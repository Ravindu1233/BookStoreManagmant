/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
 
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.awt.event.KeyEvent; // For handling KeyEvent
import javax.swing.JFrame; 
import javax.swing.JTextField; 

public class Books extends javax.swing.JFrame {

    public Books() {
        initComponents();
        DisplayBooks();
        counRow();
        txt_bID.setEditable(false);
           // Add KeyListeners to the quantity and price fields
    txt_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            quantityFieldKeyTyped(evt);
        }
    });

    txt_price.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            priceFieldKeyTyped(evt);
        }
    });
    
    txt_bName.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        bNameFieldKeyTyped(evt);
    }
});

    txt_author.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        authorFieldKeyTyped(evt);
    }
});

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        lbl_employee = new javax.swing.JLabel();
        lbl_books = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_bID = new javax.swing.JTextField();
        txt_bName = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        txt_author = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_book = new javax.swing.JTable();
        btn_print = new javax.swing.JButton();
        btn_back = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cmb_category = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(810, 510));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(833, 516));
        jPanel5.setPreferredSize(new java.awt.Dimension(830, 500));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-books-50 1.png"))); // NOI18N
        jLabel25.setText("BOOKMART");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        lbl_employee.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_employee.setForeground(new java.awt.Color(51, 51, 255));
        lbl_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-employee-48.png"))); // NOI18N
        lbl_employee.setText("Employees");
        lbl_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_employeeMouseClicked(evt);
            }
        });
        jPanel5.add(lbl_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 190, -1));

        lbl_books.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_books.setForeground(new java.awt.Color(51, 51, 255));
        lbl_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-books-50.png"))); // NOI18N
        lbl_books.setText("Books");
        lbl_books.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));
        jPanel5.add(lbl_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 180, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-supplier-50 2.png"))); // NOI18N
        jLabel28.setText("Suppliers");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 170, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 255));
        jLabel32.setText("Book ID");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 255));
        jLabel33.setText("Name");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 255));
        jLabel34.setText("Author");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 255));
        jLabel35.setText("Quantity");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 255));
        jLabel36.setText("Price");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        txt_bID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_bID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bIDActionPerformed(evt);
            }
        });
        jPanel5.add(txt_bID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 84, -1));

        txt_bName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_bName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bNameActionPerformed(evt);
            }
        });
        jPanel5.add(txt_bName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 260, -1));

        txt_quantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantityActionPerformed(evt);
            }
        });
        jPanel5.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 84, -1));

        txt_author.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_authorActionPerformed(evt);
            }
        });
        jPanel5.add(txt_author, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 230, -1));

        txt_price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        jPanel5.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 87, -1));

        btn_add.setBackground(new java.awt.Color(51, 51, 255));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });
        jPanel5.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 130, 30));

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
        jPanel5.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 120, 30));

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
        jPanel5.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 120, 30));

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
        jPanel5.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, 140, 30));

        tbl_book.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbl_book.setForeground(new java.awt.Color(153, 0, 255));
        tbl_book.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Name", "Author", "Category", "Quantity", "Price"
            }
        ));
        tbl_book.setRowHeight(40);
        tbl_book.setSelectionBackground(new java.awt.Color(153, 0, 255));
        tbl_book.setShowGrid(false);
        tbl_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_book);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 850, 290));

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
        jPanel5.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 110, -1));

        btn_back.setBackground(new java.awt.Color(255, 255, 255));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(51, 51, 255));
        btn_back.setText("Back");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        jPanel5.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 255));
        jLabel38.setText("Book List");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        cmb_category.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmb_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "**SELECT**", "Programming", "Biology", "Business", "Novel", "History", "Romance", "Chemistry", "Comic" }));
        jPanel5.add(cmb_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, -1, -1));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 255));
        jLabel39.setText("Category");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));

        lbl_close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(51, 51, 255));
        lbl_close.setText("Close");
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
        });
        jPanel5.add(lbl_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, 28));

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(51, 51, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-logout-30.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        jPanel5.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 160, 10));

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1056, 690));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_bIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bIDActionPerformed

    private void txt_bNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bNameActionPerformed

    private void txt_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantityActionPerformed

    private void txt_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_authorActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void quantityFieldKeyTyped(java.awt.event.KeyEvent evt) {
    char c = evt.getKeyChar();
    if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
        evt.consume(); // Ignore non-numeric characters
    }
}

private void priceFieldKeyTyped(java.awt.event.KeyEvent evt) {
    char c = evt.getKeyChar();
    if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == '.')) {
        evt.consume(); // Ignore non-numeric characters and allow the decimal point '.'
    }
}

private void bNameFieldKeyTyped(java.awt.event.KeyEvent evt) {
    char c = evt.getKeyChar();
    if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE)) {
        evt.consume(); // Ignore non-letter characters (excluding spaces)
    }
}

private void authorFieldKeyTyped(java.awt.event.KeyEvent evt) {
    char c = evt.getKeyChar();
    if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE)) {
        evt.consume(); // Ignore non-letter characters (excluding spaces)
    }
}
    
Connection con = null;
Statement st = null;
ResultSet Rs = null;

private void DisplayBooks(){
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        st = con.createStatement();
        Rs = st.executeQuery("SELECT * FROM bookstore.Book");
        tbl_book.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
         e.printStackTrace();
    }
}

private void clearALL(){
    txt_bID.setText("");
    txt_bName.setText("");
    txt_author.setText("");
    txt_price.setText("");
    txt_quantity.setText("");
    cmb_category.setSelectedIndex(0);  
    counRow();
}

private void counRow() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        st = con.createStatement();
        Rs = st.executeQuery("SELECT MAX(bID) AS max_id FROM bookstore.Book");

        if (Rs.next()) {
            int bno = Rs.getInt("max_id") + 1;
            txt_bID.setText(String.valueOf(bno));
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

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        if(txt_bID.getText().isEmpty() || txt_bName.getText().isEmpty() || txt_author.getText().isEmpty() || cmb_category.getSelectedIndex() == 0 || txt_quantity.getText().isEmpty() || txt_price.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"MISSING INFORMATION!");
        }
        else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                PreparedStatement add = con.prepareStatement("INSERT INTO Book VALUES(?,?,?,?,?,?)");
                add.setInt(1,Integer.parseInt(txt_bID.getText()));
                add.setString(2, txt_bName.getText());
                add.setString(3, txt_author.getText());
                add.setString(4, cmb_category.getSelectedItem().toString());
                add.setInt(5,Integer.parseInt(txt_quantity.getText()));
                add.setInt(6,Integer.parseInt(txt_price.getText()));
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this,"BOOK ADDED");
                DisplayBooks();
                clearALL();
                       
            } catch ( SQLException | NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error adding book: " + e.getMessage());
            }     
        }
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseClicked
        clearALL();
    }//GEN-LAST:event_btn_clearMouseClicked

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
        if (txt_bID.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter the Book ID to delete.");
    } else {
        Connection con = null;
        Statement delete = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
            String bid = txt_bID.getText();
            String query = "DELETE FROM bookstore.Book WHERE bID =" + bid;
            delete = con.createStatement();
            int rowsDeleted = delete.executeUpdate(query);

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(this, "BOOK DELETED");
                DisplayBooks();
                clearALL();
            } else {
                JOptionPane.showMessageDialog(this, "No book with the specified ID found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting book: " + e.getMessage());
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

    private void tbl_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bookMouseClicked
        DefaultTableModel model = (DefaultTableModel)tbl_book.getModel();
        int myIndex = tbl_book.getSelectedRow();
        txt_bID.setText(model.getValueAt(myIndex, 0).toString());
        txt_bName.setText(model.getValueAt(myIndex, 1).toString());
        txt_author.setText(model.getValueAt(myIndex, 2).toString());
        cmb_category.setSelectedItem(model.getValueAt(myIndex, 3).toString());
        txt_quantity.setText(model.getValueAt(myIndex, 4).toString());
        txt_price.setText(model.getValueAt(myIndex, 5).toString());       
    }//GEN-LAST:event_tbl_bookMouseClicked

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        if(txt_bID.getText().isEmpty() || txt_bName.getText().isEmpty() || txt_author.getText().isEmpty() || cmb_category.getSelectedIndex() == 0 || txt_quantity.getText().isEmpty() || txt_price.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"MISSING INFORMATION!");
    }
    else {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
            
            String updateQuery = "UPDATE bookstore.Book SET bName = ?, author = ?, category = ?, quantity = ?, price = ? WHERE bID = ?";
            
            PreparedStatement update = con.prepareStatement(updateQuery);
            
        
            update.setString(1, txt_bName.getText());
            update.setString(2, txt_author.getText());
            update.setString(3, cmb_category.getSelectedItem().toString());
            update.setInt(4, Integer.parseInt(txt_quantity.getText()));
            update.setInt(5, Integer.parseInt(txt_price.getText()));
            update.setInt(6, Integer.parseInt(txt_bID.getText()));
            
            int rowsAffected = update.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "BOOK EDITED");
                DisplayBooks();
                clearALL();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to edit book.");
            }
            
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error editing book: " + e.getMessage());
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
            tbl_book.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_printMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        new UserLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void lbl_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_employeeMouseClicked
        new Employee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_employeeMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backMouseClicked


    public static void main (String args[]){
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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JButton btn_print;
    private javax.swing.JComboBox<String> cmb_category;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_books;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_employee;
    private javax.swing.JTable tbl_book;
    private javax.swing.JTextField txt_author;
    private javax.swing.JTextField txt_bID;
    private javax.swing.JTextField txt_bName;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}
