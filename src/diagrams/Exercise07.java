package diagrams;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);

		// Declaración de variable que almacena el primer número pedido por el usuario.
		int numeroUno;

		// Declaración de variable que almacena el segundo número pedido por el usuario.
		int numeroDos;

		// Pregunta al usuario el primer número.
		System.out.println("Elige el primer número para la comparativa.");
		numeroUno = ch.nextInt();

		// Pregunta al usuario por el segundo número.
		System.out.println("Elige el segundo número para la comparativa.");
		numeroDos = ch.nextInt();

		// Si el primer número es mayor que el segundo, devolverá que el primero es
		// mayor que el segundo, si no, si el segundo número es mayor que el primero,
		// devolerá que el segundo es mayor que el primero, si no, devolverá que ambos
		// números son iguales.
		if (numeroUno > numeroDos) {
			System.out.println(numeroUno + " es mayor que " + numeroDos);
		} else if (numeroDos > numeroUno) {
			System.out.println(numeroDos + " es mayor que " + numeroUno);
		} else {
			System.out.println(numeroUno + " y " + numeroDos + " son iguales.");
		}

		// Cierre del escaner.
		ch.close();

	}

}
