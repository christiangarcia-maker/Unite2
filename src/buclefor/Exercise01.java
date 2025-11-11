package buclefor;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);

		// Numero proporcionado por el usuario.
		int numeroUsuario;

		// Pregunta al usuario por un número.
		System.out.println("Introduzca un número.");
		numeroUsuario = reader.nextInt();

		// Se agrega un contador inicializado en 1, una condición de que el contador sea
		// menor o igual al número y el aumento en 1 al contador.
		for (int contador = 1; contador <= numeroUsuario; contador++) {
			System.out.println(contador);
		}

		// Cierre del escaner.
		reader.close();

	}

}
