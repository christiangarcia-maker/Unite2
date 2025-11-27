package bucles;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);
		
		// Número introducido por el usuario.
		int numeroInicial;
		
		int numero;
		
		// Contador de números itnroducidos.
		int contador = 0;
		
		// Cantidad de fallos.
		int fallos = 0;
		
		System.out.println("Introduzca un número inicial: ");
		numeroInicial = reader.nextInt();
		
		while (numeroInicial != 0) {
			System.out.println("Introduzca un número: ");
			numero = reader.nextInt();
			
			if (numero<numeroInicial && numero != 0) {
				System.out.println("Incorrecto, es menor");
				fallos++;
			}
			numeroInicial = numero;
			contador++;
		}
		
		System.out.println("Has introducido la cantidad de " + contador + " números.");
		System.out.println("Has fallado " + fallos + " veces.");
		
		reader.close();

	}

}
