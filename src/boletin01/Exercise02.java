package boletin01;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Introduce un número decimal.");
		numero = ch.nextDouble();
		
		if (numero > -1 && numero < 1 && numero!=0 ) {
			System.out.println("El número es casi 0");
		} else {
			System.out.println("El número no es casi 0");
		}
		
		ch.close();
	}

}
