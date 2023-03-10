package ico.fes;

public class Computadora {
    private String marca;
    private double capacidad;
    private String SistemaOperativo;

    public Computadora(String marca, double capacidad, String sistemaOperativo) {
        this.marca = marca;
        this.capacidad = capacidad;
        SistemaOperativo = sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", capacidad=" + capacidad +
                ", SistemaOperativo='" + SistemaOperativo + '\'' +
                '}';
    }
    public void encender() {
        System.out.println(marca + "Bienvenido CARGANDO...");
    }
        public void mostrarDatos(){
            System.out.println("Su computadora es de marca: "+marca+", contiene una capacidad de: "+capacidad+" de memomoria RAM y su sistema operativo es: "+SistemaOperativo);
        }

    }

