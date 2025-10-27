package boletin01;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);

		// Declaración de variable donde se almacena el número introducido por el
		// usuario.
		int numero;

		// Preguntamos al usuario por un número.
		System.out.println("Introduce un número");
		numero = ch.nextInt();

		// Si el resto del número entre 2 es 0, será par.
		if (numero % 2 == 0) { // Si es verdad, imprimirá que es par.
			System.out.println("Tú número es par.");
		} else { // Si no, imprimirá que es impar.
			System.out.println("Tú nuúmero es inpar.");
		}

		// Cierre del escaner
		ch.close();
	}

}
