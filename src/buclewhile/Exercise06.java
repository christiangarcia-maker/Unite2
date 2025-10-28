package buclewhile;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double arbol;
		
		double arbolAlto = 0;
		
		System.out.println("Introduce la altura del arból.");
		arbol = reader.nextDouble();
		
		while (arbol != -1) {
			if (arbol>arbolAlto) {
				arbolAlto = arbol;
			}
			System.out.println("Introduce la altura del arból.");
			arbol = reader.nextDouble();
		}
		
		System.out.println("El arbol más alto mide: " + arbolAlto + "cm");
		reader.close();

	}

}
