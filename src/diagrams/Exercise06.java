package diagrams;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		int numeroUno;
		
		int numeroDos;
		
		System.out.println("Elige el primer número para ordenarlo de forma ascendente.");
		numeroUno = ch.nextInt();
		
		System.out.println("Elige el segundo número para ordenarlo de forma ascendente.");
		numeroDos = ch.nextInt();
		
		if (numeroUno > numeroDos) {
			System.out.println(numeroUno);
			System.out.println(numeroDos);
		} else {
			System.out.println(numeroDos);
			System.out.println(numeroUno);
		}
		
		ch.close();

	}

}
