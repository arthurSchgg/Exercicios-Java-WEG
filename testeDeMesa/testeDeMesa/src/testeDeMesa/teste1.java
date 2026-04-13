package testeDeMesa;

public class teste1 {

	public static void main(String[] args) {

		int i = 1;
		int y = 2;
		int x = 3;

		int quadrado = y * y;
		int valorFinal = quadrado + x;

		for (i = 1; i <= 3; i++) {

			System.out.println("\ny = " + y);
			System.out.println("x = " + x);

			if (valorFinal % 2 == 0) {
				System.out.println("O número é par");

			} else {
				System.out.println("O número é impar");
			}

			y = y * 2 + 1;
			x = x * 2;

		}
	}
}