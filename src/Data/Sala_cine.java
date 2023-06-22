/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Sala_cine {

    private static final int CAPACIDAD_SALA = 20;
    private static final int PRECIO_ENTRADA = 10000;
    private int Asientos_ocupados;
    private List<Pelicula> Cartelera;

    public Sala_cine(int Asientos_ocupados, List<Pelicula> Cartelera) {
        this.Asientos_ocupados = Asientos_ocupados;
        this.Cartelera = Cartelera;
    }

    public int getAsientos_ocupados() {
        return Asientos_ocupados;
    }

    public void setAsientos_ocupados(int Asientos_ocupados) {
        this.Asientos_ocupados = Asientos_ocupados;
    }

    public List<Pelicula> getCartelera() {
        return Cartelera;
    }

    public void setCartelera(List<Pelicula> Cartelera) {
        this.Cartelera = Cartelera;
    }

    public Sala_cine() {
        Cartelera = new ArrayList<>();
        Asientos_ocupados = 0;
        inicializarCartelera();

    }

    private void inicializarCartelera() {
        Cartelera.add(new Pelicula("Los colores de la montaña", "Descripción de Los colores de la montaña", "Clasificación de Los colores de la montaña", "14:00", 120));
        Cartelera.add(new Pelicula("La estrategia caracol", "Descripción de La estrategia caracol", "Clasificación de La estrategia caracol", "16:30", 90));
        Cartelera.add(new Pelicula("El abrazo de la serpiente", "Descripción de El abrazo de la serpiente", "Clasificación de El abrazo de la serpiente", "19:00", 90));
    }

    public void mostrarCartelera() {
        StringBuilder mensaje = new StringBuilder("Cartelera Actual:\n");

        for (Pelicula pelicula : Cartelera) {
            mensaje.append("- ").append(pelicula.getNombre_pelicula()).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    public void agregarPelicula() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la película:");
        String descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripción de la película:");
        int duracion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la duración de la película en minutos:"));
        String clasificacion = JOptionPane.showInputDialog(null, "Ingrese la clasificación de la película:");
        String horaProyeccion = JOptionPane.showInputDialog(null, "Ingrese la hora de proyección de la película:");

        Pelicula pelicula = new Pelicula(nombre, descripcion, clasificacion, horaProyeccion, duracion);
        Cartelera.add(pelicula);

        JOptionPane.showMessageDialog(null, "La película ha sido agregada a la cartelera.");
    }

    public void eliminarPelicula() {
        String peliculaSeleccionada = JOptionPane.showInputDialog(null, "Ingrese el nombre de la película que desea eliminar:");

        Pelicula pelicula = null;
        for (Pelicula p : Cartelera) {
            if (p.getNombre_pelicula().equalsIgnoreCase(peliculaSeleccionada)) {
                pelicula = p;
                break;
            }
        }

        if (pelicula == null) {
            JOptionPane.showMessageDialog(null, "La película seleccionada no está en la cartelera.");
        } else {
            Cartelera.remove(pelicula);
            JOptionPane.showMessageDialog(null, "La película ha sido eliminada de la cartelera.");
        }
    }

    public void venderEntradas() {
        mostrarCartelera();
        String peliculaSeleccionada = JOptionPane.showInputDialog(null, "Ingrese el nombre de la película que desea ver:");

        Pelicula pelicula = null;
        for (Pelicula p : Cartelera) {
            if (p.getNombre_pelicula().equalsIgnoreCase(peliculaSeleccionada)) {
                pelicula = p;
                break;
            }
        }

        if (pelicula == null) {
            JOptionPane.showMessageDialog(null, "La película seleccionada no está disponible en la cartelera.");
            return;
        }

        int cantidadEntradas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de entradas que desea comprar:"));

        int sillasLibres = CAPACIDAD_SALA - Asientos_ocupados;
        if (cantidadEntradas > sillasLibres) {
            JOptionPane.showMessageDialog(null, "No hay suficientes sillas disponibles. Por favor, seleccione una cantidad menor.");
            return;
        }

        String formaPago = JOptionPane.showInputDialog(null, "Seleccione la forma de pago (efectivo, tarjeta, etc.):");

        int totalPagar = cantidadEntradas * PRECIO_ENTRADA;
        JOptionPane.showMessageDialog(null, "¡Compra realizada!\n"
                + "Película: " + pelicula.getNombre_pelicula() + "\n"
                + "Cantidad de entradas: " + cantidadEntradas + "\n"
                + "Forma de pago: " + formaPago + "\n"
                + "Total a pagar: " + totalPagar + " pesos colombianos");

        Asientos_ocupados += cantidadEntradas;
    }

    public void mostrarEstadisticas() {
        int sillasLibres = CAPACIDAD_SALA - Asientos_ocupados;
        int sillasOcupadas = Asientos_ocupados;
        double porcentajeOcupacion = (double) sillasOcupadas / CAPACIDAD_SALA * 100;

        StringBuilder mensaje = new StringBuilder("Estadísticas:\n");
        mensaje.append("- Sillas ocupadas: ").append(sillasOcupadas).append("\n");
        mensaje.append("- Sillas libres: ").append(sillasLibres).append("\n");
        mensaje.append("- Porcentaje de ocupación: ").append(String.format("%.2f", porcentajeOcupacion)).append("%");

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
    public void horario(){
              
    }

}
