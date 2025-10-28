package buclewhile;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int contador = 0;
		
		int suma = 0;
		
		int numero;
		
		int media;
		
		System.out.println("Introduce un número.");
		numero = reader.nextInt();
		
		while (numero >= 0) {
			suma += numero;
			contador ++;
			numero = reader.nextInt();
		} 
		
		media = suma/contador;
		System.out.println("La media de los números introducidos es " + media + ".");
		
		reader.close();

	}

}
