import java.util.Scanner;

public class Quest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int contador = 0;

		for (int i = 1; i <= 80; i++) {
			System.out.print("Informe o " + i + "º número: ");
			num = sc.nextInt();

			if (num >= 10 && num <= 150) {
				contador++;
			}
		}

		System.out.print("A quantidade de números no intervalo de 10 a 150 é de: " + contador);

		sc.close();
	}

}
