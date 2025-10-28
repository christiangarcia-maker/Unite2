package buclewhile;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int contador = 0;
		
		int numero;
		
		System.out.println("Introduce un número.");
		numero = reader.nextInt();
		
		while (numero >= 0) {
			contador ++;
			numero = reader.nextInt();
		} 
		
		System.out.println("Has introducido la cantidad de " + contador + " numeros positivos.");
		
		reader.close();

	}

}
