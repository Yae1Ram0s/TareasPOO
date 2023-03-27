public class MaquinaCafe {
    // Depósitos
    private int agua;
    private int cafe;
    private int crema;
    // Vasos
    private int vasosDisponibles;
    private final int capacidadVaso = 200; // ml

    // Constructor
    public MaquinaCafe() {
        agua = 5000;
        cafe = 1000;
        crema = 1500;
        vasosDisponibles = 50;
    }

    // Elaborar un café americano
    public void americano() {
        if (agua >= 180 && cafe >= 15 && vasosDisponibles > 0) {
            agua -= 180;
            cafe -= 15;
            vasosDisponibles--;
            System.out.println("Aquí está su café americano.");
        } else {
            System.out.println("Lo siento, no hay suficientes recursos para servir un café americano.");
        }
    }

    // Elaborar un café expreso
    public void expreso() {
        if (agua >= 120 && cafe >= 20 && vasosDisponibles > 0) {
            agua -= 120;
            cafe -= 20;
            vasosDisponibles--;
            System.out.println("Aquí está su café expreso.");
        } else {
            System.out.println("Lo siento, no hay suficientes recursos para servir un café expreso.");
        }
    }

    // Elaborar un capuchino
    public void capuchino() {
        if (agua >= 100 && cafe >= 14 && crema >= 70 && vasosDisponibles > 0) {
            agua -= 100;
            cafe -= 14;
            crema -= 70;
            vasosDisponibles--;
            System.out.println("Aquí está su capuchino.");
        } else {
            System.out.println("Lo siento, no hay suficientes recursos para servir un capuchino.");
        }
    }

    // Mostrar las cantidades actuales de agua, café y crema
    public void mostrarCantidades() {
        System.out.println("Agua: " + agua + " ml");
        System.out.println("Café: " + cafe + " g");
        System.out.println("Crema: " + crema + " ml");
    }
}