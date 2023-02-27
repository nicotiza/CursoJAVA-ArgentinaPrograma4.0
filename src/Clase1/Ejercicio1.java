package Clase1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //
        //
        //
        /*------------------------ Creación de Variables, Scanners, etc. ------------------------*/
        int primerNum = 0;
        int segundoNum = 0;
        boolean deseaParImpar = false;
        String condicionBusqueda = "";
        Scanner KBinput = new Scanner(System.in);
        /*------------------------ Creación de Variables, Scanners, etc. ------------------------*/
        //
        //
        //
        /*------------------------ El cliente ingresa los datos ------------------------*/
        System.out.println("Ingrese el primer número: ");
        primerNum = KBinput.nextInt();
        System.out.println("Ingrese el segundo número: ");
        segundoNum = KBinput.nextInt();
        /*------------------------ El cliente ingresa los datos ------------------------*/
        //
        //
        //
        /*------------------------ Se informa los números ingresados ------------------------*/
        imprimirNumeros(primerNum,segundoNum);
        /*------------------------ Se informa los números ingresados ------------------------*/
        //
        //
        //
        /*------------------------ Salto de Línea ------------------------*/
        System.out.println("\n\n");
        /*------------------------ Salto de Línea ------------------------*/
        //
        //
        //
        /*------------------------ Se consulta si desea buscar Pares ó Impares. ------------------------*/
        System.out.println("¿Desea buscar Pares ó Impares? (true/false)");
        deseaParImpar = KBinput.nextBoolean();

        if (deseaParImpar) {
            System.out.println("¿Qué desea buscar? ¿Pares ó Impares?.");
            condicionBusqueda = KBinput.next();


            switch (condicionBusqueda) {
                case "pares":
                    System.out.println("Excelente! Enseguida te indico los números pares del rango ingresado...");
                    busquedaParesImpares("pares",primerNum,segundoNum);
                    break;
                case "impares":
                    System.out.println("Excelente! Enseguida te indico los números impares del rango ingresado...");
                    busquedaParesImpares("impares",primerNum,segundoNum);
                    break;
                default:
                    System.out.println("¿¿¿No desea nada entonces??? \n ¡Gracias! ¡Vuelvas prontos!! XD");
            }

        } else {
            System.out.println("Muchas gracias por participar de éste experimento. Saludos terrícola!");
        }
    }
    //
    //
    //
    /*--------------------------    FUNCIONES   -----------------------------------------*/
    //
    //
    //
    /*----------    Imprime en Pantalla el rango de los números ingresados   ------------*/
    private static void imprimirNumeros (int num1, int num2){
        System.out.println("El rango de los números ingresados es: ... ");
        if (num1 <= num2) {
            System.out.println("El primer número es inferior o igual al segundo. Ordenando de menor a mayor...");
            while (num1 <= num2) {
                System.out.print(num1 + " ");
                num1 ++;
            }
        } else {
            System.out.println("El segundo número es menor al primero. Ordenando de mayor a menor...");
            while (num1 >= num2) {
                System.out.print(num1 + " ");
                num1 --;
            }
        }
    }
    /*----------    Imprime en Pantalla el rango de los números ingresados   ------------*/
    //
    //
    //
    /*---- Busca los números Pares ó Impares según se halla llamado a la función.   -----*/

    private static void busquedaParesImpares(String condicion, int num1, int num2){


        if (condicion == "pares") {
            System.out.println("Los números pares son: ");

            if (num1 <= num2) {
                System.out.println("Ordenando de menor a mayor...");
                while (num1 <= num2) {
                    if (num1 % 2 == 0) {
                        System.out.print(num1 + " ");
                    }
                    num1 ++;
                }
                /*
                System.out.println("\n Ahora en orden invertido con sentencia FOR:");
                for (int i = num2; i>=num1; i--){
                    System.out.println(i + " ");
                }*/
            } else {
                System.out.println("Ordenando de mayor a menor...");
                while (num1 >= num2) {
                    if (num1 % 2 == 0) {
                        System.out.print(num1 + " ");
                    }
                    num1 --;
                }
                /*
                System.out.println("\n Ahora en orden invertido con sentencia FOR:");
                for (int i=num1; i>num2; i--){
                    System.out.println(i + " ");
                }*/
            }


        } else {
            if (condicion == "impares"){
                System.out.println("Los números impares son: ");

                if (num1 <= num2) {
                    System.out.println("Ordenando de menor a mayor...");
                    while (num1 <= num2) {
                        if (num1 % 2 != 0) {
                            System.out.print(num1 + " ");
                        }
                        num1 ++;
                    }
                } else {
                    System.out.println("Ordenando de mayor a menor...");
                    while (num1 >= num2) {
                        if (num1 % 2 != 0) {
                            System.out.print(num1 + " ");
                        }
                        num1 --;
                    }
                }
            }
        }
    }
}
