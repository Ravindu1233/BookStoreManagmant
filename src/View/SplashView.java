/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.*;

public class SplashView extends javax.swing.JFrame {


    public SplashView() {
        initComponents();
    }
     public void setPercentage(int percentage) {
        String percentageText = percentage + "%";
        lbl_percentage.setToolTipText(percentageText);
        lbl_percentage.setText(percentageText);
        myProgressbar.setValue(percentage);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplashJPanal = new javax.swing.JPanel();
        myProgressbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        lbl_percentage = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        SplashJPanal.setBackground(new java.awt.Color(255, 255, 255));
        SplashJPanal.setForeground(new java.awt.Color(51, 51, 255));
        SplashJPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myProgressbar.setBackground(new java.awt.Color(255, 255, 255));
        myProgressbar.setForeground(new java.awt.Color(153, 0, 255));
        SplashJPanal.add(myProgressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 680, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("LOADING.........");
        SplashJPanal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lbl_percentage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_percentage.setForeground(new java.awt.Color(51, 51, 255));
        lbl_percentage.setText("%");
        SplashJPanal.add(lbl_percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel25.setFont(new java.awt.Font("Cooper Black", 0, 60)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EAD CW Images/icons8-books-100 2.png"))); // NOI18N
        jLabel25.setText("BOOKMART");
        SplashJPanal.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        SplashJPanal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SplashJPanal, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SplashJPanal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


public static void main(String args[]) {
         SplashView MySplash = new SplashView();
    MySplash.setVisible(true);

    // Create a new thread for the loading task
    Thread loadingThread = new Thread(() -> {
        try {
            for (int i = 0; i <= 100; i++) {
               Thread.sleep(20); // Sleep for a short time to simulate loading
                MySplash.myProgressbar.setValue(i);
                String percentage = Integer.toString(i) + "%";
                MySplash.lbl_percentage.setToolTipText(percentage);
                MySplash.lbl_percentage.setText(percentage); // Set the text on the label
                MySplash.lbl_percentage.repaint(); // Explicitly repaint the label
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Once loading is done, open the UserLogin window and close the splash screen
        SwingUtilities.invokeLater(() -> {
            new UserLogin().setVisible(true);
            MySplash.dispose();
        });
    });

    loadingThread.start(); // Start the loading thread
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SplashJPanal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_percentage;
    private javax.swing.JProgressBar myProgressbar;
    // End of variables declaration//GEN-END:variables
}
