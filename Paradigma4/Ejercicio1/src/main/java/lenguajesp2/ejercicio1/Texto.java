package lenguajesp2.ejercicio1;

/**
 *
 * @author Isaac Brenes
 */
class Texto extends ObjetoRepresentable {
    private String contenido;

    public Texto(double x, double y, String contenido) {
        super(x, y);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando texto: " + contenido + " en (" + getX() + ", " + getY() + ")");
    }
}
