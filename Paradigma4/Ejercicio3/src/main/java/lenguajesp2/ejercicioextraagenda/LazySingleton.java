/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenguajesp2.ejercicioextraagenda;

import java.util.ArrayList;

/**
 *
 * @author Isaac Brenes
 */

/*
Justificación para Lazy Initialization:
En este caso, el enfoque Lazy Initialization podría ser preferible para no crear la 
instancia de la agenda hasta que sea realmente necesaria, ahorrando recursos y mejorando 
el rendimiento, especialmente si la aplicación tiene una carga de inicio considerable. 
Sin embargo, la elección entre Eager Initialization y Lazy Initialization también 
depende del contexto específico y de los requisitos de la aplicación. Si la creación 
de la instancia de la agenda es económica y la aplicación requiere que esté disponible 
inmediatamente, entonces Eager Initialization podría ser mejor.
*/

public class LazySingleton {
    private static LazySingleton instance;

    private ArrayList<ElementoAgenda> elementos;

    private LazySingleton() {
        this.elementos = new ArrayList<>();
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
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
