package diagrams;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);

		// Declaración de variable que almacena el primer número dado por el usuario.
		int numeroUno;

		// Declaración de variable que almacena el segundo número dado por el usuario.
		int numeroDos;

		// Pregunta al usuario por el primer número.
		System.out.println("Elige el primer número para ordenarlo de forma ascendente.");
		numeroUno = ch.nextInt();

		// Pregunta al usuario por el segundo número.
		System.out.println("Elige el segundo número para ordenarlo de forma ascendente.");
		numeroDos = ch.nextInt();

		// Si el primer número es mayor, mostrará el primero al inicio y el segundo
		// después, si no, de mostrará el segundo en la primera posición, y el primero
		// en la segunda posición.
		if (numeroUno > numeroDos) {
			System.out.println(numeroUno);
			System.out.println(numeroDos);
		} else {
			System.out.println(numeroDos);
			System.out.println(numeroUno);
		}
		
		// Cierre del escaner.
		ch.close();

	}

}
