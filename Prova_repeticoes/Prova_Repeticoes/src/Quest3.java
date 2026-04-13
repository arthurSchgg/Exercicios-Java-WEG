import java.util.Scanner;

public class Quest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		do {
			System.out.print("Escreva um número: ");
			num = sc.nextInt();

			if (num > 80) {
				System.out.print("Número válido, é maior que 80");
				break;
			} else if (num < 25) {
				System.out.print("Número válido, é menor que 25");
				break;
			} else if (num == 40) {
				System.out.print("Número válido, é igual a 40");
				break;
			} else {
				System.out.print("Número inválido");
				break;
			}
		} while (num > 80 || num < 25 || num == 40);

		sc.close();

	}

}
