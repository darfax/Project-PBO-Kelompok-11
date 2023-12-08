package com.game;

import com.Menu.GameSettingsMenu;
import com.loginandsignup.Login;

public class Lobby extends javax.swing.JFrame {

    public Lobby() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabelFotoP1 = new javax.swing.JLabel();
        jLabelStatusP1 = new javax.swing.JLabel();
        jLabelNamaP1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonLoginP1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabelFotoP2 = new javax.swing.JLabel();
        jLabelNamaP2 = new javax.swing.JLabel();
        jLabe1StatusP2 = new javax.swing.JLabel();
        jButtonLoginP2 = new javax.swing.JButton();
        jButtonStart = new javax.swing.JButton();
        jButtonSettings = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFotoP1.setBackground(new java.awt.Color(51, 255, 51));
        jLabelFotoP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFotoP1.setText("Foto");
        jLabelFotoP1.setOpaque(true);
        getContentPane().add(jLabelFotoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 76, 100, 100));

        jLabelStatusP1.setBackground(new java.awt.Color(51, 255, 51));
        jLabelStatusP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatusP1.setText("Not Ready");
        jLabelStatusP1.setOpaque(true);
        getContentPane().add(jLabelStatusP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 100, 37));

        jLabelNamaP1.setBackground(new java.awt.Color(51, 255, 51));
        jLabelNamaP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNamaP1.setText("Nama");
        jLabelNamaP1.setOpaque(true);
        getContentPane().add(jLabelNamaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 194, 200, 37));

        jLabel7.setBackground(new java.awt.Color(153, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("1P");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 50, 40));

        jButtonLoginP1.setText("Login");
        jButtonLoginP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginP1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLoginP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 256, -1, -1));

        jLabel8.setBackground(new java.awt.Color(153, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2P");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 50, 40));

        jLabelFotoP2.setBackground(new java.awt.Color(51, 255, 51));
        jLabelFotoP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFotoP2.setText("Foto");
        jLabelFotoP2.setOpaque(true);
        getContentPane().add(jLabelFotoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 76, 100, 100));

        jLabelNamaP2.setBackground(new java.awt.Color(51, 255, 51));
        jLabelNamaP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNamaP2.setText("Nama");
        jLabelNamaP2.setOpaque(true);
        getContentPane().add(jLabelNamaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 194, 200, 37));

        jLabe1StatusP2.setBackground(new java.awt.Color(51, 255, 51));
        jLabe1StatusP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabe1StatusP2.setText("Not Ready");
        jLabe1StatusP2.setOpaque(true);
        getContentPane().add(jLabe1StatusP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 249, 100, 37));

        jButtonLoginP2.setText("Login");
        jButtonLoginP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginP2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLoginP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 256, -1, -1));

        jButtonStart.setText("START");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 200, 100));

        jButtonSettings.setText("GAME SETTINGS");
        jButtonSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 130, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Legion 5\\Downloads\\f0d7067a6b203008c9749db5419758e5 (1).png")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingsActionPerformed
        GameSettingsMenu settings = new GameSettingsMenu();
        settings.setVisible(true);
        settings.pack();
        settings.setLocationRelativeTo(null);
        // this.dispose();
    }//GEN-LAST:event_jButtonSettingsActionPerformed

    private void jButtonLoginP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginP1ActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonLoginP1ActionPerformed

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtonLoginP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginP2ActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonLoginP2ActionPerformed

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
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoginP1;
    private javax.swing.JButton jButtonLoginP2;
    private javax.swing.JButton jButtonSettings;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JLabel jLabe1StatusP2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFotoP1;
    private javax.swing.JLabel jLabelFotoP2;
    private javax.swing.JLabel jLabelNamaP1;
    private javax.swing.JLabel jLabelNamaP2;
    private javax.swing.JLabel jLabelStatusP1;
    // End of variables declaration//GEN-END:variables
}
