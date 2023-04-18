import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String filePath = "src/datos.txt";

        // Identificar mails y extraer grupos
        String regex = "^(\\w+)(\\.\\w+)*@(\\w+)(\\.\\w+)+$";

        try {
            Scanner sn = new Scanner(new File(filePath));

            // Contador de líneas
            int numLinea = 1;

            // Leer todas las líneas del archivo
            while (sn.hasNextLine()) {
                String linea = sn.nextLine();

                // Compilar la expresión regular en un patrón
                Pattern pattern = Pattern.compile(regex);

                // Matcher para buscar los grupos en la línea
                Matcher matcher = pattern.matcher(linea);

                // Imprimir el número de línea y el texto a segmentar entre comillas
                System.out.println("\nLínea " + numLinea + ":\n" + "\"" + linea + "\"");

                // Buscar e imprimir los grupos en la línea
                if (matcher.find()) {
                    for (int i = 1; i <= matcher.groupCount(); i++) {
                        System.out.println("Grupo " + i + ": " + matcher.group(i));
                    }
                } else {
                    System.out.println("No se encontraron grupos en la línea.");
                }

                numLinea++;
            }

            sn.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado");
        }
    }
}