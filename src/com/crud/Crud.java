package com.crud;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.config.cConfig;
import com.game.*;



public class Crud {
    private static String getNameAfterLogin;
    private static String getName2ndPlayer;
    private static String defaultPhoto = "D:\\PRAKTIKUM PBO\\Project-PBO-Kelompok-11\\src\\upload\\customer.png";
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

            String query = "INSERT INTO ponggame (Username, Password, pathPhoto) VALUES (?,?,?)";

            try (PreparedStatement preparedStatement = cConfig.connect.prepareStatement(query)) {
                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, pass);
                preparedStatement.setString(3, defaultPhoto);
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
                if(userName.equals(getName())){
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
    public static String getName(){
        return getNameAfterLogin;
    }
    public static String getName2ndPlayer(){
        return getName2ndPlayer;
    }

    public static void addProfileData(String name) {
        cConfig.connection();

        try  {
            String query = "SELECT * FROM ponggame WHERE Username = ?";
            PreparedStatement statement = cConfig.connect.prepareStatement(query);
            statement.setString(1, name);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                // ExampleForLoby.getDataProfile(resultSet.getString("Username"));
                Profile.getDataProfile(resultSet.getString("Username"), resultSet.getString("pathPhoto"));
                      

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

     public static void add2ndPlayer(String name) {
        cConfig.connection();

        try  {
            String query = "SELECT * FROM ponggame WHERE Username = ?";
            PreparedStatement statement = cConfig.connect.prepareStatement(query);
            statement.setString(1, name);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {

                ExampleForLoby.get2ndPlayer(resultSet.getString("Username"));
                      

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
}
