package lenguajesp2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac Brenes
 */
class Grupo extends ObjetoRepresentable {
    private List<ObjetoRepresentable> objetos;

    public Grupo(double x, double y) {
        super(x, y);
        this.objetos = new ArrayList<>();
    }

    public void agregarObjeto(ObjetoRepresentable objeto) {
        objetos.add(objeto);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando grupo en (" + getX() + ", " + getY() + ")");
        for (ObjetoRepresentable objeto : objetos) {
            objeto.dibujar();
        }
    }
}
