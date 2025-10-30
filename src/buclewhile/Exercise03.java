package buclewhile;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);

		// Declaración de variable que almacena la cantidad de números que ha
		// introducido el usuario.
		int contador = 0;

		// Declaración de variable que almacena la suma de todos los números
		// introducidos.
		int suma = 0;

		// Declaración de variable que almacena el número que introduzca el usuario.
		int numero;

		// Declaración de variable que almacena la media de los números.
		int media;

		// Pregunta al usuario por un número.
		System.out.println("Introduce un número.");
		numero = reader.nextInt();

		// Si el número es mayor o igual a cero se suma y aumenta el contador, además de
		// que se vuelve a pedir al usuario un nuevo número.
		while (numero >= 0) {
			suma += numero;
			contador++;
			numero = reader.nextInt();
		}

		// Almacena la media de la suma total entre el número de numeros.
		media = suma / contador;

		// Imprime en pantalla la media de los números.
		System.out.println("La media de los números introducidos es " + media + ".");

		// Cierre del escaner.
		reader.close();

	}

}
