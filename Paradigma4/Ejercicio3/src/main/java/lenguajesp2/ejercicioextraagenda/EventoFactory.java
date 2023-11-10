/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public class EventoFactory implements AgendaFactory {
    @Override
    public Contacto crearContacto(String nombre, String numeroTelefono) {
        throw new UnsupportedOperationException("No se puede crear un contacto en la fábrica de eventos.");
    }

    @Override
    public Evento crearEvento(String nombre, String breveDescripcion, String lugar) {
        return new EventoPersonal(nombre, breveDescripcion, lugar);
    }

    // Métodos adicionales para crear eventos específicos
    public Evento crearEventoEducativo(String nombre, String breveDescripcion, String lugar, String curso) {
        return new EventoEducativo(nombre, breveDescripcion, lugar, curso);
    }

    public Evento crearEventoLaboral(String nombre, String breveDescripcion, String lugar, String departamento, String empresa) {
        return new EventoLaboral(nombre, breveDescripcion, lugar, departamento, empresa);
    }
}
