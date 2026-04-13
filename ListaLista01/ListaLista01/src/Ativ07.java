import java.util.Arrays;
import java.util.Scanner;

public class Ativ07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] listaInteiros = new int[5];

		int soma = 0;
		int multiplicacao = 1;
		int num = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Escreva o " + (i + 1) + "º número: ");
			num = sc.nextInt();

			listaInteiros[i] = num;

			soma = soma + num;
			multiplicacao = multiplicacao * num;
		}

		System.out.println("A soma dos números foi de: " + soma);
		System.out.println("A multiplicação dos números foi de: " + multiplicacao);
		System.out.println("A lista dos números foi de: " + Arrays.toString(listaInteiros));

		sc.close();

	}

}
