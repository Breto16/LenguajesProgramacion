package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public class ContactoLaboral extends Contacto {
    private String departamento;
    private String empresa;

    public ContactoLaboral(String nombre, String departamento, String empresa, String numeroTelefono) {
        super(nombre, "Laboral", numeroTelefono);
        this.departamento = departamento;
        this.empresa = empresa;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Contacto Laboral: " + nombre + ", Teléfono: " + numeroTelefono);
    }

    @Override
    public void mostrarInformacionAdicional() {
        System.out.println("Departamento: " + departamento + ", Empresa: " + empresa);
    }
}