import java.util.Scanner;

public class Ativ02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double precoKWh;
		double precoKWhR = 2.2;
		double precoKWhC = 3.1;
		double precoKWhI = 5.2;
		int numConsumidor = 0;
		int quantidade = 0;
		char codigo;
		double totalPagarR = 0.0;
		double totalPagarC = 0.0;
		double totalPagarI = 0.0;
		int maiorConsumo = 0;
		int menorConsumo = 0;
		int consumoR = 0;
		int consumoC = 0;
		int consumoI = 0;

		do {
			System.out.println("+================================================+");
			System.out.println("|========|| Pesquisa de consumo mensal ||========|");
			System.out.println("+================================================+");
			System.out.print("Escreva o número do consumidor (escreva 0 para finalizar o programa): ");
			numConsumidor = sc.nextInt();

			if (numConsumidor == 0) {
				break;
			} else {
				System.out.print("Preço do KWh consumido: ");
				precoKWh = sc.nextDouble();

				System.out.print("Quantidade de KWh que foram consumidos no mês: ");
				quantidade = sc.nextInt();

				if (quantidade > maiorConsumo) {
					maiorConsumo = quantidade;
				} else if (menorConsumo > quantidade) {
					quantidade = menorConsumo;
				}

				System.out.print(
						"Informe o seu código do tipo de consumidor (residencial = R, comercial = C, industrial = I): ");
				codigo = sc.next().charAt(0);
				if (codigo == 'r' || codigo == 'R') {
					consumoR++;
					totalPagarR = precoKWhR * quantidade;
					System.out.println("O consumidor '" + numConsumidor + "' tem o total a pagar de R$ " + totalPagarR);
				} else if (codigo == 'c' || codigo == 'C') {
					consumoC++;
					totalPagarC = precoKWhC * quantidade;
					System.out.println("O consumidor '" + numConsumidor + "' tem o total a pagar de R$ " + totalPagarC);
				} else if (codigo == 'i' || codigo == 'I') {
					consumoI++;
					totalPagarI = precoKWhI * quantidade;
					System.out.println("O consumidor '" + numConsumidor + "' tem o total a pagar de R$ " + totalPagarI);
				}

			}
		} while (numConsumidor != 0);

		double mediaGeral = (totalPagarR + totalPagarC + totalPagarI) / 3;

		System.out.println("+================================================+");
		System.out.println("|================|| Resultados ||================|");
		System.out.println("+================================================+");
		System.out.println("O maior consumo foi de: R$ " + maiorConsumo);
		System.out.println("O menor consumo foi de: R$ " + menorConsumo);
		System.out.println("O total de consumo para o consumidor do tipo Residencial foi de: " + consumoR);
		System.out.println("O total de consumo para o consumidor do tipo Comercial foi de: " + consumoC);
		System.out.println("O total de consumo para o consumidor do tipo Industrial foi de: " + consumoI);
		System.out.printf("A média geral de consumo foi de: R$ %.2f", mediaGeral);

	}

}
