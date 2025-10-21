package boletin01;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);

		// Declaramos las variables.
		int numero1;

		int numero2;

		int numero3;

		// Preguntamos al usuario para que nos de un primer número.
		System.out.println("Introduce el primer número: ");
		numero1 = reader.nextInt();

		// Preguntamos al usuario para que nos de un segundo número.
		System.out.println("Introduce el segundo número: ");
		numero2 = reader.nextInt();

		// Preguntamos al usuario para que nos de un tercer número.
		System.out.println("Introduce el tercer número: ");
		numero3 = reader.nextInt();

		// Creamos diferentes condicionales donde la suma de dos de los tres números
		// introducidos da como resultado el otro restante.
		if (numero1 + numero2 == numero3) {
			System.out.println("La suma del primer y segundo número es el tercer número introducido. ");
		} else if (numero2 + numero3 == numero1) {
			System.out.println("La suma del segundo y tercer número es el primer número introducido. ");
		} else if (numero1 + numero3 == numero2) {
			System.out.println("La suma del primer y tercer número es el segundo número introducido. ");
		}

		// Cierre el scanner.
		reader.close();

	}

}
