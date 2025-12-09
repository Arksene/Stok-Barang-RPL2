/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_rpl2_4ia09.utils;

import java.sql.Connection;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author LENOVO
 */
public class DatabaseConnection {
    
    @Autowired
    private DataSource dataSource;
    
    public void checkConnection() {
        try (Connection connection = dataSource.getConnection()) {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Koneksi ke database BERHASIL");
                System.out.println("Database URL : " + connection.getMetaData().getURL());
                System.out.println("Driver Name  : " + connection.getMetaData().getDriverName());
            } else {
                System.out.println("Koneksi ke database GAGAL!");
            }
        } catch (Exception e) {
            System.out.println("Gagal terhubung ke database!");
            e.printStackTrace();
        }
    }
}
