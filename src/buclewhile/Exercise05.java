package buclewhile;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int edadAlumnos;
		
		int sumaEdad = 0;
		
		int edadMedia;
		
		int alumnosMayores = 0;
		
		int numeroAlumnos = 0;
		
		System.out.println("Coloque la edad del alumno.");
		edadAlumnos = reader.nextInt();
		
		while (edadAlumnos >= 0) {
			sumaEdad += edadAlumnos;
			numeroAlumnos++;
			if (edadAlumnos >= 18) {
				alumnosMayores++;
			}
			System.out.println("Coloque la edad del alumno.");
			edadAlumnos = reader.nextInt();
		}
		
		edadMedia = sumaEdad/numeroAlumnos;
		
		System.out.println("La suma de las edades de los alumnos es de: " + sumaEdad + ".");
		System.out.println("La media de las edades de los alumnos es de: " + edadMedia + ".");
		System.out.println("Hay " + alumnosMayores + " alumnos que son mayores de edad.");
		System.out.println("Hay " + numeroAlumnos + " alumnos.");
		
		reader.close();

	}

}
