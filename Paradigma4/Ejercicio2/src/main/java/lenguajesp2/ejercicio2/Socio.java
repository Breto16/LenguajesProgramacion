package lenguajesp2.ejercicio2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Isaac Brenes
 */
class Socio {
    private int numeroSocio;
    private String nombre;
    private String direccion;
    private List<Prestamo> prestamos;

    public Socio(int numeroSocio, String nombre, String direccion) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.prestamos = new ArrayList<>();
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void prestarLibro(Libro libro, Date fechaPrestamo) {
        if (libro.isDisponible()) {
            Prestamo prestamo = new Prestamo(libro.getCodigo(), numeroSocio, fechaPrestamo);
            prestamos.add(prestamo);
            libro.setDisponible(false);
        } else {
            System.out.println("El libro ya fue prestado.");
        }
    }
}