package buclewhile;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);

		// Declaración de variable que almacena la suma de los números introducidos.
		int suma = 0;

		// Declaración de varaible que almacena el número introducido por el usuario.
		int numero;

		// Pregunta al usuario por un número.
		System.out.println("Introduce un número.");
		numero = reader.nextInt();

		// Si el número es negativo no entrará, de ser positivo, se hará la suma en
		// bucle hasta que se introduzca un número negativo.
		while (numero >= 0) {
			suma += numero;
			numero = reader.nextInt();
		}
		
		// Cuando el bucle termine imprimirá la suma de todos los números introducidos.
		System.out.println("Esta es la suma de los digitos introducidos: " + suma);
		
		// Cierre del escaner.
		reader.close();

	}

}
