package boletin01;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);

		// Declaraciones de variables donde se almacenan los difentes valores de la
		// ecuación.
		int a;
		int b;
		int c;

		double x1;

		double x2;

		double discriminante;

		// Preguntamos al usuario por el valor de A.
		System.out.println("Dime un valor para A");
		a = ch.nextInt();

		// Preguntamos al usuario por el valor de A.
		System.out.println("Dime un valor para B");
		b = ch.nextInt();

		// Preguntamos al usuario por el valor de A.
		System.out.println("Dime un valor para C");
		c = ch.nextInt();

		discriminante = b * b - 4 * a * c;

		// Si a == 0 es de primer grado
		if (a == 0) {
			// Tenemos una ecuación de primer grado
			x1 = (double) -c / b;
			System.out.println("La ecuación solo tiene una solución " + x1);
		} else if (discriminante >= 0) {
			// Si es positivo, tiene solución y se aplica la fórmula.
			x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else {
			// Si es negativo, la ecuación no tiene solución.
			System.out.println("La ecuación no tiene solución");
		}

		ch.close();
	}

}
