package ico.fes;

import java.util.Scanner;

public class Balon {
    private String tamano;
    private String color;
    private String deporte;

    public Balon(String tamano, String color, String deporte) {
        this.tamano = tamano;
        this.color = color;
        this.deporte = deporte;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tamano='" + tamano + '\'' +
                ", color='" + color + '\'' +
                ", deporte='" + deporte + '\'' +
                '}';
    }

    public void mostrarDeporte (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Su balon es pequeño mediano o grande? ");
        deporte = sc.next();
        if (tamano.equals("Pequeño"))
            System.out.println("Su balon es de golf o tennis");
        if (tamano.equals("mediano"))
            System.out.println("Su balon es DE USO INFANTIL");
        if (tamano.equals("Pequeño"))
            System.out.println("Su balon es de soccer, basketball o volleyball");

    }
    public void mostrardatos(){
        System.out.println("Este es su balon?"+tamano + color + deporte );
    }
}
