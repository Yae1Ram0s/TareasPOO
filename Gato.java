public class Gato {

    // Atributos
    private String nombre;
    private int edad;
    private String raza;
    private String color;
    private boolean estaDurmiendo;

    // Constructores
    public Gato(String nombre, int edad, String raza, String color, boolean estaDurmiendo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.estaDurmiendo = estaDurmiendo;
    }

    public Gato(String nombre, int edad, String raza, String color) {
        this(nombre, edad, raza, color, false);
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEstaDurmiendo() {
        return estaDurmiendo;
    }

    public void setEstaDurmiendo(boolean estaDurmiendo) {
        this.estaDurmiendo = estaDurmiendo;
    }

    // Método toString
    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", estaDurmiendo=" + estaDurmiendo +
                '}';
    }

    // Métodos generales
    public void maullar() {
        System.out.println(nombre + " está maullando.");
    }

    public void dormir() {
        estaDurmiendo = true;
        System.out.println(nombre + " se ha quedado dormido.");
    }

    public void despertar() {
        estaDurmiendo = false;
        System.out.println(nombre + " se ha despertado.");
    }
}
