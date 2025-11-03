package bucledowhile;

import java.util.Random;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		Random aleatorio = new Random();
		
		int min = 1;
		
		int max = 101;
		
		String resultado;
		
		int numeroAleatorio;
		
		do {
			
			numeroAleatorio = aleatorio.nextInt(min,max);
			System.out.println(numeroAleatorio);
			resultado = reader.next();
			
			if (resultado.equals("Menor")) {
				max = numeroAleatorio;
			} else if (resultado.equals("Mayor")) {
				min = numeroAleatorio;
			}
		}while (!resultado.equals("Iguales"));
		
		System.out.println("Lo sabía.");
		
		reader.close();

	}

}
