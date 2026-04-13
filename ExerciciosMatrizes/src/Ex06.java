import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int somaElementos = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("Escreva o valor da linha " + i + ", e da Coluna " + j + ": ");
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elementos na diagonal: ");

		for (int i = 0; i < matriz.length; i++) {

			System.out.println(matriz[i][i]);

			somaElementos = somaElementos + matriz[i][i];
		}

		System.out.println("Soma dos elementos em diagonal : " + somaElementos);

		sc.close();
	}

}
