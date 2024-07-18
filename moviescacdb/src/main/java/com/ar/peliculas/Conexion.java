package com.ar.peliculas;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    private Connection connection;
    
    public Conexion() {
        var properties = LoadProps();
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            this.connection = null; // Asegurarse de que connection sea null si hay un error
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public static Properties LoadProps() {
        var properties = new Properties();
        try (var stream = Conexion.class.getClassLoader().getResourceAsStream("config.properties")) {
            properties.load(stream);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return properties;
    }
    
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}