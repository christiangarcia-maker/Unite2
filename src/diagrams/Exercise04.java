package diagrams;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaración de variable que almacena el primer número elegido por el usuario.
		int numeroUno;
		
		// Declaración de variable que almacena el segundo número elegido por el usuario.
		int numeroDos;
		
		// Pregunta al usuario por el primer número.
		System.out.println("Introduce el primer número");
		numeroUno = ch.nextInt();
		
		// Pregunta al usuario por el segundo número.
		System.out.println("Introduce el segundo número");
		numeroDos = ch.nextInt();
		
		// Si el primer número es mayor que el segundo devuelve el primero, si no, el segundo.
		if (numeroUno > numeroDos){
			System.out.println(numeroUno);
		}else {
			System.out.println(numeroDos);
		}
		
		// Cierre del escaner.
		ch.close();

	}

}
