public class App {
    public static void main(String[] args) throws Exception {
        int numero = 10;
        System.out.println("  ");
        String binario = "";

        while (numero > 0) {
            System.out.println("numero: " + numero + " residuo:" + (numero % 2));
            binario = (numero % 2) + binario;
            numero = numero / 2;
        }
        System.out.println("El numero en binario es: " + binario);
    }
}
