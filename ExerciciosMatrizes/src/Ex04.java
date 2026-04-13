import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[6];
		int num;

		System.out.println("Escreva 6 números");

		for (int i = 0; i < 6; i++) {
			System.out.print("Escreva o " + (i + 1) + "º número: ");
			num = sc.nextInt();
			numeros[i] = num;

		}

		System.out.println("Imprimindo os números na ordem inversa que foram escrita: ");

		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}

		sc.close();
	}

}
