import java.util.Scanner;

public class Ativ04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int escolha;
		double totalCachorroQuente = 0.0;
		double totalBauruSimples = 0.0;
		double totalBauruComOvo = 0.0;
		double totalHamburguer = 0.0;
		double totalChesseburguer = 0.0;
		double totalRefri = 0.0;

		do {
			System.out.println("\n+=================================================+");
			System.out.println("|=============|| Lanchonete do Zé || =============|");
			System.out.println("+=================================================+");
			System.out.println("|         Especificação  | Código | Preço         |");
			System.out.println("+------------------------+--------+---------------+");
			System.out.println("| Cachorro Quente        |  100   | R$ 1,20       |");
			System.out.println("+------------------------+--------+---------------+");
			System.out.println("| Bauru Simples          |  101   | R$ 1,30       |");
			System.out.println("+------------------------+--------+---------------+");
			System.out.println("| Bauru com Ovo          |  102   | R$ 1,50       |");
			System.out.println("+------------------------+--------+---------------+");
			System.out.println("| Hambúrguer             |  103   | R$ 1,20       |");
			System.out.println("+------------------------+--------+---------------+");
			System.out.println("| Chesseburguer          |  104   | R$ 1,30       |");
			System.out.println("+------------------------+--------+---------------+");
			System.out.println("| Refrigerante           |  105   | R$ 1,00       |");
			System.out.println("+=================================================+");
			System.out.print("Escolha um pedido (informe 0 para parar o pedido): ");
			escolha = sc.nextInt();

			switch (escolha) {
			case 100 -> {
				System.out.print("Informe a quantidade que você deseja: ");
				int quantidade = sc.nextInt();
				totalCachorroQuente = 1.20 * quantidade;
				System.out.printf("Total: R$ %.2f", totalCachorroQuente);
			}
			case 101 -> {
				System.out.print("Informe a quantidade que você deseja: ");
				int quantidade = sc.nextInt();
				totalBauruSimples = 1.30 * quantidade;
				System.out.printf("Total: R$ %.2f", totalBauruSimples);
			}
			case 102 -> {
				System.out.print("Informe a quantidade que você deseja: ");
				int quantidade = sc.nextInt();
				totalBauruComOvo = 1.50 * quantidade;
				System.out.printf("Total: R$ %.2f", totalBauruComOvo);
			}
			case 103 -> {
				System.out.print("Informe a quantidade que você deseja: ");
				int quantidade = sc.nextInt();
				totalHamburguer = 1.20 * quantidade;
				System.out.printf("Total: R$ %.2f", totalHamburguer);
			}
			case 104 -> {
				System.out.print("Informe a quantidade que você deseja: ");
				int quantidade = sc.nextInt();
				totalChesseburguer = 1.30 * quantidade;
				System.out.printf("Total: R$ %.2f", totalChesseburguer);
			}
			case 105 -> {
				System.out.print("Informe a quantidade que você deseja: ");
				int quantidade = sc.nextInt();
				totalRefri = 1.00 * quantidade;
				System.out.printf("Total: R$ %.2f", totalRefri);
			}
			default -> {
				System.out.println("Opção incorreta...x");
			}
			}
		} while (escolha != 0);

		double totalGeral = totalCachorroQuente + totalBauruSimples + totalBauruComOvo + totalHamburguer
				+ totalChesseburguer + totalRefri;
		System.out.printf("O valor total do seu pedido foi de: R$ %.2f", totalGeral);
	}
}
