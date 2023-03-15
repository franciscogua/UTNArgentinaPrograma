package clase5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Scanner;

public class Punto3 {

   public static void main(String[] args){

      try{
         Path entradaPath = Paths.get("Workspace\\ArgentinaPrograma\\src\\clase5\\Entrada.txt");
         String str = Files.readString(entradaPath);
         int valorDesplazamiento = 1;
         String salida = "";
         String proceso;
         try (Scanner sn = new Scanner(System.in)) {
            System.out.println("Ingrese \"codificar\" para codificar el archivo de entrada y \"decodificar\" para decodificarlo:");
            proceso = sn.nextLine();
         }

         if (proceso.equals("codificar")){
            for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) + valorDesplazamiento;
            char c = (char)val;
            salida += c;
         }
         } else if (proceso.equals("decodificar")){
            for (int i = 0; i < str.length(); i++) {
            int val2 = str.charAt(i) - valorDesplazamiento;
            char c2 = (char)val2;
            salida += c2;
         }
         }

         Path salidaPath = Paths.get("Workspace\\ArgentinaPrograma\\src\\clase5\\Salida.txt");
         Files.writeString(salidaPath, salida);

         System.out.println("Proceso terminado correctamente!");
         } catch (IOException e) {
         System.out.println("Error al procesar los archivos: " + e.getMessage());
         }
   }  
}