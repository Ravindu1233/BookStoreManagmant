/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Billing extends javax.swing.JFrame {

    public Billing() {
        initComponents();
        
    }
    Connection con = null;
    Statement st = null;
    ResultSet Rs = null;
    
    public Billing(String UserName){
        initComponents();
        lbl_user.setText(UserName);
        DisplayBooks();
        counRow();
        txt_bookName.setEditable(false);
        txt_price.setEditable(false);
        txt_billNo.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        txt_bookName = new javax.swing.JTextField();
        txt_cusName = new javax.swing.JTextField();
        txt_qty = new javax.swing.JTextField();
        btn_addToBill = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_books = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        billTxt = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        lbl_back = new javax.swing.JLabel();
        lbl_grandTotal = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_billNo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Book Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Customer Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        txt_price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 74, 30));

        txt_bookName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txt_bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 151, -1));

        txt_cusName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txt_cusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 151, -1));

        txt_qty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 74, -1));

        btn_addToBill.setBackground(new java.awt.Color(51, 51, 255));
        btn_addToBill.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_addToBill.setForeground(new java.awt.Color(255, 255, 255));
        btn_addToBill.setText("Add To Bill");
        btn_addToBill.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_addToBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addToBillMouseClicked(evt);
            }
        });
        jPanel1.add(btn_addToBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 232, 150, 40));

        btn_clear.setBackground(new java.awt.Color(51, 51, 255));
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Reset");
        btn_clear.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clearMouseClicked(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Book List");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        tbl_books.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbl_books.setForeground(new java.awt.Color(153, 0, 255));
        tbl_books.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_books.setRowHeight(30);
        tbl_books.setSelectionBackground(new java.awt.Color(153, 0, 255));
        tbl_books.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbl_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_booksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_books);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 710, 280));

        billTxt.setColumns(20);
        billTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        billTxt.setRows(5);
        jScrollPane2.setViewportView(billTxt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 470, 292));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Bill");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 60, -1, -1));

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
        jPanel1.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 120, -1));

        lbl_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_back.setForeground(new java.awt.Color(51, 51, 255));
        lbl_back.setText("Back");
        lbl_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_backMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 500, -1, -1));

        lbl_grandTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_grandTotal.setForeground(new java.awt.Color(153, 0, 255));
        lbl_grandTotal.setText("_");
        jPanel1.add(lbl_grandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 390, 50, 30));

        lbl_user.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(51, 51, 255));
        lbl_user.setText("****User");
        lbl_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        lbl_close.setBackground(new java.awt.Color(51, 51, 255));
        lbl_close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(51, 51, 255));
        lbl_close.setText("Close");
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, 28));

        btn_logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(51, 51, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-logout-30.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 550, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Grand Total : Rs.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Bill No");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        txt_billNo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txt_billNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 99, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-books-50 1.png"))); // NOI18N
        jLabel25.setText("BOOKMART");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SimHei", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-bill-96.png"))); // NOI18N
        jLabel10.setText("BILLING");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        new UserLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
       System.exit(0);
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void lbl_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseClicked
       if(lbl_user.getText().equals("Admin")){
        new Dashboard().setVisible(true);
        this.dispose();
       }
       else{
           JOptionPane.showMessageDialog(this,"Doesn't Have permisstion!");
       }
    }//GEN-LAST:event_lbl_backMouseClicked

private void counRow() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        st = con.createStatement();
        Rs = st.executeQuery("SELECT * FROM bookstore.Bill ORDER BY Bno DESC LIMIT 1");
        
        
        if (Rs.next()) {    
            int bno = Rs.getInt("Bno")+1;
            txt_billNo.setText(""+bno);
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
    
    private void clearAll(){
        txt_bookName.setText("");
        txt_cusName.setText("");
        txt_price.setText("");
        txt_qty.setText("");
        billTxt.setText("");
        grandTotal = 0;
        i = 0;
        total = 0;
        lbl_grandTotal.setText("Rs."+grandTotal);
        txt_cusName.setEditable(true);
        
    }
    private void saveBill(){
        if(txt_billNo.getText().isEmpty() || txt_bookName.getText().isEmpty() || txt_cusName.getText().isEmpty() || txt_price.getText().isEmpty() || txt_qty.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"MISSING INFORMATION!");
        }
        else{
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                PreparedStatement add = con.prepareStatement("INSERT INTO Bill VALUES(?,?,?,?)");
                add.setInt(1,Integer.parseInt(txt_billNo.getText()));
                add.setString(2, lbl_user.getText());
                add.setString(3, txt_cusName.getText());
                add.setInt(4,Integer.parseInt(lbl_grandTotal.getText()));
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Bill Saved!");
                 
            } catch ( SQLException | NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error Saving Bill: " + e.getMessage());
            }     
        }
    }
    
    int bid ;
    private void updateBook(){
       int newQty = stock - Integer.parseInt(txt_qty.getText());
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");

        String updateQuery = "UPDATE bookstore.Book SET quantity = " + newQty + " WHERE bID = " + bid; 
        Statement update = con.prepareStatement(updateQuery);
        update.executeUpdate(updateQuery);
        JOptionPane.showMessageDialog(this, "Quantity Updated");
        DisplayBooks();

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
    
    int stock = 0;
    private void tbl_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_booksMouseClicked

        DefaultTableModel model = (DefaultTableModel)tbl_books.getModel();
        int myIndex = tbl_books.getSelectedRow();
        bid = Integer.parseInt(model.getValueAt(myIndex, 0).toString());
        txt_bookName.setText(model.getValueAt(myIndex, 1).toString());
        stock = Integer.parseInt(model.getValueAt(myIndex, 4).toString());
        txt_price.setText(model.getValueAt(myIndex, 5).toString()); 
    }//GEN-LAST:event_tbl_booksMouseClicked
