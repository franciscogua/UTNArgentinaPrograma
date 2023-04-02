package clase2;

public class Punto1a {

	public static void main(String[] args) {
		
		String punto1a = "String de prueba";
		int contador = 0;
		char caracter = 'r';
		
		for(int i = 0; i < punto1a.length(); i++) {
			if(punto1a.charAt(i) == caracter) {
				contador++;
			}
		}
		System.out.println("La letra " +caracter+ " se repite " +contador+ " veces.");
	}

}
