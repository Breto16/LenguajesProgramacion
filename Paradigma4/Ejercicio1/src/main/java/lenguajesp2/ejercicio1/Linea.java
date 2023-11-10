package lenguajesp2.ejercicio1;

/**
 *
 * @author Isaac Brenes
 */
class Linea extends ObjetoGeometrico {
    private double longitud;

    public Linea(double x, double y, double longitud) {
        super(x, y);
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando línea de longitud " + longitud +
                " en (" + getX() + ", " + getY() + ")");
    }
}
