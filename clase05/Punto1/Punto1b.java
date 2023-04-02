package clase5;

import java.util.Scanner;

public class Punto1b {
    
    public static void main(String[] args){

        int[] numeros = new int[3];
        char orden;
        try (Scanner sn = new Scanner(System.in)) {
            System.out.println("Ordenador de números\n");
            System.out.println("Ingresa 'a' si desea orden ascendente o 'd' si desea descendente:");
            orden = sn.next().charAt(0);
            System.out.println("\nIngresa el primer número:");
            numeros[0] = sn.nextInt();
            System.out.println("Ingresa el segundo número:");
            numeros[1] = sn.nextInt();
            System.out.println("Ingresa el tercer número:");
            numeros[2] = sn.nextInt();
        }
        
        OrdenarNumeros ordenador = new OrdenarNumeros();
        ordenador.ordenar(numeros, orden);
    }

}
