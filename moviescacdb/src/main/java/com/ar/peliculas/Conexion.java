package com.ar.peliculas;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conexion
{
    private Connection connection;  // Objeto Connection para manejar la conexión a la base de datos
    
    // Constructor de la clase Conexion
    public Conexion()
    {
        var properties = LoadProps(); // Llamar a funcion para cargar los sets del archivo config.properties.

        String url = properties.getProperty("dbUrl"); // Se asigna la url de la base de datos mediante la funcion LoadProps();
        String username = properties.getProperty("username"); // Se asigna el usuario mediante la funcion LoadProps();
        String pass = properties.getProperty("password"); // Se asigna la password mediante la funcion LoadProps();

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Linea para cargar el Driver de JDBC.
            Connection connection = DriverManager.getConnection(url, username, pass); // Se crea la conexion a la base de datos.
            Statement statement = connection.createStatement(); // Se declara la conexion a la base de datos.

            connection.close(); // Cerramos la conexion.
        } 
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }

    // Método para obtener la conexión GETTER
    public Connection getConnection() 
    {
        return connection;  // Devuelve el objeto Connection establecido
    }

    public static Properties LoadProps() // Funcion para cargar los datos asignados en el archivo config.properties
    {
        var properties = new Properties();
        try (var stream = Conexion.class.getClassLoader().getResourceAsStream("config.properties")) 
        {
            properties.load(stream);
        }
        catch(IOException ex)
        {
            System.out.println(properties);
        }
        
        return properties;
    }

    // Método para cerrar la conexión
    public void close() 
    {
        try 
        {
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


}