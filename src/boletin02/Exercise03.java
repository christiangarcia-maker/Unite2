package boletin02;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int numero1;
		
		int numero2;
		
		String opcion;
		
		System.out.println("Introduce dos números.");
		numero1 = reader.nextInt();
		numero2 = reader.nextInt();
		
		System.out.println("¿Cual opción quieres elegir?");
		System.out.println("A.SUMAR LOS NÚMEROS");
		System.out.println("B.RESTAR LOS NÚMEROS");
		System.out.println("C.MULTIPLICAR LOS NÚMEROS");
		System.out.println("D.DIVIDIR LOS NÚMEROS");
		opcion = reader.next();
		
		switch (opcion) {
		case "A" ->
		System.out.println(numero1 + numero2);
		case "B" ->
		System.out.println(numero1 - numero2);
		case "C" ->
		System.out.println(numero1 * numero2);
		case "D" ->
		System.out.println(numero1 / numero2);
		default ->
		System.out.println("Valor incorrecto");
		}
		
		reader.close();
	}

}
