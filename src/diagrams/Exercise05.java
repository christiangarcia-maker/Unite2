package diagrams;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Creacón del escaner.
		Scanner ch = new Scanner(System.in);

		// Declaración de variable que almacena un número pedido por el usuario,
		int numero;

		// Pregunta al usuario por un número.
		System.out.println("Elige un número");
		numero = ch.nextInt();

		// Si el número es mayor o igual a 0, devuelve positivo, si es menor que 0,
		// devuelve negativo.
		if (numero >= 0) {
			System.out.println("Positivo.");
		} else {
			System.out.println("Negativo");
		}
		
		// Cierre del escaner.
		ch.close();
	}

}
