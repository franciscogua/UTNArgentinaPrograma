package clase5;

import java.nio.file.Path;
import java.nio.file.Files;

public class ProductoNumeros {
    public double producto (Path archivo) {
        double producto = 1;

        try {
            for (String linea : Files.readAllLines(archivo)){
                String[] numeros = linea.trim().split(" ");
                for (String numero : numeros) {
                    producto *= Integer.parseInt(numero);
                }
            }
            System.out.println("El resultado de la multiplicación es: " + producto);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return producto;
    }
}
