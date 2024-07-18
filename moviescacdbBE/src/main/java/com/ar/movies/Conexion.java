package com.ar.movies;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion 
{
    private Connection connection;  // Objeto Connection para manejar la conexión a la base de datos

    // Constructor de la clase Conexion
    public Conexion() 
    {
        var properties = LoadProps();
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            e.printStackTrace();
            this.connection = null; // Asegurarse de que connection sea null si hay un error
        }
    }

    // Método para obtener la conexión GETTER
    public Connection getConnection() 
    {
        return connection;  // Devuelve el objeto Connection establecido
    }

    // Método para cerrar la conexión
    public void close() 
    {
        try {
            // Verificar si la conexión no es nula y está abierta, entonces cerrarla
            if (connection != null && !connection.isClosed()) 
            {
                connection.close();  // Cierra la conexión a la base de datos
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();  // Imprimir el error en caso de problemas al cerrar la conexión
        }
    }

    public static Properties LoadProps() 
    {
        var properties = new Properties();
        try (var stream = Conexion.class.getClassLoader().getResourceAsStream("config.properties")) 
        {
            properties.load(stream);
        } 
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
        return properties;
    }
    
}
