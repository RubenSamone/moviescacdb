package com.ar.usuarios;

public class usuario 
{
    private int idusuario;  // ID autoincremental del usuario (int)
    private String nombre; // Nombre y apellido personal (varchar)
    private String usuario;   // Nombre de usuario (varchar)
    private String email;   // Email del usuario (varchar)
    private String password;   // Password para el usuario (varchar)


    // Constructor vacío necesario para deserialización de JSON
    public usuario() {}

    // Constructor con parámetros para inicializar todos los atributos
    public usuario(int idusuario,String nombre, String usuario, String email, String password) 
    {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.usuario = usuario;
        this.email = email;
        this.password = password;
    }

    // Método getter para obtener el ID del usuario
    public int getIdUsuario() 
    {
        return idusuario;
    }

    // Método setter para establecer el ID del usuario
    public void setIdUsuario(int idusuario) 
    {
        this.idusuario = idusuario;
    }

    // Método getter para obtener el nombre y apellido
    public String getNombre() 
    {
        return nombre;
    }

    // Método setter para establecer el nombre y apellido
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    // Método getter para obtener el nombre de usuario
    public String getUsuario() 
    {
        return usuario;
    }

    // Método setter para establecer el nombre de usuario
    public void setUsuario(String usuario) 
    {
        this.usuario = usuario;
    }

    // Método getter para obtener el email
    public String getEmail() 
    {
        return email;
    }

    // Método setter para establecer el email
    public void setEmail(String email) 
    {
        this.email = email;
    }

    // Método getter para obtener la password
    public String getPassword() 
    {
        return password;
    }

    // Método setter para establecer la password
    public void setPassword(String password) 
    {
        this.password = password;
    }
}