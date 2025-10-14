package diagrams;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		int numeroUno;
		
		int numeroDos;
		
		System.out.println("Elige el primer número para la comparativa.");
		numeroUno = ch.nextInt();
		
		System.out.println("Elige el segundo número para la comparativa.");
		numeroDos = ch.nextInt();
		
		if (numeroUno > numeroDos) {
			System.out.println(numeroUno + " es mayor que " + numeroDos);
		}else if (numeroDos > numeroUno) {
			System.out.println(numeroDos + " es mayor que " + numeroUno);
		}else {
			System.out.println(numeroUno + " y " + numeroDos + " son iguales.");
		}
		
		ch.close();

	}

}
