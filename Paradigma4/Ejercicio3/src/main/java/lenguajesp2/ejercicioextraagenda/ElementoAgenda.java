package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */

public abstract class ElementoAgenda {
    protected String nombre;

    public ElementoAgenda(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mostrarInformacion();
}
