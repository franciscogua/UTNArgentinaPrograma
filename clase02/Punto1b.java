package clase2;

import java.util.Arrays;

public class Punto1b{

	public static int[] ordenarVector(int a, int b, int c, String orden) {
		int[] numeros = {a, b, c};
		
		int temp, min;
		
		for(int i = 0; i < numeros.length -1; i++){
			min = i;
			
			for(int j =i + 1; j < numeros.length; j++){
				if(orden.equals("creciente")) {
					if (numeros[j] < numeros[min]) {
						min = j;
					}
				} else if(orden.equals("decreciente")) {
					if(numeros[j] > numeros[min]) {
						min = j;
					}
				}	
			}
			temp = numeros[i];
			numeros[i] = numeros[min];
			numeros[min] = temp;
		}
		return numeros;
	}
	
	public static void main(String[] args){
		
		int[] vector = ordenarVector(13, 8, 20, "creciente");
		
		System.out.println(Arrays.toString(vector));
	}

}
