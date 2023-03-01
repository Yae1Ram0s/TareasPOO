import java.util.Scanner;
public class tareatree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 9 caracteres (X, 0, _):");
        String entrada = scanner.nextLine().toUpperCase();

        if (entrada.length() != 9) {
            System.out.println("ERROR, se debe ingresar exactamente 9 caracteres. ");
            return;
        }

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("Solo se deben ingresar los siguientes caracteres: X, O, _");
                return;
            }
        }
        System.out.println("-----");
        System.out.println("|" + entrada.charAt(0)  + entrada.charAt(1) + entrada.charAt(2) + "|");
        System.out.println("|" + entrada.charAt(3)  + entrada.charAt(4) + entrada.charAt(5) + "|");
        System.out.println("|" + entrada.charAt(6)  + entrada.charAt(7) + entrada.charAt(8) + "|");
        System.out.println("-----");
    }
}



