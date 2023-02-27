package Clase1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float ingresosTotales = 0.0f;
        int cantVehiculos = 0;
        int edadVehiculos = 0;
        int inmuebles = 0;
        boolean posesionesExtras = false;
        Scanner KBinput = new Scanner(System.in);

        System.out.println("Para saber su segmento de ingresos, favor de completar los siguientes datos: ");
        System.out.print("Ingresos Totales: ");
        ingresosTotales = KBinput.nextFloat();
        System.out.print("Cantidad de Vehículos: ");
        cantVehiculos = KBinput.nextInt();
        System.out.print("Antigüedad del/los Vehículo/s: ");
        edadVehiculos = KBinput.nextInt();
        System.out.print("Cantidad de Inmuebles: ");
        inmuebles = KBinput.nextInt();
        System.out.println("¿Usted posee alguna embarcación, una aeronave de lujo o \nser titular de activos societarios que demuestren capacidad económica plena?\nIndique true ó false");
        posesionesExtras = KBinput.nextBoolean();

        if (ingresosTotales>=489083 || cantVehiculos>=3 && edadVehiculos<=5 || inmuebles>=3 || posesionesExtras) {
            System.out.println("Usted pertenece al segmento de ingresos Altos.");
        } else {
            System.out.println("Usted no pertenece al segmento de ingresos Altos.\nÉsta fue una versión de prueba, para conocer su segmento correspondiente favor de adquirir la versión completa.\nCerrando sistema...");
        }
    }
}
