package bucledowhile;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creación del escaner
		Scanner reader = new Scanner(System.in);

		// Numero dado por el usuario el cual se va a multiplicar.
		int numero;

		// Numero el cual se multiplica por el del usuario.
		int multiplicacion = 1;

		// Resultado de la multiplicacion.
		int resultado;

		// Pregunta al usuario por un número.
		System.out.println("Introduzca un número.");
		numero = reader.nextInt();

		// Se guarda el resultado de la multiplicación y se imprime, para luego aumentar
		// en 1 la variable de multiplicacion.
		do {
			resultado = numero * multiplicacion;
			System.out.println(numero + "x" + multiplicacion + "=" + resultado);
			multiplicacion++;
		// Si multiplicacion es menor o igual que 10 sigue el bucle.
		} while (multiplicacion <= 10);

		// Cierre del escaner
		reader.close();

	}

}
