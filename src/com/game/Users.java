package com.game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import com.crud.Crud;

class User {
    private String username;
    private int wins;
    private ImageIcon photo;
    public static String icon = "src\\assets\\icon-Trophy.png";

    public User(String username, int wins, String photoPath) {
        this.username = username;
        this.wins = wins;
        this.photo = new ImageIcon(photoPath);
    }

    public String getUsername() {
        return username;
    }

    public int getWins() {
        return wins;
    }

    public ImageIcon getScaledPhoto(int width, int height) {
        Image img = photo.getImage();
        Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }

    public ImageIcon getScaledIcon(int width, int height) {
        ImageIcon iconLeaderboard = new ImageIcon(User.icon.toString());
        Image img = iconLeaderboard.getImage();
        Image newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }
}

class LeaderboardPanel extends JPanel {
    static final int GAME_WIDTH = 400;
    static final int GAME_HEIGHT = 300;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    private ArrayList<User> users;
    private JList<User> userList;

    public LeaderboardPanel() {
        users = new ArrayList<>();

        if (Crud.totalData < 5) {
            for (int a = 0; a < Crud.totalData; a++) {
                users.add(new User(Crud.AllName[a], Crud.AllWin[a], Crud.AllPath[a]));
            }
        } else {

            for (int a = 0; a < Crud.AllName.length; a++) {
                users.add(new User(Crud.AllName[a], Crud.AllWin[a], Crud.AllPath[a]));
            }
        }

        setLayout(new BorderLayout());

        userList = new JList<>(users.toArray(new User[0]));
        userList.setCellRenderer(new UserListRenderer());
        JScrollPane scrollPane = new JScrollPane(userList);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        this.setPreferredSize(SCREEN_SIZE);

        add(scrollPane, BorderLayout.CENTER);
    }
}

class UserListRenderer extends DefaultListCellRenderer {
    private static final int ICON_WIDTH = 100;
    private static final int ICON_HEIGHT = 100;

    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
            boolean cellHasFocus) {
        if (value instanceof User) {
            User user = (User) value;
            JPanel panel = new JPanel(new BorderLayout());
            panel.setBackground(Color.WHITE);

            JPanel numberAndPhotoPanel = new JPanel();
            numberAndPhotoPanel.setLayout(new BoxLayout(numberAndPhotoPanel, BoxLayout.X_AXIS));
            numberAndPhotoPanel.setBackground(Color.WHITE);

            JLabel numberLabel = new JLabel(String.valueOf(index + 1));
            numberLabel.setHorizontalAlignment(SwingConstants.CENTER);
            numberLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            numberLabel.setPreferredSize(new Dimension(30, ICON_HEIGHT));
            numberAndPhotoPanel.add(numberLabel);

            numberAndPhotoPanel.add(Box.createRigidArea(new Dimension(5, 0)));

            JLabel photoLabel = new JLabel(user.getScaledPhoto(ICON_WIDTH, ICON_HEIGHT));
            numberAndPhotoPanel.add(Box.createHorizontalGlue());
            numberAndPhotoPanel.add(photoLabel);

            panel.add(numberAndPhotoPanel, BorderLayout.WEST);

            JPanel userInfoPanel = new JPanel(new GridLayout(2, 1, 5, 5));
            userInfoPanel.setOpaque(false);

            JLabel usernameLabel = new JLabel(user.getUsername());
            usernameLabel.setPreferredSize(new Dimension(200, 60));
            JPanel usernamePanel = new JPanel();
            usernamePanel.setPreferredSize(new Dimension(20, 50));
            usernamePanel.setBackground(Color.white);
            usernamePanel.add(usernameLabel);

            userInfoPanel.add(usernamePanel);

            JLabel winsLabel = new JLabel("Wins : " + user.getWins());

            winsLabel.setPreferredSize(new Dimension(200, 30));
            JPanel winsPanel = new JPanel();
            winsPanel.setPreferredSize(new Dimension(20, 50));
            winsPanel.setBackground(Color.white);
            winsPanel.add(winsLabel);

            userInfoPanel.add(winsPanel);

            panel.add(userInfoPanel, BorderLayout.CENTER);

            if (isSelected) {
                panel.setBorder(BorderFactory.createLineBorder(list.getSelectionBackground(), 2));
            } else {
                panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            }
            return panel;
        }
        return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
    }
}
