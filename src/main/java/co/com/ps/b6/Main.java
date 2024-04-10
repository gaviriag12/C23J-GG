package co.com.ps.b6;

import java.util.Scanner;

import static co.com.ps.b6.Calculadora.*;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor ingrese el primer número");
            num1 = scanner.nextDouble();

            System.out.println("Por favor ingrese el segundo número");
            num2 = scanner.nextDouble();

            System.out.println("Por favor seleccione qué operación desea realizar");
            System.out.println("1 = Sumar");
            System.out.println("2 = Restar");
            System.out.println("3 = Multiplicar");
            System.out.println("4 = Dividir");
            num3 = scanner.nextInt();

            switch (num3){
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                default:
                    System.out.println("La opción no es válida");
                    return;
            }
        } catch (Exception e){
            System.out.println("Entrada inválida");
        }


 /*       try {
            int resultado = dividir(10,0);
            System.out.println(resultado);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("La aplicación terminó con exito");
    }

    public static int dividir(int a, int b){
        return a/b;
*/

    }
}