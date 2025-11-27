package bucles;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);

		// Numero introducido por el usuario.
		int num;

		// Le preguntamos un número al usuario.
		System.out.println("Introduzca un número: ");
		num = reader.nextInt();

		// Si el número introducido es mayor a 0 se cumplen los bucles, de no ser así
		// muestra un mensaje de error.
		if (num > 0) {
			
			// For que va recorriendo las filas.
			for (int contadorF = 0; contadorF <= num; contadorF++) {
				
				// For que escribe de forma ascendente.
				for (int contadorA = 1; contadorA <= contadorF; contadorA++) {
					System.out.print(contadorA);
				}
				
				// For que escribe de forma descendente.
				for (int contadorD = contadorF - 1; contadorD > 0; contadorD--) {
					System.out.print(contadorD);
				}
				System.out.println();
			}
		} else {
			System.out.println("El valor introducido es incorrecto");
		}

		// Cierre del escaner.
		reader.close();

	}

}
