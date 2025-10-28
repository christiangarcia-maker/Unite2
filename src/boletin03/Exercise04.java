package boletin03;

import java.util.Random;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner reader = new Scanner(System.in);
		
		int numero1 = random.nextInt(0,101);
		
		int numero2 = random.nextInt(0,101);
		
		int sumaAleatorio = numero1 + numero2;
		
		int sumaUsuario;
		
		System.out.println(numero1 + " y " + numero2);
		System.out.println("¿Cuanto vale la suma?");
		
		reader.close();
	}

}
