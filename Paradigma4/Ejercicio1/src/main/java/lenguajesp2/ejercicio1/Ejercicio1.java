package lenguajesp2.ejercicio1;

/**
 *
 * @author Isaac Brenes
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Texto texto = new Texto(10, 20, "Hola, mundo!");
        Circulo circulo = new Circulo(30, 40, 5);

        //Un grupo con el texto y círculo
        Grupo grupo1 = new Grupo(50, 60);
        grupo1.agregarObjeto(texto);
        grupo1.agregarObjeto(circulo);

        Rectangulo rectangulo = new Rectangulo(70, 80, 8, 12);
        Linea linea = new Linea(90, 100, 15);

        //Otro grupo con el rectángulo y línea
        Grupo grupo2 = new Grupo(110, 120);
        grupo2.agregarObjeto(rectangulo);
        grupo2.agregarObjeto(linea);

        //Un grupo que contiene los dos grupos anteriores
        Grupo grupoPrincipal = new Grupo(0, 0);
        grupoPrincipal.agregarObjeto(grupo1);
        grupoPrincipal.agregarObjeto(grupo2);

        // Dibujar el grupo principal, que contiene dos grupos que a su vez contienen otros objetos
        grupoPrincipal.dibujar();
    }
}
