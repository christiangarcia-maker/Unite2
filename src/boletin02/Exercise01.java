package boletin02;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int nota;
		
		System.out.println("¿Cual es tu nota?");
		nota = reader.nextInt();
		
		switch (nota) {
		case 0,1,2,3,4 ->
		System.out.println("Insuficiente");
		case 5 ->
		System.out.println("Suficiente");
		case 6 -> 
		System.out.println("Bien");
		case 7,8 ->
		System.out.println("Notable");
		case 9,10 ->
		System.out.println("Sobresaliente");
		default ->
		System.out.println("Coloque un valor que sea correspondiente a tu nota");
		}
		
		
		
		reader.close();

	}

}
