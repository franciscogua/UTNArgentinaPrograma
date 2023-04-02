package clase1;

public class Punto2 {
	
	public static void main(String[] args) {
		
		float ingresos = 490000;
		int vehiculosNuevos = 1;
		int inmuebles = 2;
		boolean poseeEmbarcacion = false;
		
		if((ingresos >= 489083) || (vehiculosNuevos >= 3) || (inmuebles >= 3) || poseeEmbarcacion) {
			System.out.println("Esta persona pertenece al segmento de ingresos altos.");
		} else {
			System.out.println("Esta persona NO pertenece al segmento de ingresos altos.");
		}
	}
}
