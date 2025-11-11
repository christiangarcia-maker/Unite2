package buclefor;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int numero;
		
		int multiplicacion = 1;
		
		System.out.println("Introduzca un número");
		numero = reader.nextInt();
		
		for (int contador = numero; contador>0; contador--) {
			System.out.print(contador);
			if (contador != 1) {
				System.out.print("*");
			}
			multiplicacion*=contador;
		}
		
		System.out.println("= " + multiplicacion);
		
		reader.close();

	}

}
