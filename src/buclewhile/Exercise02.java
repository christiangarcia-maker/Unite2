package buclewhile;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);

		// Declaración de variable que almacena la cantidad de números que ha
		// introducido el usuario.
		int contador = 0;
		
		// Declaración de variable que almacena el número introducido por el usuario.
		int numero;

		// Pregunta al usuario por un número.
		System.out.println("Introduce un número.");
		numero = reader.nextInt();

		// Si el número es mayor o igual que cero aumenta el contador y vuelve a pedir un número.
		while (numero >= 0) {
			contador++;
			numero = reader.nextInt();
		}
		
		// Imprime la cantidad de números que ha introducido.
		System.out.println("Has introducido la cantidad de " + contador + " numeros positivos.");

		reader.close();

	}

}
