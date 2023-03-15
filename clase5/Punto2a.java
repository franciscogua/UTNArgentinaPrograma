package clase5;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Punto2a {
    
    public static void main(String[] args) {

        Path archivo = Paths.get ("Workspace\\ArgentinaPrograma\\src\\clase5\\Numeros.txt");
        try (Scanner sn = new Scanner(System.in)) {
            
            String operacion;
            System.out.println("Escribí \"suma\" para sumar los contenidos del archivo o \"multiplicacion\" para obtener el producto");
            operacion = sn.nextLine();

            if(operacion.equals("suma")){
                SumaNumeros suma = new SumaNumeros();
                suma.suma(archivo);
            } else if (operacion.equals("multiplicacion")){
                ProductoNumeros producto = new ProductoNumeros();
                producto.producto(archivo);
            }
        }



    }
}
