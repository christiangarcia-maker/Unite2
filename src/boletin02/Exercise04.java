package boletin02;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String primeraTirada;
		
		String segundaTirada;
		
		int numero1 = 0;
		
		int numero2 = 0;
		
		int suma;
		
		System.out.println("¿Cuanto has sacadado en tu primera tirada?");
		primeraTirada = reader.nextLine();
		
		System.out.println("¿Y cuanto has sacado en tú segunda tirada? ");
		segundaTirada = reader.nextLine();
		
		numero1 = switch (primeraTirada) {
		case "UNO" ->
			1;
		case "DOS" ->
			2;
		case "TERCER" ->
			3;
		case "CUATRO" ->
			4;
		case "CINCO" ->
			5;
		case "SEIS" ->
			6;
		default ->
			-1;
		};

		numero2 = switch (segundaTirada) {
		case "UNO" ->
			1;
		case "DOS" ->
			2;
		case "TERCER" ->
			3;
		case "CUATRO" ->
			4;
		case "CINCO" ->
			5;
		case "SEIS" ->
			numero2 = 6;
		default ->
			-1;
		};
		
		suma = numero1 + numero2;
		
		System.out.println("La suma de las tiradas es: " + suma);
		
		reader.close();

	}

}
