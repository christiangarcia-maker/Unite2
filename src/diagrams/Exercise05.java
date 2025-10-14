package diagrams;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Elige un número");
		numero = ch.nextInt();
		
		if (numero >= 0) {
			System.out.println("Positivo.");
		} else {
			System.out.println("Negativo");
		}
		
		ch.close();
	}

}
