import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        String texto = "hola perro gato perro perro holas";

        texto = texto.toLowerCase().replaceAll("[^a-zA-Z\\s]", ""); // Convertir a minúsculas y eliminar signos de
                                                                    // puntuación
        String[] palabras = texto.split("\\s+"); // Dividir el texto en palabras

        HashMap<String, Integer> contadorPalabras = new HashMap<>();

        for (String palabra : palabras) {
            if (contadorPalabras.containsKey(palabra)) {
                contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
            } else {
                contadorPalabras.put(palabra, 1);
            }
        }

        for (String palabra : contadorPalabras.keySet()) {
            System.out.println(palabra + ": " + contadorPalabras.get(palabra));
        }

    }
}
