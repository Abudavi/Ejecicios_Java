public class App {
    public static void main(String[] args) throws Exception {

        int numero1 = 0, numero2 = 1, resultado = 0;
        System.out.println("Empezamos");
        System.out.println(resultado);
        for (int i = 0; i <= 10; i++) {

            resultado = numero1 + numero2;
            System.out.println(resultado);
            numero2 = numero1;
            numero1 = resultado;

        }

    }
}
