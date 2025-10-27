package boletin03;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);
		
		// Declaración de la variable donde se almacena el número dado por el usuario.
		int numero;
		
		
		// Preguntamos al usuario por un número en un rango en especifico.
		System.out.println("Introduce un número comprendido ente 0 y 9999");
		numero = reader.nextInt();

		// Cierre del escaner.
		reader.close();
		
	}

}
