package com.tmd;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.game.Lobby;

public class TMD extends javax.swing.JFrame {
    GamePanel panel;
    Score score;
    public String pathGame = "src\\Icon\\bgforpong.jpg";

    public TMD() {
        initComponents();
    }

    private void initComponents() {
        panel = new GamePanel();
        GamePanel.setTMDInstance(this);
        SwingUtilities.invokeLater(() -> {
            System.out.println(GamePanel.countdown);

        });

        this.setTitle("TMD");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        // this.setBackground(new Color(34, 139, 34));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(153, 255, 102));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1090, Short.MAX_VALUE));
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 542, Short.MAX_VALUE));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 164, 1090, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(Lobby.usernamePlayer1);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 100, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(Lobby.usernamePlayer2);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 120, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 120, 31));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(Lobby.photosPlayer1);
        SwingUtilities.invokeLater(() -> {
            ImageIcon player1 = new ImageIcon(Lobby.photosPlayer1.toString());
            Image img = player1.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(),
                    Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(img);
            jLabel4.setIcon(ic);

        });

        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SwingUtilities.invokeLater(() -> {
            if (Score.player1 == 0) {
                jLabel5.setText("00");
            }
            if (Score.player2 == 0) {

                jLabel3.setText("00");
            }

        });

        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 120, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(Lobby.photosPlayer2);
        SwingUtilities.invokeLater(() -> {
            ImageIcon player2 = new ImageIcon(Lobby.photosPlayer2.toString());
            Image img = player2.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(),
                    Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(img);
            jLabel6.setIcon(ic);
            System.out.println("lebar : " + jLabel6.getWidth() + " tinggi : " + jLabel6.getHeight());

        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 100, 100));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1180, 750));

        pack();
    }// </editor-fold>

    public static void startTime() {
        GamePanel.countdownThread = new Thread(() -> {
            while (GamePanel.countdown > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                GamePanel.countdown--;
                SwingUtilities
                        .invokeLater(() -> jLabel8.setText(GamePanel.countdown / 60 + "." + GamePanel.countdown % 60));
            }
            if (GamePanel.countdown == 0) {
                GamePanel.endGame();
            }

        });
        GamePanel.countdownThread.start();
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;

}
