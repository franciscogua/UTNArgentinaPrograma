package clase5;

import java.nio.file.Path;
import java.nio.file.Files;

public class SumaNumeros {
    public double suma (Path archivo) {
        double suma = 0;

        try {
            for (String linea : Files.readAllLines(archivo)){
                String[] numeros = linea.trim().split(" ");
                for (String numero : numeros) {
                    suma+= Integer.parseInt(numero);
                }
            }
            System.out.println("El resultado de la suma es: " + suma);
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return suma;
    }
    
}
