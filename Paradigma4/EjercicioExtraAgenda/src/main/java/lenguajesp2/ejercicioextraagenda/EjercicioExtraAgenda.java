/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lenguajesp2.ejercicioextraagenda;

/**
 *
 * @author Isaac Brenes
 */
public class EjercicioExtraAgenda {

    public static void main(String[] args) {
        
        //El ejercicio extra del repositorio consistia en implementar
        //los eventos a la agenda de contactos hecha en clase
        
        Agenda agenda = new Agenda();

        // Agregar contactos a la agenda
        ContactoFamiliar padre = new ContactoFamiliar("Juan", "Padre", "8845-6789");
        ContactoFamiliar madre = new ContactoFamiliar("Maria", "Madre", "6065-4321");
        ContactoEducativo estudiante = new ContactoEducativo("Carlos", "Compiladores", "8583-6752");
        ContactoEducativo profesor = new ContactoEducativo("Ana", "Algebra", "8933-1578");
        ContactoLaboral colega = new ContactoLaboral("Pedro", "Desarrollo", "SoftwareTI Inc.", "60089012");
        ContactoLaboral jefe = new ContactoLaboral("Laura", "Gerencia", "SoftwareTI Inc.", "8897-3645");

        agenda.agregarElemento(padre);
        agenda.agregarElemento(madre);
        agenda.agregarElemento(estudiante);
        agenda.agregarElemento(profesor);
        agenda.agregarElemento(colega);
        agenda.agregarElemento(jefe);

        // Agregar eventos a la agenda
        EventoPersonal fiesta = new EventoPersonal("Fiesta de cumpleaños", "Celebración del cumpleaños de Andrea", "Casa de Juan");
        EventoEducativo conferencia = new EventoEducativo("Conferencia", "Conferencia sobre Java", "Centro de Convenciones", "Java Basics");
        EventoLaboral reunion = new EventoLaboral("Reunión de trabajo", "Planificación estratégica", "Oficina", "Desarrollo", "SoftwareTI Inc.");
        EventoPersonal boda = new EventoPersonal("Boda de Ana", "Ceremonia y recepción", "Salón de eventos");
        EventoEducativo taller = new EventoEducativo("Taller de programación", "Taller práctico", "Aula F2-01", "Java Advanced");

        agenda.agregarElemento(fiesta);
        agenda.agregarElemento(conferencia);
        agenda.agregarElemento(reunion);
        agenda.agregarElemento(boda);
        agenda.agregarElemento(taller);

        // Mostrar información de la agenda
        agenda.mostrarInformacion();
    }
}
