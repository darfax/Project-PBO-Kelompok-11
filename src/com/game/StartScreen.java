package com.game;

public class StartScreen extends javax.swing.JFrame {

    public StartScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEnterGame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEnterGame.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEnterGame.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 1, 24)); // NOI18N
        jButtonEnterGame.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEnterGame.setText("Press to START");
        jButtonEnterGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterGameActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnterGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 327, 400, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Legion 5\\Downloads\\Frame 1.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnterGameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonEnterGameActionPerformed
        Lobby lobby = new Lobby();
        lobby.setVisible(true);
        lobby.pack();
        lobby.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_jButtonEnterGameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnterGame;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
