package buclefor;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creación del scanner
		Scanner reader = new Scanner(System.in);

		// Variable para el número
		int numero = 0;

		// Boolean
		boolean esPrimo = true;

		// Le preguntamos un número al usuario
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		// Condicional, si el número es 1 no es primo, luego false
		if (numero == 1) {
			esPrimo = false;
		}

		for (int cont = 2; cont < numero; cont++) {
			if (numero % cont == 0) {
				esPrimo = false;
			}
		}
				
		// Imprimimos la solución
		System.out.println("¿El número introducido por el usuario es primo?");
		if (esPrimo) {
			System.out.println("Sí");
		} else {
			System.out.println("No");
		}

		// Cierre del scanner
		reader.close();
	}

}
