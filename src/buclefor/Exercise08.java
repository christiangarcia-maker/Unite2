package buclefor;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Creación del scanner
		Scanner reader = new Scanner(System.in);
		
		// Varaiable para los dos números
		int numoA = 0;
		int numoB = 0;

		// Variable para la diferencia
		int resta = 0;

		// Preguntamos al usuario por dos notas
		System.out.println("Introduzca dos números");
		numoA = reader.nextInt();
		numoB = reader.nextInt();

		if (numoA < numoB) {
			resta = numoB - numoA;
			for (int cont = 0; cont <= resta; cont++) {
				System.out.println("Números desde A hasta B: " + numoA);
				numoA++;
			}// Fin de for
		} else {
			resta = numoA - numoB;
			for (int cont = 0; cont <= resta; cont++) {
				System.out.println("Números desde B hasta A: " + numoB);
				numoB++;
			}// Fin de for
		}// Fin de if
		
		// Cierre del scanner
		reader.close();
	}

}
