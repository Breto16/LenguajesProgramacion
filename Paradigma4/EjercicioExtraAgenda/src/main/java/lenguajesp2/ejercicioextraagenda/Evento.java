package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public abstract class Evento extends ElementoAgenda {
    protected String tipo;
    protected String breveDescripcion;
    protected String lugar;

    public Evento(String nombre, String tipo, String breveDescripcion, String lugar) {
        super(nombre);
        this.tipo = tipo;
        this.breveDescripcion = breveDescripcion;
        this.lugar = lugar;
    }

    public abstract void mostrarInformacionAdicional();

    
}
