package buclewhile;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int contador = 0;
		
		int numero;
		
		int suma = 0;
		
		int sumaNegativo = 0;
		
		int contadorNegativo = 0;
		
		int mediaNegativa;
		
		int contadorCeros = 0;
		
		while (contador < 10) {
			System.out.println("Introduzca un número.");
			numero = reader.nextInt();
			contador ++;
			if (numero > 0) {
				suma += numero;
			} else if (numero < 0) {
				sumaNegativo += numero;
				contadorNegativo++;
			} else {
				contadorNegativo++;
			}
		}
		
		mediaNegativa = sumaNegativo/contadorNegativo;
		
		System.out.println("La suma de los números positivos es de " + suma + ".");
		System.out.println("La media de los números negativos es de " + mediaNegativa + ".");
		System.out.println("La cantidad de ceros introducidos es de " + contadorCeros + ".");
		
		reader.close();

	}

}
