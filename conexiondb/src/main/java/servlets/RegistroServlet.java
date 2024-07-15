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
import conexion.conexion;

@WebServlet("/register")
public class RegistroServlet extends HttpServlet {
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
            String username = jsonRequest.getString("username");
            String password = jsonRequest.getString("password");
            String email = jsonRequest.getString("email");

            Connection conn = conexion.getConnection();
            String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, email);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) 
            {
                jsonResponse.put("success", true);
            } 
            else 
            {
                jsonResponse.put("success", false);
                jsonResponse.put("message", "Error inserting data");
            }

        } 
        catch (SQLException e) 
        {
            jsonResponse.put("success", false);
            jsonResponse.put("message", "Database error: " + e.getMessage());
        } 
        catch (Exception e) 
        {
            jsonResponse.put("success", false);
            jsonResponse.put("message", "Error: " + e.getMessage());
        }
        response.getWriter().write(jsonResponse.toString());
    }
}