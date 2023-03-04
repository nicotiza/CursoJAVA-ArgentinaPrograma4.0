package Clase3;

import java.sql.SQLOutput;

public class EjercicioDeClaseEnVivo {
    public static void main(String[] args){
        int arreglo[] = new int[]{18, 66, 101, 5, 285, 45, 14};
        int minimo = arreglo[0];
        int maximo = arreglo[0];

        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] < minimo){
                minimo=arreglo[i];
            } else {
                if (arreglo[i] > maximo) {
                    maximo = arreglo[i];
                }
            }
        }

        System.out.println("El mínimo es: " + minimo);
        System.out.println("El máximo es: " + maximo);

        //////////////////////////////////////////////
        System.out.println("\n\n\n");
        //////////////////////////////////////////////
        String texto1 = "Hola";
        String texto2 = "mundo!";
        System.out.println("¿Qué dice el texto completo? " + texto1 + " " + texto2);
        System.out.println("¿Los textos son iguales? " + texto1.equals(texto2));
        System.out.println("¿De cuántos caracteres está compuesto el primer texto? " + texto1.length()/*éste es un método, ya que lleva paréntesis, a diferencia del Array que es una propiedad*/);
        System.out.println("¿Y el segundo? " + texto2.length());
        System.out.println("Texto 1 y 2 en UPPERCASE: " + texto1.toUpperCase() + texto2.toUpperCase());
        System.out.println("Texto 1 y 2 en lowercase: " + texto1.toLowerCase() + texto2.toLowerCase());
        System.out.println("Se me mezclaron los cables... reproduciendo texto de nuevo: " + texto1.replace("Hola" , "Aló") + " " + texto2.replace("mundo" , "como tá?") );

    }
}
