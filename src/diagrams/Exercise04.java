package diagrams;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		int numeroUno;
		
		int numeroDos;
		
		System.out.println("Dime un numero");
		numeroUno = ch.nextInt();
		
		System.out.println("Dime otro numero");
		numeroDos = ch.nextInt();
		
		if (numeroUno > numeroDos){
			System.out.println(numeroUno);
		}else {
			System.out.println(numeroDos);
		}
		
		ch.close();

	}

}