int i = 0 , total = 0, grandTotal = 0;
    private void btn_addToBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addToBillMouseClicked
          if (txt_qty.getText().isEmpty() || txt_bookName.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "MISSING INFORMATION!");
    } else if (Integer.parseInt(txt_qty.getText()) > stock) {
        JOptionPane.showMessageDialog(this, "Not Enough Books In the Stock");
    } else {
        i++;
        total = Integer.parseInt(txt_price.getText()) * Integer.parseInt(txt_qty.getText());
        
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        
        if (i == 1) {
            billTxt.setText(billTxt.getText() + "=============BOOKMART============\n"
                + "Date & Time: " + formattedDateTime + "\n"
                + "No         Book         Price        Qty          Total\n" 
                + i + "          " + txt_bookName.getText() + "            " + txt_price.getText() 
                + "             " + txt_qty.getText() + "             " + total + "\n");
        } else {
            billTxt.setText(billTxt.getText() + i + "           " + txt_bookName.getText() 
                + "           " + txt_price.getText() + "           " + txt_qty.getText() 
                + "          " + total + "\n");
        }
        
        grandTotal = grandTotal + total;
        lbl_grandTotal.setText(Integer.toString(grandTotal));
        txt_cusName.setEditable(false);
    }                             
//        if(txt_qty.getText().isEmpty() || txt_bookName.getText().isEmpty()){
//            JOptionPane.showMessageDialog(this,"MISSING INFORMATION!");
//        }
//        else if(Integer.parseInt(txt_qty.getText())> stock){
//            JOptionPane.showMessageDialog(this,"Not Enough Books In the Stock");
//        }
//        else{
//            i++;
//            total = Integer.parseInt(txt_price.getText())* Integer.parseInt(txt_qty.getText());
//            if(i == 1){
//                billTxt.setText(billTxt.getText()+"====================BOOK STORE=========================\n"+"No         Book         Price        Qty          Total\n"+i+"          "+txt_bookName.getText()+"            "+txt_price.getText()+"             "+txt_qty.getText()+"             "+total+"\n");
//           
//            }
//            else{
//                billTxt.setText(billTxt.getText()+i+"           "+txt_bookName.getText()+"           "+txt_price.getText()+"           "+txt_qty.getText()+"          "+total+"\n");
//            }
//            grandTotal = grandTotal + total;
//            lbl_grandTotal.setText(Integer.toString(grandTotal));
//            
//        }
    }//GEN-LAST:event_btn_addToBillMouseClicked

    private void btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_printMouseClicked
        try {
            billTxt.print();
            saveBill();
            updateBook();
            clearAll();
            txt_cusName.setEditable(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_printMouseClicked

    private void btn_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clearMouseClicked
        clearAll();
    }//GEN-LAST:event_btn_clearMouseClicked


private void DisplayBooks(){
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
        st = con.createStatement();
        Rs = st.executeQuery("SELECT * FROM bookstore.Book");
        tbl_books.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
         e.printStackTrace();
    }
}

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea billTxt;
    private javax.swing.JButton btn_addToBill;
    private javax.swing.JButton btn_clear;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JButton btn_print;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_grandTotal;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTable tbl_books;
    private javax.swing.JTextField txt_billNo;
    private javax.swing.JTextField txt_bookName;
    private javax.swing.JTextField txt_cusName;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qty;
    // End of variables declaration//GEN-END:variables
}
