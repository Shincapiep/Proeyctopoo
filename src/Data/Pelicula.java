/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author LENOVO
 */
public class Pelicula {

    private String Nombre_pelicula, Descripcion, Clasificacion, Hora_proyeccion;
    private int Duracion;// en minutos

    public Pelicula(String Nombre_pelicula, String Descripcion, String Clasificacion, String Hora_proyeccion, int Duracion) {
        this.Nombre_pelicula = Nombre_pelicula;
        this.Descripcion = Descripcion;
        this.Clasificacion = Clasificacion;
        this.Hora_proyeccion = Hora_proyeccion;
        this.Duracion = Duracion;
    }

    public String getNombre_pelicula() {
        return Nombre_pelicula;
    }

    public void setNombre_pelicula(String Nombre_pelicula) {
        this.Nombre_pelicula = Nombre_pelicula;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getHora_proyeccion() {
        return Hora_proyeccion;
    }

    public void setHora_proyeccion(String Hora_proyeccion) {
        this.Hora_proyeccion = Hora_proyeccion;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Nombre_pelicula=" + Nombre_pelicula + ", Descripcion=" + Descripcion + ", Clasificacion=" + Clasificacion + ", Hora_proyeccion=" + Hora_proyeccion + ", Duracion=" + Duracion + '}';
    }

}
