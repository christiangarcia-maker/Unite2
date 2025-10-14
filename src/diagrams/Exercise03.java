package diagrams;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		int primerNumero;
		
		int segundoNumero;
		
		int suma;
		
		int resta;
		
		double multiplicacion;
		
		double division;
		
		System.out.println("Dime un número.");
		primerNumero = ch.nextInt();
		
		System.out.println("Dime otro numero");
		segundoNumero = ch.nextInt();
		
		suma = primerNumero + segundoNumero;
		
		resta = primerNumero - segundoNumero;
		
		multiplicacion = primerNumero * segundoNumero;
		
		division = (double)primerNumero/segundoNumero;
		
		System.out.println("La suma de ambos números es: " + suma);
		System.out.println("La resta de ambos números es: " + resta);
		System.out.println("La multiplicación de ambos números es: " + multiplicacion);
		
		if (segundoNumero == 0.0) {
			System.out.println("No se puede divivir entre cero.");
		}else {
			System.out.println("La división de ambos números es: " + division);
		}
		
		ch.close();

	}

}
