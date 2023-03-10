package ico.fes;
import java.util.Scanner;
public class CuboRubik {
    private int divisiones;
    private String forma;
    private String dificultad;

    public CuboRubik(int divisiones, String forma, String dificultad) {
        this.divisiones = divisiones;
        this.forma = forma;
        this.dificultad = dificultad;
    }

    public int getDivisones() {
        return divisiones;
    }

    public void setDivisones(int divisones) {
        this.divisiones = divisones;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "divisones=" + divisiones +
                ", forma='" + forma + '\'' +
                ", dificultad='" + dificultad + '\'' +
                '}';
    }
    public void dificultad(){
        Scanner sc = new Scanner(System.in);

        System.out.println("cuantas divisiones tiene su cubo? ");

        if (divisiones >6 && divisiones >10000)
            System.out.println("Su dificultad es normal");
        if (divisiones >6 && divisiones >10000)
            System.out.println("La dificultad es alta");


    }
    public void pasos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas divisiones tiene su cubo?");
        if (divisiones == 3)
        System.out.println("Su cubo puede resolverse en 20 pasos");
        if ( divisiones == 5)
            System.out.println("Su cubo puede resolverse en 33 pasos");
        if ( divisiones == 6)
            System.out.println("Su cubo puede resolverse en 40 pasos");
        if ( divisiones == 4)
            System.out.println("Su cubo puede resolverse en 27 pasos");
if ( divisiones == 7)
            System.out.println("Su cubo puede resolverse en 47 pasos");
if ( divisiones == 8)
            System.out.println("Su cubo puede resolverse en 54 pasos");


    }
}
