import java.util.Random;
import java.util.Scanner;

public class Amostragem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();

		System.out.println("========================================");
		System.out.println("|==|| Amostragem Aleatória Simples ||==|");
		System.out.println("========================================");

		System.out.print("Qual é o número total de itens na população (Limite Máximo)? ");
		int limiteMaximo = sc.nextInt();

		sc.nextLine();

		if (limiteMaximo <= 0) {
			System.out.println("O limite deve ser maior que zero.");
			sc.close();
			return;
		}

		int itemSorteado = gerador.nextInt(limiteMaximo) + 1;

		System.out.println("\n-------------------------------------");
		System.out.println("O Item Aleatório Selecionado: " + itemSorteado);
		System.out.println("-------------------------------------");

		sc.close();
	}

}
