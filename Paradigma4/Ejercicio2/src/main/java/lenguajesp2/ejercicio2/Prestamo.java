package lenguajesp2.ejercicio2;
import java.util.Date;

/**
 *
 * @author Isaac Brenes
 */
class Prestamo {
    private int codigoLibro;
    private int numeroSocio;
    private Date fechaPrestamo;

    public Prestamo(int codigoLibro, int numeroSocio, Date fechaPrestamo) {
        this.codigoLibro = codigoLibro;
        this.numeroSocio = numeroSocio;
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
    
}
