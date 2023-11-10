package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public class ContactoFamiliar extends Contacto {
    private String parentezco;

    public ContactoFamiliar(String nombre, String parentezco, String numeroTelefono) {
        super(nombre, "Familiar", numeroTelefono);
        this.parentezco = parentezco;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Contacto Familiar: " + nombre + ", Teléfono: " + numeroTelefono);
    }

    @Override
    public void mostrarInformacionAdicional() {
        System.out.println("Parentezco: " + parentezco);
    }
}
