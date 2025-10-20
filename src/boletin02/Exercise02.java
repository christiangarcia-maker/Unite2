package boletin02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int diaSemana;
		
		System.out.println("Introduce un número del 1 al 7.");
		diaSemana = reader.nextInt();
		
		switch (diaSemana) {
		case 1 ->
		System.out.println("Lunes");
		case 2 ->
		System.out.println("Martes");
		case 3 ->
		System.out.println("Miércoles");
		case 4 ->
		System.out.println("Jueves");
		case 5 ->
		System.out.println("Viernes");
		case 6 ->
		System.out.println("Sabado");
		case 7 ->
		System.out.println("Domingo");
		default ->
		System.out.println("Valor incorrecto");
		}
		
		
		reader.close();
	}

}
