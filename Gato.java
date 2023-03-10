package ico.fes;
import java.util.Scanner;
public class Gato {
     private int edad;
     private String nombre;
     private String genero;

    public Gato(int edad, String nombre, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
    public void edadGatuna(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad de su gatito: ");
        edad = Integer.parseInt(sc.next());
        System.out.println("la edad en años gatunos de "+nombre+" es de: "+(edad*7));

    }
    public void mostrarDatos(){
        System.out.println(" Hola este soy yo: "+nombre+ '\''+ edad );
    }
}

