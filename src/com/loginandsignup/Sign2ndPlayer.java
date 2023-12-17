package com.loginandsignup;

import javax.swing.JOptionPane;

import com.crud.Crud;

public class Sign2ndPlayer extends javax.swing.JFrame {
        public Sign2ndPlayer() {
                initComponents();
        }
        
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jButtonSignup = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jTextFieldUsername = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jButtongotologin = new javax.swing.JButton();
                jPasswordFieldPass = new javax.swing.JPasswordField();
                jPasswordFieldConfirm = new javax.swing.JPasswordField();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                jButtonSignup.setBackground(new java.awt.Color(229, 221, 210));
                jButtonSignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButtonSignup.setForeground(new java.awt.Color(80, 61, 66));
                jButtonSignup.setText("Sign Up");
                jButtonSignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 221, 210)));
                jButtonSignup.setOpaque(true);
                jButtonSignup.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonSignupActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(80, 61, 66));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("SIGN UP");

                jLabel3.setForeground(new java.awt.Color(80, 61, 66));
                jLabel3.setText("Username");

                jLabel4.setForeground(new java.awt.Color(80, 61, 66));
                jLabel4.setText("Password");

                jLabel5.setForeground(new java.awt.Color(80, 61, 66));
                jLabel5.setText("Confirm Password");

                jLabel6.setForeground(new java.awt.Color(80, 61, 66));
                jLabel6.setText("Already have an account?");

                jButtongotologin.setBackground(new java.awt.Color(229, 221, 210));
                jButtongotologin.setForeground(new java.awt.Color(80, 61, 66));
                jButtongotologin.setText("Login");
                jButtongotologin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtongotologinActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap(50, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                false)
                                                                                                                                .addComponent(jTextFieldUsername)
                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel2,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel4,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                300,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jPasswordFieldPass)
                                                                                                                                .addComponent(jPasswordFieldConfirm))
                                                                                                                .addGap(50, 50, 50))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                false)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel6)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(jButtongotologin))
                                                                                                                                .addComponent(jButtonSignup,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                260,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGap(70, 70, 70)))));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextFieldUsername,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordFieldPass,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordFieldConfirm,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonSignup,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                40,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jButtongotologin))
                                                                .addContainerGap(17, Short.MAX_VALUE)));

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

                jLabel1.setIcon(new javax.swing.ImageIcon(
                                "src\\assets\\BG-SignUp.jpg")); // NOI18N
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jButtonSignupActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSignupActionPerformed
                String username = jTextFieldUsername.getText();
                String password = String.valueOf(jPasswordFieldPass.getPassword());
                String confirmPass = String.valueOf(jPasswordFieldConfirm.getPassword());

                if (!password.equals(confirmPass)) {
                        JOptionPane.showMessageDialog(null, "Password Tidak Sama");
                        return;
                } else {
                        if (username.isEmpty() || password.isEmpty() || confirmPass.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Username dan Password Tidak Boleh Kosong");
                                return;
                        } else if (!Crud.cekRegsit(username, password)) {
                                Crud.tambahData(username, password);
                                Login2ndPlayer log = new Login2ndPlayer();
                                log.setLocationRelativeTo(null);
                                log.setVisible(true);
                                this.dispose();
                        }
                }

                System.out.println(username + password + confirmPass);
        }// GEN-LAST:event_jButtonSignupActionPerformed

        private void jButtongotologinActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtongotologinActionPerformed
                Login2ndPlayer login = new Login2ndPlayer();
                login.setVisible(true);
                login.pack();
                login.setLocationRelativeTo(null);
                this.dispose();
        }// GEN-LAST:event_jButtongotologinActionPerformed      

        private javax.swing.JButton jButtonSignup;
        private javax.swing.JButton jButtongotologin;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPasswordField jPasswordFieldConfirm;
        private javax.swing.JPasswordField jPasswordFieldPass;
        private javax.swing.JTextField jTextFieldUsername;
}
