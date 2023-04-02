package clase2;

public class Punto1c {

	public static void main(String[] args) {
		
		int numeros[] = new int[] {41, 28, 3, 13};
		int resultado = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			resultado = resultado + numeros[i];
		}
		
		System.out.println(resultado);
	}

}
