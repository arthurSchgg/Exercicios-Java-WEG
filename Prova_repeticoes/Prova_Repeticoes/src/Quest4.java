import java.util.Scanner;

public class Quest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int escolha = 0;
		int valorAtual = 0;
		int valorAvista = 0;
		int valorAprazo = 0;
		int valorTotal = 0;
		double valorPrestacao = 0.0;

		do {
			for (int i = 1; i <= 15; i++) {

				System.out.print("\n+-------------------------------------+");
				System.out.print("\n|            Loja do seu Zé           |");
				System.out.print("\n+-------------------------------------+");
				System.out.print("\n|[1]À vista                           |");
				System.out.print("\n|[2]A prazo                           |");
				System.out.print("\n|[0]Finalizar Compra                  |");
				System.out.print("\n+-------------------------------------+");
				System.out.print("\nEscolha uma forma de pagamento: ");
				escolha = sc.nextInt();

				System.out.print("Escreva o valor da " + i + "º transação: ");
				num = sc.nextInt();
				valorAtual += num;

				if (escolha == 0) {
					System.out.print("Finalizando compra...");
					break;
				} else if (escolha < 0 || escolha > 2) {
					System.out.print("Escolha incorreta!");
				}
				switch (escolha) {
				case 1:
					valorAvista += valorAtual;
					System.out.print("O valor à vista ficou em R$" + valorAtual);
					break;
				case 2:
					valorAprazo += valorAtual;
					System.out.print("O valor em a prazo ficou em R$" + valorAprazo);
					break;
				}

			}
		} while (escolha != 0);

		valorTotal = valorAprazo + valorAvista;

		valorPrestacao = (double) valorAprazo / 3;

		System.out.print("\nO valor total de compras à vista foi de R$" + valorAvista);
		System.out.print("\nO valor total de compras a prazo foi de R$" + valorAprazo);
		System.out.print("\nO valor total de todas as compras foi de R$" + valorTotal);
		System.out.print("\nO valor da primeira prestação foi de R$" + valorPrestacao);

		sc.close();
	}

}
