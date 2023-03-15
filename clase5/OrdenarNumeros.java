package clase5;

public class OrdenarNumeros {
    
    public void ordenar(int[] numeros, char orden){
        int mayor, medio, menor;

        if (numeros[0] >= numeros[1] && numeros[0] >= numeros[2]){
            mayor = numeros[0];
            if (numeros[1] >= numeros[2]){
                medio = numeros[1];
                menor = numeros[2];
            } else {
                medio = numeros[2];
                menor = numeros[1];
            }
        } else if (numeros[1] >= numeros[0] && numeros[1] >= numeros[2]){
            mayor = numeros[1];
            if (numeros[0] >= numeros[2]){
                medio = numeros[0];
                menor = numeros[2];
            } else {
                medio = numeros[2];
                menor = numeros[0];
            }
        } else {
            mayor = numeros[2];
            if (numeros[0] >= numeros[1]){
                medio = numeros[0];
                menor = numeros[1];
            } else {
                medio = numeros[1];
                menor = numeros[0];
            }
        }

        if (orden == 'a'){
            System.out.println("\nOrden ascendente:\n" + "\nMenor\t" + menor + "\n" + "Medio\t" + medio + "\n" + "Mayor\t" + mayor);
        } else if (orden == 'd'){
            System.out.println("\nOrden descendente:\n" + "\nMayor\t" + mayor + "\n" + "Medio\t" + medio + "\n" + "Menor\t" + menor);
        }
    }
}
