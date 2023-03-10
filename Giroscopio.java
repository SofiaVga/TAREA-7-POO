package ico.fes;

public class Giroscopio {
    private float precio;
    private double velocidadRotacion;
    private String posicion;
    int funcionando;

    public Giroscopio(float precio, double velocidadRotacion, String posicion) {
        this.precio = precio;
        this.velocidadRotacion = velocidadRotacion;
        this.posicion = posicion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public double getVelocidadRotacion() {
        return velocidadRotacion;
    }

    public void setVelocidadRotacion(double velocidadRotacion) {
        this.velocidadRotacion = velocidadRotacion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Giroscopio() {
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "precio=" + precio +
                ", velocidadRotacion=" + velocidadRotacion +
                ", posicion='" + posicion + '\'' +
                '}';
    }

    public void precio() {
        if (precio < 1000)
            System.out.println("La calidad del giroscopio es buena");
        if (precio >= 1000)
            System.out.println("La calidad del giroscopio no es buena");

    }

    public void funcionamiento() {
        if (funcionando >= 1) {
            System.out.println("El giroscopio esta funcionando");
        } else {
            System.out.println("El giroscopio no funciona");
        }

    }
}
