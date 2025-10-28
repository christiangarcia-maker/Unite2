 package boletin03;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner reader = new Scanner(System.in);
		
		// Declaración de variable que almacena el DNI del usuario.
		int dni;
		
		// Declaración de variable que almacena el número al que corresponde la letra.
		int letraNumero;
		
		// Declaración de varaible que almacena la letra del DNI.
		String letra;
		
		// Declaración de variable que almacena el DNI completo del usuario.
		String dniCompleto;
		
		// Pregunta al usuario por su DNI, sin la letra.
		System.out.println("Introduzca su DNI sin la letra final.");
		dni = reader.nextInt();
		
		// Almacena la formula la cual da el número que corresponde con la letra del DNI,
		letraNumero = dni%23;
		
		// Dependiendo del número que almacene letraNumero, almacenará una letra u otra.
		letra = switch (letraNumero) {
		case 0 ->
		"T";
		case 1 ->
		"R";
		case 2 ->
		"W";
		case 3 ->
		"A";
		case 4 ->
		"G";
		case 5 ->
		"M";
		case 6 ->
		"Y";
		case 7 ->
		"F";
		case 8 ->
		"P";
		case 9 ->
		"D";
		case 10 ->
		"X";
		case 11 ->
		"B";
		case 12 ->
		"N";
		case 13 ->
		"J";
		case 14 ->
		"Z";
		case 15 ->
		"S";
		case 16 ->
		"Q";
		case 17 ->
		"V";
		case 18 ->
		"H";
		case 19 ->
		"L";
		case 20 ->
		"C";
		case 21 ->
		"K";
		case 22 ->
		"E";
		default ->
		"Valor incorrecto";
		};
		
		// Almacena la cadena del DNI más la letra, así completando el DNI por completo.
		dniCompleto = dni + letra;
		
		// Imprime en pantalla el DNI completo del usuario.
		System.out.println("Tu DNI completo es: " + dniCompleto);
		
		// Cierre del escaner.
		reader.close();

	}

}
