package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public class EventoEducativo extends Evento {
    private String curso;

    public EventoEducativo(String nombre, String breveDescripcion, String lugar, String curso) {
        super(nombre, "Educativo", breveDescripcion, lugar);
        this.curso = curso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Evento Educativo: " + nombre);
    }

    @Override
    public void mostrarInformacionAdicional() {
        System.out.println("Breve Descripción: " + breveDescripcion + ", Lugar: " + lugar + ", Curso: " + curso);
    }
}
