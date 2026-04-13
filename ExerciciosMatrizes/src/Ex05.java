import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		for (int i = 0; i < matriz.length; i++) {

			int somaLinha = 0;

			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Escreva o valor da linha " + i + ", e da Coluna " + j + ": ");
				matriz[i][j] = sc.nextInt();

				somaLinha = somaLinha + matriz[i][j];
			}

			System.out.println("A soma de linha " + (i + 1) + " é " + somaLinha);

		}

		sc.close();
	}
}
