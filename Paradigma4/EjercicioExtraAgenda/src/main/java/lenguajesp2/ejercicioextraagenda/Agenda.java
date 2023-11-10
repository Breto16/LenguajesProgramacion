package lenguajesp2.ejercicioextraagenda;

import java.util.ArrayList;

/**
 *
 * @author Isaac Brenes
 */
public class Agenda {
    private ArrayList<ElementoAgenda> elementos;

    public Agenda() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoAgenda elemento) {
        elementos.add(elemento);
    }

    public void mostrarInformacion() {
        for (ElementoAgenda elemento : elementos) {
            elemento.mostrarInformacion();
            if (elemento instanceof Contacto) {
                ((Contacto) elemento).mostrarInformacionAdicional();
            } else if (elemento instanceof Evento) {
                ((Evento) elemento).mostrarInformacionAdicional();
            }
            System.out.println();
        }
    }
}
