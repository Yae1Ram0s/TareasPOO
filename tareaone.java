import java.util.Scanner;

public class tareaone {
    public static void main(String[] args){

        Scanner data = new Scanner(System. in);
        System.out.print ("Ingresa tu Nombre, Nacionalidad y Profesion, y separalo con espacio");
        String information = data.nextLine();
        String [] space = information.trim().split(" ");
        for (int i = 0; i < space.length; i++){
            if (i == 0){
                System.out.println("Nombre: " + space[i].toUpperCase());
            } else if (i == 1){
                System.out.println("Nacionalidad: " + space[i].toUpperCase());
            } else if (i == 2){
                System.out.println("Profesion: " + space[i].toUpperCase());
            }

        }

    }
}
