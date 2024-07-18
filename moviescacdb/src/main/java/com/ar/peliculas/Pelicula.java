package com.ar.peliculas;

public class Pelicula 
{
    private int idpel;  // ID autoincremental de la pelicula (int)
    private String nombre; // Nombre de pelicula (varchar)
    private String descrip; // Descripcion de pelicula (varchar)
    private String portada;   // URL de portada (varchar)


    // Constructor vacío necesario para deserialización de JSON
    public Pelicula() {}

    // Constructor con parámetros para inicializar todos los atributos
    public Pelicula(int idpel, String nombre, String descrip, String portada) 
    {
        this.idpel = idpel;
        this.nombre = nombre;
        this.descrip = descrip;
        this.portada = portada;
    }

    // Método getter para obtener el ID de la pelicula
    public int getIdPel() 
    {
        return idpel;
    }

    // Método setter para establecer el ID de la pelicula
    public void setIdPel(int idpel) 
    {
        this.idpel = idpel;
    }

    // Método getter para obtener el nombre 
    public String getNombre() 
    {
        return nombre;
    }

    // Método setter para establecer el nombre 
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    // Método getter para obtener la descripcion
    public String getDescrip() 
    {
        return descrip;
    }

    // Método setter para establecer la descripcion
    public void setDescrip(String descrip) 
    {
        this.descrip = descrip;
    }

    // Método getter para obtener la imagen de portada
    public String getPortada() 
    {
        return portada;
    }

    // Método setter para establecer la imagen de portada
    public void setPortada(String portada) 
    {
        this.portada = portada;
    }
}