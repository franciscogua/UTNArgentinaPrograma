package clase5;

public class Punto1a {
    
    public static void main(String[] args){
        int[] numeros = new int[3];
        char orden;

        numeros[0] = 3;
        numeros[1] = 20;
        numeros[2] = 15;
        orden = 'a';

        OrdenarNumeros ordenador = new OrdenarNumeros();
        ordenador.ordenar(numeros, orden);
    }
}
