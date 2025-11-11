package buclefor;

public class Exercise04 {

	public static void main(String[] args) {
		int contadorImpar = 0;
		
		int suma = 0;
		
		int numero = 1;
		
		for (int contador = 1; contador<=10; contador++) {
			suma+= numero;
			numero+=2;
		}
		
		System.out.println("La suma de los primeros 10 números impares da como resultado: "+ suma);
	}

}
