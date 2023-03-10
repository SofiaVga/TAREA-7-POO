package ico.fes;
import java.util.Scanner;
public class Lampara {
    private String tipo;
    private int intensidad;
    private String color;
    int prendida;

    public Lampara(String tipo, int intensidad, String color) {
        this.tipo = tipo;
        this.intensidad = intensidad;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "tipo='" + tipo + '\'' +
                ", intensidad='" + intensidad + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void controlar() {
        String prender = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("La lampara está apagada \n que intensidad del 1 al 3 deseas? ");
        prender = sc.next();
        if (prender.equals("1"))
            System.out.println("La intensidad ahora es " + intensidad);

        if (prender.equals("2"))
            System.out.println("La intensidad ahora es " + intensidad);

        if (prender.equals("3"))
            System.out.println("La intensidad ahora es " + intensidad);


    }

    public void encender() {

        if (prendida >= 1) {
            System.out.println("La lampara esta prendida");
        } else {
            System.out.println("La lampara esta apagada");
        }
    }
}
