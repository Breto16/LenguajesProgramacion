package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public class ContactoEducativo extends Contacto {
    private String curso;

    public ContactoEducativo(String nombre, String curso, String numeroTelefono) {
        super(nombre, "Educativo", numeroTelefono);
        this.curso = curso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Contacto Educativo: " + nombre + ", Teléfono: " + numeroTelefono);
    }

    @Override
    public void mostrarInformacionAdicional() {
        System.out.println("Curso: " + curso);
    }
}