package diagrams;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);

		// Declaración de variable que almacena el primer numero dado por el
		// usuario.
		int primerNumero;

		// Declaración de variable que almacena el primer numero dado por el
		// usuario.
		int segundoNumero;

		// Declaración de variable queguardará el valor de la suma de los dos valores.
		int suma;

		// Declaración de variable que guardará el valor de la resta de los dos valores.
		int resta;

		// Declaración de variable que guardará el valor de la multiplicación de los dos
		// valores.
		double multiplicacion;

		// Declaración de variable que guardará el valor de la división de los dos valores.
		double division;

		// Pregunta al usuario por el primer número.
		System.out.println("Introduce el primer número.");
		primerNumero = ch.nextInt();

		// Pregunta al usuario por el segundo número.
		System.out.println("Introduce el segundo número");
		segundoNumero = ch.nextInt();

		// Se calcula la suma de ambos valores y se almacena.
		suma = primerNumero + segundoNumero;

		// Se calcula la resta de ambos valores y se almacena.
		resta = primerNumero - segundoNumero;

		// Se calcula la multiplicación de ambos valores y se almacena.
		multiplicacion = primerNumero * segundoNumero;

		// Se calcula la división de ambos valores y se almacena.
		division = (double) primerNumero / segundoNumero;

		// Imprime en pantalla el resultado de la suma, resta y multiplicación de ambos
		// valores.
		System.out.println("La suma de ambos números es: " + suma);
		System.out.println("La resta de ambos números es: " + resta);
		System.out.println("La multiplicación de ambos números es: " + multiplicacion);

		// Se mira si el el valor del segundo número es 0, en el caso de que lo sea
		// imprime la cadena, si no, imprime el resultado.
		if (segundoNumero == 0.0) {
			System.out.println("No se puede divivir entre cero.");
		} else {
			System.out.println("La división de ambos números es: " + division);
		}

		// Cierre del escaner.
		ch.close();

	}

}
