package codigo7;

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {
	  // Corrección: agregamos el método main faltante y los import necesarios.
    public static void main(String[] args) {
        // Corrección: agregamos System.in al Scanner.
        Scanner s = new Scanner(System.in);

        // Corrección: declaramos e inicializamos el HashMap faltante.
        HashMap<String, String> capitales = new HashMap<>();
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "Ciudad de México");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        // Corrección: agregamos la capital de El Salvador.
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");

        // Corrección: inicializamos la variable c vacía.
        String c = "";

        do {
            // Corrección: imprimimos el mensaje correctamente.
            System.out.println("Escribe el nombre de un país y te diré su capital: ");
            // Corrección: leemos la entrada del usuario con nextLine.
            c = s.nextLine();
            
            if (!c.equals("salir")) {
                // Corrección: usamos containsKey en vez de containsValue.
                if (capitales .containsKey(c)) {
                    System.out.print("La capital de " + c);
                    // Corrección: usamos get en vez de put para obtener la capital.
                    System.out.println(" es " + capitales.get(c));
                } else {
                    System.out.print("No conozco la respuesta ");
                    System.out.print("¿cuál es la capital de " + c + "?: ");
                    // Corrección: usamos una variable llamada capital para almacenar la entrada del usuario.
                    String capital = s.nextLine();
                    // Corrección: usamos put en vez de add para agregar la capital al HashMap.
                    capitales.put(c, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }
            }
        } while (!c.equals("salir"));
    }
}