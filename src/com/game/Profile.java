package com.game;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.crud.Crud;

public class Profile extends javax.swing.JFrame {
        private String f = "src\\assets\\icon-Trophy.png";
        private String fileName = "";
        private static String userNameProfile;
        private static String defaultPath;

        private static int score;
        private static int win;

        private int getWidth;
        private int getHeight;

        public Profile() {
                initComponents();
        }

        private void initComponents() {
                jPanel1 = new javax.swing.JPanel();
                photos = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                usernameProfile = new javax.swing.JLabel();
                highScore = new javax.swing.JLabel();

                trophy = new javax.swing.JLabel();
                totalTrophy = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(photos, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 160,
                                                                Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(photos, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                jPanel2.setBackground(new java.awt.Color(204, 204, 204));

                SwingUtilities.invokeLater(() -> {
                        getWidth = photos.getWidth();
                        getHeight = photos.getHeight();
                        ImageIcon icon1 = new ImageIcon(defaultPath.toString());
                        Image img = icon1.getImage().getScaledInstance(getWidth, getHeight,
                                        Image.SCALE_SMOOTH);
                        ImageIcon ic = new ImageIcon(img);
                        photos.setIcon(ic);

                });

                usernameProfile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                usernameProfile.setText(userNameProfile);

                highScore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                highScore.setText("High Score : " + score);

                JButton addBtn = new JButton("Change Photo");
                addBtn.setBorderPainted(false);
                addBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addBtnActionPerformed(evt);
                        }
                });
                ImageIcon icon = new ImageIcon(f.toString());
                trophy.setIcon(icon);

                totalTrophy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                totalTrophy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                totalTrophy.setText(String.valueOf(win));

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(usernameProfile,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                120,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(81, 81, 81)
                                                                                                .addComponent(trophy)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(totalTrophy,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                23,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(addBtn,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                90,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(highScore,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                120,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(usernameProfile,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                41,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(trophy,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(totalTrophy,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(highScore,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                34, Short.MAX_VALUE)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(addBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGap(21, 21, 21)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(45, 45, 45)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jPanel1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(42, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>

        private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
                boolean valid = false;
                try {
                        JFileChooser chooser = new JFileChooser();
                        FileNameExtensionFilter filter = new FileNameExtensionFilter("File Gambar jpg/jpeg", "jpg",
                                        "jpeg");
                        chooser.setFileFilter(filter);
                        chooser.showOpenDialog(null);
                        File f = chooser.getSelectedFile();
                        ImageIcon icon = new ImageIcon(f.toString());
                        Image img = icon.getImage().getScaledInstance(photos.getWidth(), photos.getHeight(),
                                        Image.SCALE_SMOOTH);
                        ImageIcon ic = new ImageIcon(img);
                        photos.setIcon(ic);
                        this.fileName = f.getAbsolutePath();
                        try {
                                String newPath = "src/upload";
                                File directory = new File(newPath);
                                if (!directory.exists()) {
                                        directory.mkdirs();
                                }
                                File firstFile = null;
                                File lastFile = null;
                                String ext = this.fileName.substring(this.fileName.lastIndexOf(".") + 1);
                                firstFile = new File(fileName);
                                lastFile = new File(newPath + "/" + usernameProfile.getText() + "." + ext);
                                // System.out.println(firstFile);
                                Files.copy(firstFile.toPath(), lastFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                valid = true;
                                if (valid) {
                                        Crud.updateData(lastFile.getAbsolutePath());
                                }
                        } catch (Exception e) {
                                // TODO: handle exception
                        }

                } catch (Exception e) {

                }
        }

        public static void getDataProfile(String nama, String path, int highScore, int totalWin) {
                userNameProfile = nama;
                defaultPath = path;
                score = highScore;
                win = totalWin;
        }

        private javax.swing.JLabel highScore;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JLabel photos;
        private javax.swing.JLabel totalTrophy;
        private javax.swing.JLabel trophy;
        private javax.swing.JLabel usernameProfile;
}