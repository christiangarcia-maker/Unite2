package diagrams;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Introduce el primer número.");
		numero1 = ch.nextInt();
		
		System.out.println("Introduce el segundo número.");
		numero2 = ch.nextInt();
		
		System.out.println("Introduce el tercer número.");
		numero3 = ch.nextInt();
		
		if (numero1>numero2) {
			if (numero1>numero3) {
				System.out.println("El primer número es el mayor: " + numero1);
			}else {
				System.out.println("El tercer número es el mayor: " + numero3);
			}
		}else if (numero2>numero3) {
			System.out.println("El segundo número es el mayor: " + numero2);
		} else {
			System.out.println("El tercer número es el mayor " + numero3);
		}
		
		ch.close();

	}

}
