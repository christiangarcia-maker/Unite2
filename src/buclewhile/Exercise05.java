package buclewhile;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// Declaración de varaible que almacena la edad del alumno.
		int edadAlumnos;

		// Declaración de variable que almacena la suma de las edades.
		int sumaEdad = 0;

		// Declaración de variable que almacena la media de las edades.
		int edadMedia;

		// Declaración de variable que almacena la cantidad de alumnos que son mayores.
		int alumnosMayores = 0;

		// Declaración de variable que almacena ña cantidad de alumnos.
		int numeroAlumnos = 0;

		// Pregunta por la edad del alumno.
		System.out.println("Coloque la edad del alumno.");
		edadAlumnos = reader.nextInt();

		// Si la edad del alumno es mayor o igual que cero, se suma la edad de alumno a
		// la variable sumaEdad y aumenta el contador del número de alumnos.
		while (edadAlumnos >= 0) {
			sumaEdad += edadAlumnos;
			numeroAlumnos++;

			// Si los alumnos son mayores de 18, aumenta en uno la cantidad de alumnos
			// mayores.
			if (edadAlumnos >= 18) {
				alumnosMayores++;
			}
			// Pregunta por la edad del alumno.
			System.out.println("Coloque la edad del alumno.");
			edadAlumnos = reader.nextInt();
		}

		// Inicializa edadMedia con la suma de las edades entre la cantidad de alumnos
		// que han ingresado.
		edadMedia = sumaEdad / numeroAlumnos;

		// Imprime en pantalla la suma de las edades.
		System.out.println("La suma de las edades de los alumnos es de: " + sumaEdad + ".");

		// Imprime en pantalla la media de las edades.
		System.out.println("La media de las edades de los alumnos es de: " + edadMedia + ".");

		// Imprime en pantalla los alumnos que son mayores de edad.
		System.out.println("Hay " + alumnosMayores + " alumnos que son mayores de edad.");

		// Imprime en pantalla el número de alumnos.
		System.out.println("Hay " + numeroAlumnos + " alumnos.");

		// Cierre del escaner.
		reader.close();

	}

}
