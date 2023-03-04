package Clase1;

import java.util.Scanner;

public class Ejercicios_Propuestos {
    public static void  main    (String[] args){
        ejercicio5();
    }
/////////////////"EJERCICIOS" (funciones, métodos)/////////////////////////
    public static void  ejercicio1(){
        float a = 0f;
        float b = 0f;
        Scanner KBinput = new Scanner(System.in);
        int error = 0;

        do {
            if (error != 0) System.out.println("Los números son iguales, favor de ingresar valores diferentes!");
            System.out.println("Ingrese el primer valor: ");
            a = KBinput.nextFloat();
            System.out.println("Ingrese el segundo valor: ");
            b = KBinput.nextFloat();
            if (a==b) error = 1;
        } while (a==b);
        error = 0;


        if (a > b){
            System.out.println("El primer número es el mayor.");
        } else {
            System.out.println("El segundo número es el mayor.");
        }
    }
//////////////////////////////////////////
    public static void ejercicio2() {
        float a = 0f;
        float b = 0f;
        float c = 0F;
        Scanner KBinput = new Scanner(System.in);
        int error = 0;

        do {
            if (error != 0) System.out.println("Los números son iguales, favor de ingresar valores diferentes!");
            System.out.println("Ingrese el primer valor: ");
            a = KBinput.nextFloat();
            System.out.println("Ingrese el segundo valor: ");
            b = KBinput.nextFloat();
            System.out.println("Ingrese el tercer valor: ");
            c = KBinput.nextFloat();
            if (a==b) error = 1;
        } while (a==b);
        error = 0;


        if (a > b && a > c){
            System.out.println("El primer número es el mayor.");
        } else {
            if (b > a && b > c){
                System.out.println("El segundo número es el mayor.");
            } else {
                System.out.println("El tercer número es el mayor.");
            }
        }
    }
//////////////////////////////////
    public static void ejercicio3(){
        int n=0;
        int suma=0;

        System.out.print("Sumando...");
        do {
            n = n + 1 ;
            suma = suma + n;
            System.out.print(" " + n);

        } while (n<10);
        System.out.println("\n");
        System.out.println("La suma de 1 al 10 es: " + suma);
    }

//////////////////////////////////

    public static void ejercicio4 () {
        float CatA = 0f;
        float CatB = 0f;
        Scanner KBinput = new Scanner(System.in);

        System.out.println("Ingrese el primer cateto: ");
        CatA = KBinput.nextFloat();
        System.out.println("Ingrese el segundo cateto: ");
        CatB = KBinput.nextFloat();

        System.out.println("Calculando la Hipotenusa: ... Aguarde pls...");
        double hipotenuza =  Math.sqrt(CatA*CatA+CatB*CatB);
        System.out.println("Dado el cateto A: " + CatA + " y el cateto B: " + CatB + "\nLa Hipotenusa es de: " + hipotenuza);
    }
//////////////////////////////////
    public static void  ejercicio5(){
        float num1 = 0f;
        float num2 = 0f;
        char operando;
        float resultado = 0f;
        Scanner KBinput = new Scanner(System.in);

        System.out.println("Bienvenido a la Calculadora en Java de NicoTiza.\nA continuación ingrese el primer número, luego el operando, y al final el segundo número.\nTal cual harías en una calculdaora virtual con el Numpad.");
        System.out.print("Primer número: ");
        num1 = KBinput.nextFloat();
        System.out.print("Operando: ");
        operando = KBinput.next().charAt(0); //De ésta forma se puede pedir al usuario que ingrese un CHAR.
        System.out.print("segundo número: ");
        num2 = KBinput.nextFloat();

        switch (operando) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
        }

        System.out.println("El resultado es: " + resultado);
    }
}

