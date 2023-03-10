package ico.fes;
import java.util.Scanner;

public class Pais {
    String ESPANOL, INGLES, RUSO, CHINO, ARABE, FRANCES, ITALIANO, INGLESBRITANICO, AMERICA, AFRICA, ASIA, EUROPA, OCEANIA;

    private String nombre;
    private String continente;
    private String idioma;
    private float poblacion;

    //por defecto y sobrecargo
    public Pais(String nombre, String continente, String idioma, float poblacion) {
        this.nombre = nombre;
        this.continente = continente;
        this.idioma = idioma;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public float getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Pais() {

    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", idioma='" + idioma + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    public void mostrarContiente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que idioma habla usted? *ESCRIBALO EN MAYUSCULAS* ");
        String idioma = String.valueOf(sc.nextInt());
        {
            if (idioma.equals(ESPANOL)) ;
            System.out.println("Usted esta en LATINOAMERICA o EUROPA (España)");
            if (idioma.equals(RUSO)) ;
            System.out.println("Usted esta en ASIA (Rusia)");
            if (idioma.equals(CHINO)) ;
            System.out.println("Usted esta en ASIA (China)");
            if (idioma.equals(ARABE)) ;
            System.out.println("Usted esta en AFRICA");
            if (idioma.equals(INGLES)) ;
            System.out.println("Usted esta en AMERICA DEL NORTE (USA) o OCEANIA (Australia)");
            if (idioma.equals(FRANCES)) ;
            System.out.println("Usted esta en EUROPA (Francia)");
            if (idioma.equals(ITALIANO)) ;
            System.out.println("Usted esta en EUROPA (Italia)");
            if (idioma.equals(INGLESBRITANICO)) ;
            System.out.println("Usted esta en EUROPA (Inglaterra)");

        }


        }

        public void mostarPoblacion (){
            Scanner sc = new Scanner(System.in);
            System.out.println("¿En que continente se encuentra usted? *ESCRIBALO EN MAYUSCULAS* ");
            String poblacion = String.valueOf(sc.nextInt());
            if (continente.equals(AMERICA)) ;
            System.out.println("Usted esta viviendo junto con 1.002 miles de millones de personas");
            if (continente.equals(AFRICA)) ;
            System.out.println("Usted esta viviendo junto con 1.216 miles de millones de personas");
            if (continente.equals(ASIA)) ;
            System.out.println("Usted esta viviendo junto con 4.561 miles de millones de personas");
            if (continente.equals(EUROPA)) ;
            System.out.println("Usted esta viviendo junto con 746.4 millones de personas");
            if (continente.equals(OCEANIA)) ;
            System.out.println("Usted esta viviendo junto con 43 millones de personas");
        }
    }

