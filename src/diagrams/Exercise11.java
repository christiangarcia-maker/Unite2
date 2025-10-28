package diagrams;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		
		String nombre;
		
		int numeroHoras;
		
		double tarifaHoras;
		
		double salarioBruto;
		
		double salarioNeto;
		
		double tasas = 0;
		
		System.out.println("Introduzca el nombre");
		nombre = ch.nextLine();
		
		System.out.println("Introduzca el número de horas trabajadas");
		numeroHoras = ch.nextInt();
		
		System.out.println("Introduzca su tarifa por hora");
		tarifaHoras = ch.nextDouble();
		
		if (numeroHoras <=35) {
			salarioBruto = numeroHoras*tarifaHoras;
		} else {
			salarioBruto = 35*tarifaHoras + (numeroHoras-35) * tarifaHoras *1.5;
		}
	
		if (salarioBruto<=500 && salarioBruto<=900) {
			tasas = (salarioBruto-500)+0.25;
		} else {
			tasas = (salarioBruto-900)*0.45 + 400*0.25;
		}
		
		salarioNeto = salarioBruto - tasas;
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Tasas: " + tasas);
		System.out.println("Salario Neto: " + salarioNeto);
		
		ch.close();

	}

}
