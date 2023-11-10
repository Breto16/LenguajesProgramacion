package lenguajesp2.ejercicio1;

/**
 *
 * @author Isaac Brenes
 */
class Rectangulo extends ObjetoGeometrico {
    private double ancho;
    private double alto;

    public Rectangulo(double x, double y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando rectángulo de dimensiones " + ancho + "x" + alto +
                " en (" + getX() + ", " + getY() + ")");
    }
}