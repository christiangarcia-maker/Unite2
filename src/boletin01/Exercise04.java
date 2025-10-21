package boletin01;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// Declaramos la variable donde almacena el número dado por el usuario.
		int numero;

		// Preguntamos al usuario por un número entre un rango.
		System.out.println("Introduzca un número entre 0 y 99999: ");
		numero = reader.nextInt();

		// Calculamos el rango en el que se encuentra el número, consiguiendo así la
		// cantidad de cifras correspondiente.
		if (numero <= 9) {
			System.out.println("El número introducido tiene una cifra. ");
		} else if (numero <= 99 && numero >= 10) {
			System.out.println("El número introducido tiene dos cifras. ");
		} else if (numero <= 999 && numero >= 100) {
			System.out.println("El número introducido tiene tres cifras. ");
		} else if (numero <= 9999 && numero >= 1000) {
			System.out.println("El número introducido tiene cuatro cifras. ");
		} else if (numero <= 99999 && numero >= 10000) {
			System.out.println("El número introducido tiene cinco cifras. ");
		}

		// Cierre del escaner.
		reader.close();

	}

}
