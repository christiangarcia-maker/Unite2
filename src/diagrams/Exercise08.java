package diagrams;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);

		// Declaración de varaible donde almacena el primer número pedido por el
		// usuario.
		int numero1;

		// Declaración de varaible donde almacena el segundo número pedido por el
		// usuario.
		int numero2;

		// Declaración de varaible donde almacena el tercer número pedido por el
		// usuario.
		int numero3;

		// Pregunta al usuario por el primer número.
		System.out.println("Introduce el primer número.");
		numero1 = ch.nextInt();

		// Pregunta al usuario por el segundo número.
		System.out.println("Introduce el segundo número.");
		numero2 = ch.nextInt();

		// Pregunta al usuario por el tercer número.
		System.out.println("Introduce el tercer número.");
		numero3 = ch.nextInt();

		// Si el primer número es mayor que el segundo y tercero, devuelve que el
		// primero es mayor, si no, si el segundo es mayor que el tercero, devuelve que
		// el segundo es mayor. si no, devuelve que el tercero es el mayor.
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("El primer número es el mayor: " + numero1);
		} else if (numero2 > numero3) {
			System.out.println("El segundo número es el mayor: " + numero2);
		} else {
			System.out.println("El tercer número es el mayor: " + numero3);
		}

		// Cierre del escaner.
		ch.close();

	}

}
