package co.com.ps.b4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrabajoEnClase3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();
        System.out.println("Por favor ingrese 8 palabras de su preferencia y se le mostrara cuáles tienen más de 4 letras");

        for (int i = 0; i < 8; i++) {
            System.out.println(i + 1);
            String nuevapPalabra = scanner.nextLine();
            palabras.add(nuevapPalabra);
        }

        System.out.println("Estas son las palabras con más de 4 letras");
        for (String nuevaPalabra : palabras) {
            if (nuevaPalabra.length() > 4) {
                System.out.println(nuevaPalabra);
            }
        }
    }
}


