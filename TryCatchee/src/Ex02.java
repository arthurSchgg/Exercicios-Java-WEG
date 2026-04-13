import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean escolhaInvalida = true;

		while (escolhaInvalida) {
			try {

				System.out.println("+=========================+");
				System.out.print("Escreva o 1º número: ");
				int num1 = Integer.parseInt(sc.nextLine());

				System.out.print("Escreva o 2º número: ");
				int num2 = Integer.parseInt(sc.nextLine());

				System.out.println("+=========================+");

				System.out.print("A soma é de : " + (num1 + num2) + "\n");
			} catch (NumberFormatException erro) {
				System.out.println("Valor inválido! Tente novamente");
			}
		}

		sc.close();

	}

}
