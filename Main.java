package ico.fes;

public class Main {
    public static void main(String[] args) {
        //pais
        Pais pais = new Pais("Mexico", "LATINOAMERICA", "ESPAÑOL", 126000000);
        pais.mostrarContiente();
        pais.mostarPoblacion();

        //Giroscopio
        Giroscopio giroscopio = new Giroscopio(685, 34, "vertical");
        giroscopio.precio();
        giroscopio.funcionamiento();

        //Cubo rubik
        CuboRubik cuborubik = new CuboRubik(3, "cuadrado", "normal");
        cuborubik.dificultad();
        cuborubik.pasos();

        //libro
        Libro libro = new Libro("Java a fondo", "Juan perez", 325);
        libro.leer();
        libro.porleer();

        //computadora
        Computadora computadora = new Computadora("acer", 1000, "Windows");
        computadora.encender();
        computadora.mostrarDatos();

        //lampara
        Lampara lampara = new Lampara("led", 2, "calida");
        lampara.controlar();
        lampara.encender();
        // Gato
        Gato gato = new Gato (7, "Minino", "Masculino");
        gato.edadGatuna();
        gato.mostrarDatos();
        // Balon
        Balon balon = new Balon ("mediano", "azul", null);
        balon.mostrarDeporte();
        balon.mostrardatos();


    }
}
