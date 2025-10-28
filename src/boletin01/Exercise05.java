package boletin01;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);

		// Declaración de variable donde se almacena la elección del primer jugador.
		String primerJugador;

		// Declaración de variable donde se almacena la elección del seundo jugador.
		String segundoJugador;

		// Preguntamos al primer jugador por su elección.
		System.out.println("Jugador1, ¿piedra, papel o tijeras? ");
		primerJugador = reader.nextLine();

		// Preguntamos al primer jugador por su elección.
		System.out.println("Jugador2, ¿piedra, papel o tijeras? ");
		segundoJugador = reader.nextLine();

		// Si la elección del primer y segundo jugar es la misma, será empate, si no
		// pasará al siguiente if, donde haremos todas las condicionales donde el primer
		// jugador gana, si ningua se cumple, por descarte el segundo jugador gana.
		if (primerJugador.equals(segundoJugador)) {
			System.out.println("Empate.");
		} else if (primerJugador.equals("piedra") && segundoJugador.equals("tijeras")
				|| primerJugador.equals("tijeras") && segundoJugador.equals("papel")
				|| primerJugador.equals("papel") && segundoJugador.equals("piedra")) {
			System.out.println("!El primer jugador gana¡");
		} else {
			System.out.println("!El segundo jugador gana¡");
		}

		// Cierre del escaner.
		reader.close();
	}

}
