package lenguajesp2.ejercicio1;

/**
 *
 * @author Isaac Brenes
 */
class Circulo extends ObjetoGeometrico {
    private double radio;

    public Circulo(double x, double y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando círculo de radio " + radio + " en (" + getX() + ", " + getY() + ")");
    }
}