package bucledowhile;

public class Exercise02 {

	public static void main(String[] args) {

		// Numero inicializado en numero.
		int numero = 1;

		// Si el modulo del número es 0 se imprime y aumenta la variable en 1, de no ser
		// asi, solo aumenta la variable en 1.
		do {
			if (numero % 2 == 0) {
				System.out.println(numero);
				numero++;
			} else {
				numero++;
			}
		// Si numero es menor o igual que 200 el bucle sigue.
		} while (numero <= 200);

	}

}
