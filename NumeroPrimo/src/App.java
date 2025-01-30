import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Escribe un programa que se encargue de comprobar si un número es o no primo.
         * Hecho esto, imprime los números primos entre 1 y 100.
         */
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero entero");
        numero = scanner.nextInt();
        if (numero < 1) {
            System.out.println("el numero no es primo");
        } else {
            int contador = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println("el numero es primo");
            } else {
                System.out.println("el numero no es primo");
            }
        }

        scanner.close();
    }
}
