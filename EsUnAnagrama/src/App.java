import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Boolean anagrama = false;
        Scanner scanner = new Scanner(System.in);
        String primeraPalabra, segundaPalabra;

        System.out.println("Ingrese la primera palabra: ");
        primeraPalabra = scanner.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        segundaPalabra = scanner.nextLine();

        if (primeraPalabra.length() == segundaPalabra.length()) {
            char[] array1 = primeraPalabra.toCharArray();
            char[] array2 = segundaPalabra.toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            anagrama = Arrays.equals(array1, array2);

        }
        if (anagrama) {
            System.out.println("Las palabras son anagramas");
        } else {
            System.out.println("Las palabras no son anagramas");
        }
        scanner.close();
    }
}
