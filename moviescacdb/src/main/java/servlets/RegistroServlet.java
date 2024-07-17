package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

import com.ar.usuarios.conexion;

@WebServlet("/register")
public class RegistroServlet extends HttpServlet 
{
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("application/json");
        JSONObject jsonResponse = new JSONObject();

        try 
        {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = request.getReader().readLine()) != null) 
            {
                sb.append(line);
            }
            JSONObject jsonRequest = new JSONObject(sb.toString());
            String name = jsonRequest.getString("name");
            String username = jsonRequest.getString("username");
            String email = jsonRequest.getString("email");
            String password = jsonRequest.getString("password");

            Connection conn = conexion.getConnection();
            String sql = "INSERT INTO users (name, username, email, password) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, username);
            stmt.setString(3, email);
            stmt.setString(4, password);


            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) 
            {
                jsonResponse.put("success", true);
            } 
            else 
            {
                jsonResponse.put("success", false);
                jsonResponse.put("message", "Error ingresando datos");
            }

        } 
        catch (SQLException e) 
        {
            jsonResponse.put("success", false);
            jsonResponse.put("message", "Error en Database: " + e.getMessage());
        } 
        catch (Exception e) 
        {
            jsonResponse.put("success", false);
            jsonResponse.put("message", "Error: " + e.getMessage());
        }
        response.getWriter().write(jsonResponse.toString());
    }
}