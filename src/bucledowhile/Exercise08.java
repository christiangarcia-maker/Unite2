package bucledowhile;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
		
		String primeraTirada;
		
		String segundaTirada;
		
		int numero1 = 0;
		
		int numero2 = 0;
		
		int suma;
		
		do {
			System.out.println("¿Cuanto has sacadado en tu primera tirada?");
			primeraTirada = reader.nextLine();
		} while(!primeraTirada.equals("UNO")&&(!primeraTirada.equals("DOS")&&(!primeraTirada.equals("TRES")&&(!primeraTirada.equals("CUATRO")&&(!primeraTirada.equals("CINCO")&&(!primeraTirada.equals("SEIS")))))));
		
		do {
			System.out.println("¿Cuanto has sacadado en tu segunda tirada?");
			segundaTirada = reader.nextLine();
		} while(!segundaTirada.equals("UNO")&&(!segundaTirada.equals("DOS")&&(!segundaTirada.equals("TRES")&&(!segundaTirada.equals("CUATRO")&&(!segundaTirada.equals("CINCO")&&(!segundaTirada.equals("SEIS")))))));

		
		numero1 = switch (primeraTirada) {
		case "UNO" ->
			1;
		case "DOS" ->
			2;
		case "Tres" ->
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
		case "TRES" ->
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
		
		suma = numero1 + numero2;
		
		System.out.println("La suma de las tiradas es: " + suma);
		
		reader.close();

	}

}
