
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UserLogin extends javax.swing.JFrame {

    public UserLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        pw_userPassword = new javax.swing.JPasswordField();
        cmb_role = new javax.swing.JComboBox<>();
        btn_login = new javax.swing.JButton();
        lbl_reset = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-books-50 1.png"))); // NOI18N
        jLabel1.setText("BOOKMART");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 290, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        txt_username.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_username.setForeground(new java.awt.Color(51, 51, 255));
        txt_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 200, -1));

        pw_userPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pw_userPassword.setForeground(new java.awt.Color(51, 51, 255));
        pw_userPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));
        jPanel1.add(pw_userPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 200, 30));

        cmb_role.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cmb_role.setForeground(new java.awt.Color(51, 51, 255));
        cmb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        cmb_role.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));
        jPanel1.add(cmb_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        btn_login.setBackground(new java.awt.Color(51, 51, 255));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 200, 40));

        lbl_reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_reset.setForeground(new java.awt.Color(51, 51, 255));
        lbl_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-reset-30.png"))); // NOI18N
        lbl_reset.setText("Reset");
        lbl_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_resetMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        lbl_close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(153, 0, 255));
        lbl_close.setText("Close");
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 50, 50));

        jPanel2.setBackground(new java.awt.Color(153, 0, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SimHei", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-web-design-100.png"))); // NOI18N
        jLabel4.setText("LOGIN");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_closeMouseClicked
   private void resetAll(){
       txt_username.setText("");
       pw_userPassword.setText("");
   }
    
    Connection con = null;
    Statement st = null;
    ResultSet Rs = null;
    
    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        if(cmb_role.getSelectedIndex()== -1){
             JOptionPane.showMessageDialog(this,"Please Select a role");
        }
        else if(txt_username.getText().isEmpty()|| pw_userPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Enter Username and password");
        }
        else if(cmb_role.getSelectedIndex()== 1){
            //Employee Selected
            String query = "SELECT * FROM bookstore.Employee WHERE eName = '"+txt_username.getText()+"'AND ePassword = '"+pw_userPassword.getText()+"' ";   
            String username = txt_username.getText();
            try {
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
                 st = con.createStatement();
                 Rs = st.executeQuery(query);
                 if(Rs.next()){
                     new Billing(username).setVisible(true);
                     this.dispose();
                 }
                 else{
                     JOptionPane.showMessageDialog(this,"Wrong UserName or Password");
                 }
                 
            } catch (Exception e) {
            }
        }
        else{
           if(txt_username.getText().equals("Admin") && pw_userPassword.getText().equals("password")) {
               new Dashboard().setVisible(true);
               this.dispose();
           }
           else{
               JOptionPane.showMessageDialog(this,"Please Contact Admin");
               resetAll();
           }
        }
    }//GEN-LAST:event_btn_loginMouseClicked

    private void lbl_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_resetMouseClicked
        resetAll();
    }//GEN-LAST:event_lbl_resetMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JComboBox<String> cmb_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_reset;
    private javax.swing.JPasswordField pw_userPassword;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
