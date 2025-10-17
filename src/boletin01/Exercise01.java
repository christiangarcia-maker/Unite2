package boletin01;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número");
		numero = ch.nextInt();
		
		if (numero%2==0) {
			System.out.println("Tú número es par.");
		} else {
			System.out.println("Tú nuúmero es inpar.");
		}
		
		// Cierre del escaner
		ch.close();
	}

}
