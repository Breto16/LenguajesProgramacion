/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public interface AgendaFactory {
    Contacto crearContacto(String nombre, String numeroTelefono);
    Evento crearEvento(String nombre, String breveDescripcion, String lugar);
}
