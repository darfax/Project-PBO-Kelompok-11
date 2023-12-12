package com.loginandsignup;
import java.awt.*;

import javax.swing.JButton;

 public class RoundedButton extends JButton {
        private Color backgroundColor;
        private Color hoverColor;
        private Color pressedColor;
    
        public RoundedButton(String text) {
            super(text);
            setContentAreaFilled(false);
            setFocusPainted(false);
            setOpaque(false);
            setBackground(new Color(0, 0, 0, 0)); // Atur latar belakang menjadi transparan
            this.backgroundColor = new Color(78, 110, 200);
            this.hoverColor = new Color(100, 130, 220);
            this.pressedColor = new Color(60, 90, 180);
            setForeground(Color.WHITE);
            setFont(new Font("Segoe UI", Font.BOLD, 12));
    
            // Tambahkan listener untuk merubah warna ketika hover atau klik
            addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    setBackground(hoverColor);
                }
    
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    setBackground(backgroundColor);
                }
    
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    setBackground(pressedColor);
                }
    
                @Override
                public void mouseReleased(java.awt.event.MouseEvent evt) {
                    setBackground(backgroundColor);
                }
            });
        }
    
        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isPressed()) {
                g.setColor(pressedColor);
            } else if (getModel().isRollover()) {
                g.setColor(hoverColor);
            } else {
                g.setColor(backgroundColor);
            }
            // Menggambar tombol dengan bentuk bulat
            g.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10);
            super.paintComponent(g);
        }
    
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(120, 40); // Atur ukuran tombol
        }
    }