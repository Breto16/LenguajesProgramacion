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
        /*
        Implementacion de los Singleton y Abstract Factory
        al ejercicio de Agendas
                
        Eager Initialization:
            En este enfoque, la instancia única de la clase se crea de inmediato, independientemente de si se utilizará o no.
            La instancia se crea durante la carga de la clase y se almacena en un campo estático.
        Lazy Initialization:
            En este enfoque, la instancia única se crea solo cuando se solicita por primera vez.
            Es más eficiente en términos de recursos, ya que la instancia se crea solo cuando es necesaria.*/
        
        LazySingleton agenda = LazySingleton.getInstance();
        
           
        ContactoFactory contactoFactory = new ContactoFactory();
        AgendaFactory eventoFactory = new EventoFactory();


        // Ejemplo Crear contactos utilizando el Abstract Factory
        ContactoFamiliar padre = contactoFactory.crearContactoFamiliar("Juan", "Padre", "8845-6789");
        ContactoFamiliar madre = contactoFactory.crearContactoFamiliar("Maria", "Madre", "6065-4321");

        Evento evento1 = eventoFactory.crearEvento("Fiesta de cumpleaños", "Celebración", "Casa de Juan");
        Evento evento2 = eventoFactory.crearEvento("Conferencia", "Conferencia sobre Java", "Centro de Convenciones");

        // Agregar elementos a la agenda (utilizando Singleton)
        agenda.agregarElemento(padre);
        agenda.agregarElemento(madre);
        agenda.agregarElemento(evento1);
        agenda.agregarElemento(evento2);


        // Mostrar información de la agenda
        agenda.mostrarInformacion();
        
        
        
  
    }
}
