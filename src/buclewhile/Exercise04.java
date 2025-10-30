package buclewhile;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);

		// Delaración de variable que almacena la cantidad de números positivos
		// introducidos por el usuario.
		int contador = 0;

		// Declaración de variable que almacena el número introducido por el usuario.
		int numero;

		// Declaración de varaible donde se almacena la suma de todos los números
		// positivos introducidos.
		int suma = 0;

		// Declaración de varaible donde se almacena la suma de todos los números
		// negativos introducidos.
		int sumaNegativo = 0;

		// Delaración de variable que almacena la cantidad de números negativos
		// introducidos por el usuario.
		int contadorNegativo = 0;

		// Declaración de variable que almacena la media de los números negativos.
		int mediaNegativa;

		// Declaración que almacena la cantidad de ceros introducidos.
		int contadorCeros = 0;

		// Si el contador es menor de 10 entra en el bucle, en el cual se pide un número
		// y se aumenta el contador.
		while (contador < 10) {
			System.out.println("Introduzca un número.");
			numero = reader.nextInt();
			contador++;

			// Si el número introducido es mayor que cero se hace la suma de los positivos.
			if (numero > 0) {
				suma += numero;
				// Si no, almacena la suma de los negativos.
			} else if (numero < 0) {
				sumaNegativo += numero;
				contadorNegativo++;
				// Si no, por descarte aumenta el contador de ceros.
			} else {
				contadorCeros++;
			}
		}

		// Almacena la media de los números negativos.
		mediaNegativa = sumaNegativo / contadorNegativo;

		// Imprime en pantalla la suma de los números positivos, la media de los números
		// negativos y la cantidad de ceros introducidos.
		System.out.println("La suma de los números positivos es de " + suma + ".");
		System.out.println("La media de los números negativos es de " + mediaNegativa + ".");
		System.out.println("La cantidad de ceros introducidos es de " + contadorCeros + ".");
		
		// Cierre del escaner.
		reader.close();

	}

}
