import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Crea una única función (importante que sólo sea una) que sea capaz
         * de calcular y retornar el área de un polígono.
         * - La función recibirá por parámetro sólo UN polígono a la vez.
         * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
         * - Imprime el cálculo del área de un polígono de cada tipo.
         */

        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Area de un poligono");
        System.out.println("Seleccione el poligono a calcular: ");
        System.out.println("1. Triangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectangulo");
        opcion = scanner.nextInt();
        System.out.println("El area del poligono es: " + AreaPoligono(opcion));
        scanner.close();

    }

    public static double AreaPoligono(int opcion) {
        double base, altura;
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1:
                System.out.println("Ingrese la base del triangulo: ");
                base = scanner.nextDouble();
                System.out.println("Ingrese la altura del triangulo: ");
                altura = scanner.nextDouble();
                return (base * altura) / 2;
            case 2:
                System.out.println("Ingrese la base del cuadrado:");
                base = scanner.nextDouble();
                return base * base;
            case 3:
                System.out.println("Ingrese la base del rectangulo: ");
                base = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectangulo: ");
                altura = scanner.nextDouble();
                return base * altura;
            default:
                return 0;
        }

    }

}
