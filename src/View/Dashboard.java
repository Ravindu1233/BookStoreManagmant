/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_employee = new javax.swing.JLabel();
        lbl_supplier = new javax.swing.JLabel();
        lbl_billing = new javax.swing.JLabel();
        lbl_reports = new javax.swing.JLabel();
        lbl_books = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_logout = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_employee.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_employee.setForeground(new java.awt.Color(51, 51, 255));
        lbl_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-employee-96.png"))); // NOI18N
        lbl_employee.setText("Employee");
        lbl_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_employeeMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 220, 110));

        lbl_supplier.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_supplier.setForeground(new java.awt.Color(51, 51, 255));
        lbl_supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-supplier-100 1.png"))); // NOI18N
        lbl_supplier.setText("Supplier");
        jPanel1.add(lbl_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 143, 212, -1));

        lbl_billing.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_billing.setForeground(new java.awt.Color(51, 51, 255));
        lbl_billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-bill-96.png"))); // NOI18N
        lbl_billing.setText("Billing");
        lbl_billing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_billingMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 321, 199, 105));

        lbl_reports.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_reports.setForeground(new java.awt.Color(51, 51, 255));
        lbl_reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-reports-100 1.png"))); // NOI18N
        lbl_reports.setText("Reports");
        lbl_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_reportsMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 207, 105));

        lbl_books.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_books.setForeground(new java.awt.Color(51, 51, 255));
        lbl_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-books-100.png"))); // NOI18N
        lbl_books.setText("Books");
        lbl_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_booksMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 182, 110));

        jPanel2.setBackground(new java.awt.Color(153, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SimHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-dashboards-64.png"))); // NOI18N
        jLabel1.setText("DASHBOARD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, -1));

        lbl_logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_logout.setForeground(new java.awt.Color(51, 51, 255));
        lbl_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-logout-30.png"))); // NOI18N
        lbl_logout.setText("Logout");
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-books-50 1.png"))); // NOI18N
        jLabel3.setText("BOOKMART");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        lbl_close.setBackground(new java.awt.Color(255, 255, 255));
        lbl_close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(153, 0, 255));
        lbl_close.setText("Close");
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 890, 528));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_booksMouseClicked
        new Books().setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_lbl_booksMouseClicked

    private void lbl_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_employeeMouseClicked
        new Employee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_employeeMouseClicked

    private void lbl_billingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_billingMouseClicked
        new Billing("Admin").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_billingMouseClicked

    private void lbl_reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reportsMouseClicked
        new Report().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_reportsMouseClicked

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
        new UserLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_billing;
    private javax.swing.JLabel lbl_books;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_employee;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_reports;
    private javax.swing.JLabel lbl_supplier;
    // End of variables declaration//GEN-END:variables
}
