package co.com.ps.b3;

import java.util.Scanner;

public class TrabajoEnClase2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el primer número");
        double num1 = scanner.nextDouble();

        System.out.println("Por favor ingrese el segundo número");
        double num2 = scanner.nextDouble();

        double suma = num1+num2;
        double resta = num1-num2;
        double multiplicacion = num1*num2;
        double division = num1/num2;

        System.out.println("La suma de estos 2 números es "+suma);
        System.out.println("La resta de estos 2 números es "+resta);
        System.out.println("La multiplicación de estos 2 números es "+multiplicacion);
        System.out.println("La división de estos 2 números es "+division);

    }
}
