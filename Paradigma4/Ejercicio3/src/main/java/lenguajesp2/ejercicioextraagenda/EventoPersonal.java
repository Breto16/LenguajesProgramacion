package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public class EventoPersonal extends Evento {
    public EventoPersonal(String nombre, String breveDescripcion, String lugar) {
        super(nombre, "Personal", breveDescripcion, lugar);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Evento Personal: " + nombre);
    }

    @Override
    public void mostrarInformacionAdicional() {
        System.out.println("Breve Descripción: " + breveDescripcion + ", Lugar: " + lugar);
    }
}
