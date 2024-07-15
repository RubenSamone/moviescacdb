package conexion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class conexion 
{
    private static Connection conn;
    private static String url;
    private static String username;
    private static String password;

    static 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties properties = new Properties();
            properties.load(conexion.class.getResourceAsStream("/config.properties"));
            url = properties.getProperty("db.url");
            username = properties.getProperty("db.username");
            password = properties.getProperty("db.password");

            conn = DriverManager.getConnection(url, username, password);
        } 
        catch (SQLException | IOException e) 
        {
            e.printStackTrace();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() 
    {
        return conn;
    }
}


