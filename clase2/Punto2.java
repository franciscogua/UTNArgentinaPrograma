package clase2;

import java.util.Scanner;

public class Punto2 {
	
	public static void main(String[] args) {
	
		try (Scanner sc1 = new Scanner(System.in)) {
			
//			Codificador
			System.out.println("Escribí el String a codificar");
			String str = sc1.nextLine();
			char[] ch = str.toCharArray();
			int val = 0;
			int valorDesplazamiento = 1;
			String codificado = "";
			
			for (int i = 0; i < ch.length; i++) {
				val = ch[i] + valorDesplazamiento;
				char c = (char)val;
				codificado += c;
			}
			System.out.println("\n\"" +str+ "\" codificado con un desplazamiento de " +valorDesplazamiento+ " es: " +codificado);
			
//			Decodificador
			System.out.println("\nEscribi el String a decodificar");
			String str2 = sc1.nextLine();
			char[] ch2 = str2.toCharArray();
			int val2 = 0;
			String decodificado = "";
			
			for (int i = 0; i < ch2.length; i++) {
				val2 = ch2[i] - valorDesplazamiento;
				char c2 = (char)val2;
				decodificado = decodificado + c2;
			}
			System.out.println("\n\"" +str2+ "\" decodificado con un desplazamiento de " +valorDesplazamiento+ " es: " +decodificado);
		}
	}
}


