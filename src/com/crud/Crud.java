package com.crud;

import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.config.cConfig;



public class Crud {
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

            String query = "INSERT INTO ponggame (Username, Password) VALUES (?,?)";

            try (PreparedStatement preparedStatement = cConfig.connect.prepareStatement(query)) {
                preparedStatement.setString(1, userName);
                preparedStatement.setString(2, pass);
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
                    // cConfig.getParams(userName);
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
}
