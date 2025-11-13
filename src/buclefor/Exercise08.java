package buclefor;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Creación del scanner
		Scanner reader = new Scanner(System.in);
		
		// Varaiable para los dos números
		int numeroA = 0;
		int numeroB = 0;

		// Variable para la diferencia
		int resta = 0;

		// Preguntamos al usuario por dos notas
		System.out.println("Introduzca dos números");
		numeroA = reader.nextInt();
		numeroB = reader.nextInt();

		if (numeroA < numeroB) {
			resta = numeroB - numeroA;
			for (int cont = 0; cont <= resta; cont++) {
				System.out.println("Números desde A hasta B: " + numeroA);
				numeroA++;
			}// Fin de for
		} else {
			resta = numeroA - numeroB;
			for (int cont = 0; cont <= resta; cont++) {
				System.out.println("Números desde B hasta A: " + numeroB);
				numeroB++;
			}// Fin de for
		}// Fin de if
		
		// Cierre del scanner
		reader.close();
	}

}
