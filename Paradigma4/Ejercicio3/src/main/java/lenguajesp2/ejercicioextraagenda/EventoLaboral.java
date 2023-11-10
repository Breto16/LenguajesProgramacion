package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public class EventoLaboral extends Evento {
    private String departamento;
    private String empresa;

    public EventoLaboral(String nombre, String breveDescripcion, String lugar, String departamento, String empresa) {
        super(nombre, "Laboral", breveDescripcion, lugar);
        this.departamento = departamento;
        this.empresa = empresa;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Evento Laboral: " + nombre);
    }

    @Override
    public void mostrarInformacionAdicional() {
        System.out.println("Breve Descripción: " + breveDescripcion + ", Lugar: " + lugar +
                ", Departamento: " + departamento + ", Empresa: " + empresa);
    }
}
