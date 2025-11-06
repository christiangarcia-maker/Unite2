package bucledowhile;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);

		// Declaración de variable donde se almacena la elección del primer jugador.
		String primerJugador;

		// Declaración de variable donde se almacena la elección del seundo jugador.
		String segundoJugador;
		
		String opcion;

		do {
		// Preguntamos al primer jugador por su elección.
		System.out.println("Jugador1, ¿Piedra, Papel o Tijeras? ");
		primerJugador = reader.nextLine();
		}while (!primerJugador.equals("Piedra")&&(!primerJugador.equals("Papel")&&(!primerJugador.equals("Tijeras"))));

		do {
			// Preguntamos al primer jugador por su elección.
			System.out.println("Jugador2, ¿Piedra, Papel o Tijeras? ");
			segundoJugador = reader.nextLine();
			}while (!segundoJugador.equals("Piedra")&&(!segundoJugador.equals("Papel")&&(!segundoJugador.equals("Tijeras"))));

		// Si la elección del primer y segundo jugar es la misma, será empate, si no
		// pasará al siguiente if, donde haremos todas las condicionales donde el primer
		// jugador gana, si ningua se cumple, por descarte el segundo jugador gana.
		do {
		if (primerJugador.equals(segundoJugador)) {
			System.out.println("Empate.");
		} else if (primerJugador.equals("Pedra") && segundoJugador.equals("Tijeras")
				|| primerJugador.equals("Tijeras") && segundoJugador.equals("Papel")
				|| primerJugador.equals("Papel") && segundoJugador.equals("Piedra")) {
			System.out.println("!El primer jugador gana¡");
		} else {
			System.out.println("!El segundo jugador gana¡");
		}
			System.out.println("Si quiere seguir jugando pulse la S.");
			opcion = reader.nextLine();
		}while (opcion.equals("S"));

		// Cierre del escaner.
		reader.close();
	}

}
