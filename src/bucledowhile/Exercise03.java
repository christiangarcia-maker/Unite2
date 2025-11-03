package bucledowhile;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);
		
		// Numero introducido por el usuario.
		int numero;
		
		// Contador inicializado en 1.
		int contador = 1;
		
		// Suma de los números hasta llegar al indicado.
		int suma = 0;
		
		// Pregunta al usuario por un número.
		System.out.println("Introduzca un número");
		numero = reader.nextInt();
		
		// Se suma con el contador para luego aumentarle a dicha variable 1.
		do { 
			suma += contador;
			contador++;
		// Si el contador es menor o igual que el contador sigue el bucle.
		}while (contador <= numero);
		
		// Imprime la suma total de los números hasta llegar al indicado.
		System.out.println("La suma de los números hasta llegar al pedido es: " + suma);
		
		// Cierre del escaner.
		reader.close();

	}

}
