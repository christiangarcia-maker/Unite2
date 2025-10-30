package buclewhile;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);

		// Declaración de variable que almacena la altura del arbol dado por el usuario.
		double arbolAltura;

		// Declaración de varaible que almacenrá la altura más alta de los datos que
		// vaya introduciendo el usuario.
		double arbolAlto = 0;
		
		// Pregunta al usuario por la altura del arból.
		System.out.println("Introduce la altura del arból.");
		arbolAltura = reader.nextDouble();

		// Si la altura del arbol es distinta a -1 entra en el bucle.
		while (arbolAltura != -1) {
			// Si la altura introducida es mayor a la del arbol más alto se reemplaza la altura.
			if (arbolAltura > arbolAlto) {
				arbolAlto = arbolAltura;
			}
			// Pregunta al usuario por la altura del arból.
			System.out.println("Introduce la altura del arból.");
			arbolAltura = reader.nextDouble();
		}
		
		// Si la altura es diferente a -1 imprime la altura del arból más alta.
		if (arbolAltura != -1) {
			System.out.println("El arbol más alto mide: " + arbolAlto + "cm");
		// Si no, imprime que introduzca el valor correcto.
		} else {
			System.out.println("Introduce un valor que sea valido.");
		}
		
		// Cierre del escaner.
		reader.close();

	}

}
