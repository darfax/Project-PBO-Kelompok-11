package com.game;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


import com.ponggame.PongGame;

import java.awt.*;

/**
 *
 * @author Legion 5
 */
public class Lobby extends javax.swing.JFrame {
    private static String pathDefault = "src\\upload\\customer.jpg";
    
    public static String photosPlayer1;
    public static String usernamePlayer1;

    public static String photosPlayer2;
    public static String usernamePlayer2;
    /**
     * Creates new form Lobby
     */
    public Lobby() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabelFotoP1 = new javax.swing.JLabel();
        jLabelStatusP1 = new javax.swing.JLabel();
        jLabelNamaP1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelFotoP2 = new javax.swing.JLabel();
        jLabelNamaP2 = new javax.swing.JLabel();
        jLabe1StatusP2 = new javax.swing.JLabel();
        jButtonLoginP2 = new javax.swing.JButton();
        jButtonStart = new javax.swing.JButton();
        jButtonSettings = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFotoP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelFotoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 76, 100, 100));

        jLabelStatusP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    
        getContentPane().add(jLabelStatusP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 100, 37));
        jLabelNamaP1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabelNamaP2.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabelStatusP1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabe1StatusP2.setFont(new java.awt.Font("Segoe UI", 1, 14));

        jLabelNamaP1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNamaP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        getContentPane().add(jLabelNamaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 194, 200, 37));

         if (usernamePlayer1 == null && photosPlayer1 == null) {
            SwingUtilities.invokeLater(() -> {
                ImageIcon player1 = new ImageIcon(pathDefault.toString());
                Image img1 = player1.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(),
                        Image.SCALE_SMOOTH);
                ImageIcon ic1 = new ImageIcon(img1);
                jLabel3.setIcon(ic1);

            });

            jLabelNamaP1.setText("Player 1");

            jLabelStatusP1.setText("NOT READY");

        } else {
            SwingUtilities.invokeLater(() -> {
                ImageIcon player1 = new ImageIcon(photosPlayer1.toString());
                Image img = player1.getImage().getScaledInstance(jLabelFotoP1.getWidth(), jLabelFotoP1.getHeight(),
                        Image.SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(img);
                jLabelFotoP1.setIcon(ic);

            });

            jLabelNamaP1.setText(usernamePlayer1);

            jLabelStatusP1.setText("READY");
        }

        jLabel7.setBackground(new java.awt.Color(229, 221, 210));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(80, 61, 66));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("1P");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 50, 40));

        jLabel8.setBackground(new java.awt.Color(229, 221, 210));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(80, 61, 66));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("2P");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 50, 40));

        jLabelFotoP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelFotoP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 76, 100, 100));

        jLabelNamaP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
     
        getContentPane().add(jLabelNamaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 194, 200, 37));

        jLabe1StatusP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    
        getContentPane().add(jLabe1StatusP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 249, 100, 37));

        if (usernamePlayer2 == null && photosPlayer2 == null) {
            SwingUtilities.invokeLater(() -> {
                ImageIcon player2 = new ImageIcon(pathDefault.toString());
                Image img = player2.getImage().getScaledInstance(jLabelFotoP2.getWidth(), jLabelFotoP2.getHeight(),
                        Image.SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(img);
                jLabelFotoP2.setIcon(ic);

            });

            jLabelNamaP2.setText("Player 2");

            jLabe1StatusP2.setText("NOT READY");

        } else {
            SwingUtilities.invokeLater(() -> {
                ImageIcon player2 = new ImageIcon(photosPlayer2.toString());
                Image img = player2.getImage().getScaledInstance(jLabelFotoP2.getWidth(), jLabelFotoP2.getHeight(),
                        Image.SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(img);
                jLabelFotoP2.setIcon(ic);

            });

            jLabelNamaP2.setText(usernamePlayer2);

            jLabe1StatusP2.setText("READY");
        }
       

        jButtonLoginP2.setBackground(new java.awt.Color(229, 221, 210));
        jButtonLoginP2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLoginP2.setText("Login");
        jButtonLoginP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginP2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLoginP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 256, -1, -1));

        jButtonStart.setBackground(new java.awt.Color(229, 221, 210));
        jButtonStart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonStart.setForeground(new java.awt.Color(80, 61, 66));
        jButtonStart.setText("START");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 200, 60));

        jButtonSettings.setBackground(new java.awt.Color(229, 221, 210));
        jButtonSettings.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSettings.setForeground(new java.awt.Color(80, 61, 66));
        jButtonSettings.setText("SETTINGS");
        jButtonSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSettingsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 130, 40));

        jButtonBack.setBackground(new java.awt.Color(229, 221, 210));
        jButtonBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(80, 61, 66));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 410, 80, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon("src\\Icon\\Frame 5.png")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSettingsActionPerformed
        Setting setting = new Setting();
        setting.setLocationRelativeTo(null);
        setting.setVisible(true);
    }//GEN-LAST:event_jButtonSettingsActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
        Setting.isSaved = false;
        StartScreen start = new StartScreen();
                        start.setLocationRelativeTo(null);
                        start.setVisible(true);
                        
                        this.dispose();
    }

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        if(jLabelStatusP1.getText() != "READY"){
            JOptionPane.showMessageDialog(null, "Player 1 Belum Siap");
            return;
        }
        if(jLabe1StatusP2.getText() != "READY"){
            JOptionPane.showMessageDialog(null, "Player 2 Belum Siap");
            return;
        }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PongGame game = new PongGame();
                game.setLocationRelativeTo(null);
                game.setVisible(true);

            }
        });
    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtonLoginP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginP2ActionPerformed
        Login2ndPlayer log = new Login2ndPlayer();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonLoginP2ActionPerformed
    public static void getDataProfile(String name, String path) {
        photosPlayer1 = path;
        usernamePlayer1 = name;
    }

    public static void get2ndPlayer(String name, String path) {
        photosPlayer2 = path;
        usernamePlayer2 = name;
    }
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
    private javax.swing.JButton jButtonLoginP2;
    private javax.swing.JButton jButtonSettings;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JLabel jLabe1StatusP2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFotoP1;
    private javax.swing.JLabel jLabelFotoP2;
    private javax.swing.JLabel jLabelNamaP1;
    private javax.swing.JLabel jLabelNamaP2;
    private javax.swing.JLabel jLabelStatusP1;
    private javax.swing.JButton jButtonBack;
    // End of variables declaration//GEN-END:variables
}
