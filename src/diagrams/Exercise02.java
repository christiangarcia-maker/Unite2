package diagrams;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		int edad;
		
		System.out.println("¿Cuantos años tienes?");
		edad = ch.nextInt();
		
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("No eres mayor de edad");
		}
		
		ch.close();

	}

}
