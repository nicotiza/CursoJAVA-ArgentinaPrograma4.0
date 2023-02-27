import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int clase;
        int ejercicio;
        Scanner KBinput = new Scanner(System.in);

        System.out.println("Hola! Bienvenido al programa de NicoTiza.\nA continuación podrás seleccionar los ejercicios según la clase dictada.\n¿Que clase querés ver?");
        clase = KBinput.nextInt();

        switch (clase) {
            case 1:
                System.out.println("Seleccionaste la Clase 1. ");
                System.out.println("La Clase 1 tiene 2 ejercicios. ¿Cuál quieres ver?");
                ejercicio = KBinput.nextInt();
                /*switch (ejercicio) {
                    case 1:
                        Clase1.Ejercicio1();
                        break;
                    case 2:
                        Clase1.Ejercicio2();
                        break;
                    default:
                        System.out.println("Error, ese no existe :S");
                }*/
                break;
            case 2:
                break;
            case 3:
                break;
            default:;
        }
    }
}