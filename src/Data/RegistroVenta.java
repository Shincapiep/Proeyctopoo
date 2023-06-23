package Data;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class RegistroVenta implements Serializable {
    private String peliculaSeleccionada;
    private String horaSeleccionada;
    private int cantidadEntradas;
    private List<Integer> asientosSeleccionados;
  //constructor
    public RegistroVenta(String peliculaSeleccionada, String horaSeleccionada, int cantidadEntradas) {
    this.peliculaSeleccionada = peliculaSeleccionada;
    this.horaSeleccionada = horaSeleccionada;
    this.cantidadEntradas = cantidadEntradas;
    this.asientosSeleccionados = new ArrayList<>();
    }

    public String getPeliculaSeleccionada() {
        return peliculaSeleccionada;
    }

    public void setPeliculaSeleccionada(String peliculaSeleccionada) {
        this.peliculaSeleccionada = peliculaSeleccionada;
    }

    public String getHoraSeleccionada() {
        return horaSeleccionada;
    }

    public void setHoraSeleccionada(String horaSeleccionada) {
        this.horaSeleccionada = horaSeleccionada;
    }

    public int getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    public List<Integer> getAsientosSeleccionados() {
        return asientosSeleccionados;
    }

    public void setAsientosSeleccionados(List<Integer> asientosSeleccionados) {
        this.asientosSeleccionados = asientosSeleccionados;
    }
}
