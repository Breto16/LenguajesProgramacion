/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
class ContactoFactory implements AgendaFactory {
    @Override
    public Contacto crearContacto(String nombre, String numeroTelefono) {
        return new ContactoFamiliar(nombre, "Padre", numeroTelefono);
    }

    @Override
    public Evento crearEvento(String nombre, String breveDescripcion, String lugar) {
        throw new UnsupportedOperationException("No se puede crear un evento en la fábrica de contactos.");
    }
    public ContactoFamiliar crearContactoFamiliar(String nombre, String parentezco, String numeroTelefono) {
            return new ContactoFamiliar(nombre, parentezco, numeroTelefono);
    }
    // Métodos adicionales para crear contactos específicos
    public Contacto crearContactoEducativo(String nombre, String curso, String numeroTelefono) {
        return new ContactoEducativo(nombre, curso, numeroTelefono);
    }

    public Contacto crearContactoLaboral(String nombre, String departamento, String empresa, String numeroTelefono) {
        return new ContactoLaboral(nombre, departamento, empresa, numeroTelefono);
    }
}
