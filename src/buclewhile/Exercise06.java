package buclewhile;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double arbolAltura;
		
		double arbolAlto = 0;
		
		System.out.println("Introduce la altura del arból.");
		arbolAltura = reader.nextDouble();
		
		while (arbolAltura != -1) {
			if (arbolAltura>arbolAlto) {
				arbolAlto = arbolAltura;
			}
			System.out.println("Introduce la altura del arból.");
			arbolAltura = reader.nextDouble();
		}
		
		System.out.println("El arbol más alto mide: " + arbolAlto + "cm");
		reader.close();

	}

}
