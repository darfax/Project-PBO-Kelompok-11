package com.crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.config.cConfig;
import com.game.*;
import com.ponggame.GamePanel;

public class Crud {
    public static int totalData;
    private static String getNameAfterLogin;
    private static String getName2ndPlayer;
    private static String defaultPhoto = "src\\upload\\customer.jpg";
    public static String[] AllPath = new String[5];
    public static String[] AllName = new String[5];
    public static int[] AllWin = new int[5];
    public static int pathCount = 0;
    public static int nameCount = 0;
    public static int winCount = 0;
  


    public static boolean cekRegsit(String userName, String pass) {
        cConfig.connection();
        boolean foundResult = false;
        try {
            cConfig.statement = cConfig.connect.createStatement();
            String query = "SELECT * FROM ponggame";
            cConfig.resultSet = cConfig.statement.executeQuery(query);

            boolean found = false;

            while (cConfig.resultSet.next()) {
                if (userName.equals(cConfig.resultSet.getString("Username"))
                        || pass.equals(cConfig.resultSet.getString("Password"))) {
                    JOptionPane.showMessageDialog(null, "Username Atau Password Sudah ada");
                    found = true;
                    foundResult = true;
                    break; // Keluar dari loop karena sudah ditemukan kecocokan

                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Register Berhasil");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal");
        }
        return foundResult;
    }

    public static void tambahData(String userName, String pass) {
        cConfig.connection();

        try {
            cConfig.statement = cConfig.connect.createStatement();

            String query = "INSERT INTO ponggame (Username, Password, pathPhoto, highScore, totalWin) VALUES (?,?,?,?,?)";

            try (PreparedStatement preparedStatement = cConfig.connect.prepareStatement(query)) {
                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, pass);
                preparedStatement.setString(3, defaultPhoto);
                preparedStatement.setInt(4, 0);
                preparedStatement.setInt(5, 0);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
                } else {
                    JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan");
                }
            }

        } catch (Exception e) {
            System.out.println("gagal");
        }
    }

    public static boolean cekForm(String userName, String pass) {
        cConfig.connection();
        boolean foundResult = false;
        try {
            cConfig.statement = cConfig.connect.createStatement();
            String query = "SELECT * FROM ponggame";
            cConfig.resultSet = cConfig.statement.executeQuery(query);

            boolean found = false;

            while (cConfig.resultSet.next()) {
                if (userName.equals(cConfig.resultSet.getString("Username"))
                        && pass.equals(cConfig.resultSet.getString("Password"))) {
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                    found = true;
                    foundResult = true;
                    getNameAfterLogin = userName;
                    // scorePast = resultSet.getInt("highScore");

                    break; // Keluar dari loop karena sudah ditemukan kecocokan

                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Username Atau Password Salah");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal");
        }
        return foundResult;
    }

    public static boolean find2ndPlayer(String userName, String pass) {
        cConfig.connection();
        boolean foundResult = false;
        try {
            cConfig.statement = cConfig.connect.createStatement();
            String query = "SELECT * FROM ponggame";
            cConfig.resultSet = cConfig.statement.executeQuery(query);

            boolean found = false;

            while (cConfig.resultSet.next()) {
                if (userName.equals(getName())) {
                    found = true;
                    JOptionPane.showMessageDialog(null, "Player Sudah Ada");
                    break;
                }
                if (userName.equals(cConfig.resultSet.getString("Username"))
                        && pass.equals(cConfig.resultSet.getString("Password"))) {
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                    found = true;
                    foundResult = true;
                    getName2ndPlayer = userName;
                    // scorePast = resultSet.getInt("highScore");

                    break; // Keluar dari loop karena sudah ditemukan kecocokan

                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Username Atau Password Salah");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal");
        }
        return foundResult;
    }

    public static String getName() {
        return getNameAfterLogin;
    }

    public static String getName2ndPlayer() {
        return getName2ndPlayer;
    }

    public static void addProfileData(String name) {
        cConfig.connection();

        try {
            String query = "SELECT * FROM ponggame WHERE Username = ?";
            PreparedStatement statement = cConfig.connect.prepareStatement(query);
            statement.setString(1, name);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // ExampleForLoby.getDataProfile(resultSet.getString("Username"));
                Profile.getDataProfile(resultSet.getString("Username"), resultSet.getString("pathPhoto"),
                        resultSet.getInt("highScore"), resultSet.getInt("totalWin"));
                Lobby.getDataProfile(resultSet.getString("Username"), resultSet.getString("pathPhoto"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void add2ndPlayer(String name) {
        cConfig.connection();

        try {
            String query = "SELECT * FROM ponggame WHERE Username = ?";
            PreparedStatement statement = cConfig.connect.prepareStatement(query);
            statement.setString(1, name);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Lobby.get2ndPlayer(resultSet.getString("Username"), resultSet.getString("pathPhoto"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updateData(String path) {
        cConfig.connection(); // Menggunakan koneksi satu kali di awal fungs
        try {
            String query = "UPDATE ponggame SET pathPhoto = ? WHERE Username = ?";
            PreparedStatement statement = cConfig.connect.prepareStatement(query);
            statement.setString(1, path);
            statement.setString(2, getName());
            statement.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }

    }

    public static void setScoreAndWinPastP1(String player1) {
        cConfig.connection();
        try {
            String query = "SELECT * FROM ponggame WHERE Username = ?";
            PreparedStatement statement = cConfig.connect.prepareStatement(query);
            statement.setString(1, player1);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                GamePanel.scorePastP1 = resultSet.getInt("highScore");
                GamePanel.winPastP1 = resultSet.getInt("totalWin");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void setScoreAndWinPastP2(String player2) {
        cConfig.connection();
        try {
            String query = "SELECT * FROM ponggame WHERE Username = ?";
            PreparedStatement statement = cConfig.connect.prepareStatement(query);
            statement.setString(1, player2);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                GamePanel.scorePastP2 = resultSet.getInt("highScore");
                 GamePanel.winPastP2 = resultSet.getInt("totalWin");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



    public static void updateScoreP1(String player1, int scoreUpdate) {
        cConfig.connection();

        try {
            String query = "UPDATE ponggame SET highScore = ? WHERE Username = ?";
            PreparedStatement statement = cConfig.connect.prepareStatement(query);
            statement.setInt(1, scoreUpdate);
            statement.setString(2, player1);
            statement.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }

    }
    public static void updateScoreP2(String player2, int scoreUpdate) {
        cConfig.connection();

        try {
            String query = "UPDATE ponggame SET highScore = ? WHERE Username = ?";
            PreparedStatement statement = cConfig.connect.prepareStatement(query);
            statement.setInt(1, scoreUpdate);
            statement.setString(2, player2);
            statement.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }

    }
    public static void updateWin(String player, int winUpdate, int winPast) {
        cConfig.connection();

        try {
            String query = "UPDATE ponggame SET totalWin = ? WHERE Username = ?";
            PreparedStatement statement = cConfig.connect.prepareStatement(query);
            statement.setInt(1, winPast+winUpdate);
            statement.setString(2, player);
            statement.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }

    }

    public static void showLeaderboard() {
        cConfig.connection();
        try {
            String query = "SELECT * FROM ponggame ORDER BY totalWin DESC";
            cConfig.statement = cConfig.connect.createStatement();
            ResultSet resultSet = cConfig.statement.executeQuery(query);
            while (resultSet.next()) {
                AllPath[pathCount++] = resultSet.getString("pathPhoto");
                AllName[nameCount++] = resultSet.getString("Username");
                AllWin[winCount++] = resultSet.getInt("totalWin");
                // data[countLeaderboard++] = (number++) + ". " + resultSet.getString("Username") + " Score : " + resultSet.getInt("highScore") + "\n";
                // System.out.println(AllName[5]);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
       
    }

    public static void getDatafromDatabase(){
        cConfig.connection();
        try {
            String query = "SELECT COUNT(*) AS totalWin FROM ponggame"; 
            cConfig.statement = cConfig.connect.createStatement();
            ResultSet resultSet = cConfig.statement.executeQuery(query);
            if (resultSet.next()) {
                totalData = resultSet.getInt("totalWin");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}
