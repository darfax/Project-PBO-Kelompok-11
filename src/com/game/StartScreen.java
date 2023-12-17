package com.game;

import com.crud.Crud;

public class StartScreen extends javax.swing.JFrame {
    public StartScreen() {
        initComponents();
    }

    private void initComponents() {
        jButtonProfile = new javax.swing.JButton();
        jButtonPlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonLeaderboards = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonProfile.setBackground(new java.awt.Color(229, 221, 210));
        jButtonProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonProfile.setForeground(new java.awt.Color(80, 61, 66));
        jButtonProfile.setIcon(new javax.swing.ImageIcon("src\\assets\\icon-User.png")); // NOI18N
        jButtonProfile.setText("Profile");
        jButtonProfile.setAutoscrolls(true);
        jButtonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfileActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 110, 50));

        jButtonPlay.setBackground(new java.awt.Color(229, 221, 210));
        jButtonPlay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonPlay.setForeground(new java.awt.Color(80, 61, 66));
        jButtonPlay.setText("PLAY");
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 400, 60));

        jLabel1.setBackground(new java.awt.Color(228, 87, 84));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 221, 210));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TMD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 400, 200));

        jButtonLeaderboards.setBackground(new java.awt.Color(229, 221, 210));
        jButtonLeaderboards.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLeaderboards.setForeground(new java.awt.Color(80, 61, 66));
        jButtonLeaderboards.setIcon(new javax.swing.ImageIcon("src\\assets\\icon-Leaderboards.png")); // NOI18N
        jButtonLeaderboards.setText("Leaderboards");
        jButtonLeaderboards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeaderboardsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLeaderboards, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 151, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("src\\assets\\BG-Startscreen.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLeaderboardsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonLeaderboardsActionPerformed
        Crud.showLeaderboard();
        Leaderboard leaderboard = new Leaderboard();
        leaderboard.setLocationRelativeTo(null);
        leaderboard.setVisible(true);
    }// GEN-LAST:event_jButtonLeaderboardsActionPerformed

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonPlayActionPerformed
        Crud.addProfileData(Crud.getName());
        Lobby lobby = new Lobby();
        lobby.setVisible(true);
        lobby.pack();
        lobby.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_jButtonPlayActionPerformed

    private void jButtonProfileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonProfileActionPerformed
        Crud.addProfileData(Crud.getName());
        Profile profile = new Profile();
        profile.setLocationRelativeTo(null);
        profile.setVisible(true);
    }// GEN-LAST:event_jButtonProfileActionPerformed

    private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jButtonLeaderboards;
}