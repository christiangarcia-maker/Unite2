package diagrams;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaración de varible para almacenar la edad del usuario.
		int edad;
		
		// Preguntamos al usuario por su edad.
		System.out.println("¿Cuantos años tienes?");
		edad = ch.nextInt();
		
		// Si la edad del usuario es mayor o igual a 18, imprime lo primero, si no, lo segundo.
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("No eres mayor de edad");
		}

		// Cierre del escaner.
		ch.close();

	}

}
