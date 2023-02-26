import java.util.Scanner;
public class tareatwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa algunas letras: ");
        String inputString = scanner.nextLine();
        boolean isConsecutive = true;

        if (inputString.length() == 0 || inputString.length() == 1) {
            isConsecutive = false;
        } else {
            char[] charArray = inputString.toCharArray();
            for (int i = 1; i < charArray.length; i++) {
                if ((int) charArray[i] - (int) charArray[i - 1] != 1) {
                    isConsecutive = false;
                    break;
                }

            }

        }

        if (isConsecutive) {
            System.out.println("Esta secuencia es consecutiva");
        } else {
            System.out.println("Esta secuencia no es consecutiva");
        }
    }
}


