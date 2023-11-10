package lenguajesp2.ejercicio2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Isaac Brenes
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        // Crear la lista de socios y libros
        List<Socio> socios = new ArrayList<>();
        List<Libro> libros = new ArrayList<>();

        // Crear libros y añadirlos a la lista
        libros.add(new Libro(1, "Java Programming", "John Doe"));
        libros.add(new Libro(2, "Data Structures", "Jane Smith"));
        libros.add(new Libro(3, "Introduction to Algorithms", "Alan Johnson"));
        libros.add(new Libro(4, "Python Basics", "Emily White"));
        libros.add(new Libro(5, "Web Development with JavaScript", "Chris Brown"));
        libros.add(new Libro(6, "Machine Learning Fundamentals", "Sarah Green"));
        libros.add(new Libro(7, "Artificial Intelligence in Practice", "Michael Miller"));
        libros.add(new Libro(8, "Database Design and SQL", "Laura Davis"));


        // Crear socios y añadirlos a la lista
        socios.add(new Socio(101, "Andrés Sánchez", "Avenida 7, Cartago"));
        socios.add(new Socio(102, "Sandra López", "Calle 10, Cartago"));

        // Ejemplo de préstamo de libros
        Date fechaActual = new Date();

        //Para el ejemplo de más adelante, Andrés Sánchez tendrá mas de 3 prestamos
        socios.get(0).prestarLibro(libros.get(0), fechaActual);
        socios.get(0).prestarLibro(libros.get(1), fechaActual);
        socios.get(1).prestarLibro(libros.get(2), fechaActual);
        socios.get(0).prestarLibro(libros.get(4), fechaActual);
        socios.get(0).prestarLibro(libros.get(7), fechaActual);
        
        //Libro que ya fue prestado
        socios.get(1).prestarLibro(libros.get(4), fechaActual);

        // Mostrar estado de los libros
        System.out.println("Estado de los libros después de los préstamos:");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                System.out.println("Libro " + libro.getCodigo() + ": " + libro.getTitulo() + " - Disponible");
            } else {
                Prestamo prestamo = obtenerPrestamo(libro.getCodigo(), socios);
                System.out.println("Libro " + libro.getCodigo() + ": " + libro.getTitulo() +
                        " - Prestado a " + obtenerNombreSocio(prestamo.getNumeroSocio(), socios));
            }
        }

        // Filtrar socios que tienen *más* de 3 libros prestados
        List<Socio> sociosConMasDe3Libros = socios
            .stream()
            .filter(s -> s.getPrestamos().size() > 3)
            .collect(Collectors.toList());

        // Mostrar socios con *más* de 3 libros prestados
        System.out.println("\nSocios con más de 3 libros prestados:");
        for (Socio socio : sociosConMasDe3Libros) {
            System.out.println("Número de Socio: " + socio.getNumeroSocio());
            System.out.println("Nombre: " + socio.getNombre());
            System.out.println("Libros Prestados: " + socio.getPrestamos().size());
            System.out.println("-----------------------------");
        }
    }
    private static String obtenerNombreSocio(int numeroSocio, List<Socio> socios) {
        for (Socio socio : socios) {
            if (socio.getNumeroSocio() == numeroSocio) {
                return socio.getNombre();
            }
        }
        return "Desconocido";
    }

    
    private static Prestamo obtenerPrestamo(int codigoLibro, List<Socio> socios) {
        for (Socio socio : socios) {
            for (Prestamo prestamo : socio.getPrestamos()) {
                if (prestamo.getCodigoLibro() == codigoLibro) {
                    return prestamo;
                }
            }
        }
        return null;
    }
}
