package buclefor;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int suma = 0;
		
		int numero;
		
		int media;
		
		for (int contador =1; contador<=10; contador++) {
			System.out.println("Introduzca un número.");
			numero = reader.nextInt();
			
			suma += numero;
		}
		
		media = suma/10;
		
		System.out.println("La media de los números introducidos es de " + media);
		reader.close();

	}

}
