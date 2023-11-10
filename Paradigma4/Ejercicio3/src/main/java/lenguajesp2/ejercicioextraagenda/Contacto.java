package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public abstract class Contacto extends ElementoAgenda {
    protected String tipo;
    protected String numeroTelefono;

    public Contacto(String nombre, String tipo, String numeroTelefono) {
        super(nombre);
        this.tipo = tipo;
        this.numeroTelefono = numeroTelefono;
    }
    public abstract void mostrarInformacionAdicional();
}