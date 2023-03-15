package clase5;

import java.util.Scanner;

public class Punto1c {
    
    public static void main(String[] args) {

        int[] numeros;
        char orden;
        
        
        if (args.length == 3) {
            numeros = new int[]{Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};
            orden = 'a'; 
        }
        
        else {
            try (Scanner sn = new Scanner(System.in)) {
                numeros = new int[3];
                System.out.println("Ingrese el primer número:");
                numeros[0] = sn.nextInt();
                System.out.println("Ingrese el segundo número:");
                numeros[1] = sn.nextInt();
                System.out.println("Ingrese el tercer número:");
                numeros[2] = sn.nextInt();
                System.out.println("Ingresa 'a' (ordenamiento ascendente) o 'd' (ordenamiento descendente):"); 
                orden = sn.next().charAt(0);
            }
        }
        
        OrdenarNumeros ordenador = new OrdenarNumeros();
        ordenador.ordenar(numeros, orden);
    }
}
