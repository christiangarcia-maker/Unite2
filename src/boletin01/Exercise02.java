package boletin01;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);

		// Declaración de variable donde se almacena el número decimal dado por el
		// usuario.
		double numero;

		// Preguntamos al usuario por un número decimal.
		System.out.println("Introduce un número decimal.");
		numero = ch.nextDouble();

		// Si el número dado se encuentra entre dicho rango podrá dar lo siguiente
		if (numero > -1 && numero < 1 && numero != 0) { // En caso de que se encuentre en el rango lo imprime.
			System.out.println("El número es casi 0");
		} else { // Si no, imprime que no es casi 0.
			System.out.println("El número no es casi 0");
		}

		// Cierre del escaner.
		ch.close();
	}

}
