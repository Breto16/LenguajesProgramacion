package lenguajesp2.ejercicio1;

/**
 *
 * @author Isaac Brenes
 */
public abstract class ObjetoRepresentable {
    private double x;
    private double y;

    public ObjetoRepresentable(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract void dibujar();
    
}
