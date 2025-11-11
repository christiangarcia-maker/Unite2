package buclefor;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);
		
		// Almacena cuantos multiplos hay hasta el número seleccionado.
		int contadorMultiplo = 0;

		// Numero dado por el usuario.
		int numero;

		// Pregunta al usuario por un número.
		System.out.println("Introduzca un número");
		numero = reader.nextInt();

		// Se agrega un contador inicializado en 1, una condición de que el contador sea
		// menor o igual al número y el aumento en 1 al contador.
		for (int contador = 1; contador <= numero; contador++) {
			if (contador % 3 == 0) {
				contadorMultiplo++;
			}
		}
		
		// Imprime la cantidad de multiplos que hay hasta el número introducido.
		System.out.println("Hay " + contadorMultiplo + " números multiplos de 3 hasta el número que has introducido");

		// Cierre del escaner.
		reader.close();
	}

}
