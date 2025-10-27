package diagrams;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaramos la variable donde se almacena la edad del usuario.
		int edad;
		
		// Preguntamos al usuario por su edad.
		System.out.println("¿Cuantos años tienes?");
		edad = ch.nextInt();
		
		// Si la edad del usuario es igual o mayor a 18 imprimirá la siguiente cadena, si no, no hace nada.
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		}
		
		// Cierre del escaner.
		ch.close();

	}

}
