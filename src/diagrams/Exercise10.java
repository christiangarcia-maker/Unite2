package diagrams;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Creación del escaner.
		Scanner ch = new Scanner(System.in);
		
		// Declaración de la varaible donde se almacena los segundos.
		int segundos;
		
		// Declaración de la varaible donde se almacena los minutos.
		int minutos;
		
		// Declaración de la varaible donde se almacena las horas.
		int hora;
		
		System.out.println("introduce los segundos");
		segundos = ch.nextInt();
		
		System.out.println("introduce los minutos");
		minutos = ch.nextInt();
		
		System.out.println("introduce las horas");
		hora = ch.nextInt();
		
		if (segundos<59) {
			segundos++;
		} else {
			segundos = 00;
			if (minutos<59) {
				minutos++;
			} else {
				minutos = 00;
				if (hora<23) {
					hora++;
				} else {
					hora = 00;
				} // Final horas.
			} // Final minutos.
		} // Final segundos.
		
		System.out.println("La hora actual es " + hora + ":" + minutos + ":" + segundos );
		
		// Cierre del escaner.
		ch.close();

	}

}
