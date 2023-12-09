package com.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSettingsMenu extends JFrame {
    private JComboBox<String> timeComboBox;
    private JComboBox<String> paddleColorComboBoxUser1;
    private JComboBox<String> paddleColorComboBoxUser2;

    public GameSettingsMenu() {
        // Setting up the frame
        setTitle("Game Settings Menu");
        setSize(600, 300); // Menyesuaikan lebar frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creating components
        JLabel timeLabel = new JLabel("Select Play Time:");
        String[] timeOptions = { "01:00", "05:00", "00:30" };
        timeComboBox = new JComboBox<>(timeOptions);

        JLabel paddleColorLabelUser1 = new JLabel("Select Paddle Color (User 1):");
        JLabel paddleColorLabelUser2 = new JLabel("Select Paddle Color (User 2):");

        String[] colorOptions = { "Red", "Green", "Blue", "Yellow" };
        paddleColorComboBoxUser1 = new JComboBox<>(colorOptions);
        paddleColorComboBoxUser2 = new JComboBox<>(colorOptions);

        JButton startGameButton = new JButton("Start Game");

        // Adding components to the frame
        setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        centerPanel.add(timeLabel);
        centerPanel.add(timeComboBox);
        centerPanel.add(paddleColorLabelUser1);
        centerPanel.add(paddleColorComboBoxUser1);
        centerPanel.add(paddleColorLabelUser2);
        centerPanel.add(paddleColorComboBoxUser2);

        add(centerPanel, BorderLayout.CENTER);
        add(startGameButton, BorderLayout.SOUTH);

        // Adding ActionListener for the Start Game button
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve selected values
                String selectedTime = (String) timeComboBox.getSelectedItem();
                String selectedPaddleColorUser1 = (String) paddleColorComboBoxUser1.getSelectedItem();
                String selectedPaddleColorUser2 = (String) paddleColorComboBoxUser2.getSelectedItem();

                // Check if User 2 selected the same color as User 1
                if (selectedPaddleColorUser1.equals(selectedPaddleColorUser2)) {
                    JOptionPane.showMessageDialog(GameSettingsMenu.this,
                            "User 2 cannot choose the same color as User 1.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(GameSettingsMenu.this,
                            "Time: " + selectedTime +
                                    "\nPaddle Color User 1: " + selectedPaddleColorUser1 +
                                    "\nPaddle Color User 2: " + selectedPaddleColorUser2,
                            "Game Settings",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameSettingsMenu().setVisible(true);
            }
        });
    }
}
