import java.util.Scanner;

public class Ativ05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao;
		int contadorA = 0;
		int contadorB = 0;
		int contadorC = 0;
		int contadorNulo = 0;
		int contadorBranco = 0;

		do {
			System.out.println("+==============================================+");
			System.out.println("|=============|| Cédula Digital ||=============|");
			System.out.println("+==============================================+");
			System.out.println("|[1] Canditato A                               |");
			System.out.println("|[2] Canditato B                               |");
			System.out.println("|[3] Canditato C                               |");
			System.out.println("|[4] Voto nulo                                 |");
			System.out.println("|[5] Voto em branco                            |");
			System.out.println("|[0] Sair                                      |");
			System.out.println("+==============================================+");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1 -> {
				contadorA++;
			}
			case 2 -> {
				contadorB++;
			}
			case 3 -> {
				contadorC++;
			}
			case 4 -> {
				contadorNulo++;
			}
			case 5 -> {
				contadorBranco++;
			}
			}
		} while (opcao != 0);

		double totalVotos = contadorA + contadorB + contadorC + contadorNulo + contadorBranco;

		System.out.println("+==============================================+");
		System.out.println("|===============|| Resultados ||===============|");
		System.out.println("+==============================================+");
		System.out.println("Candidato A teve " + contadorA + " votos!");
		System.out.println("Candidato B teve " + contadorB + " votos!");
		System.out.println("Candidato C teve " + contadorC + " votos!");
		System.out.println("O total de votos nulos foi de: " + contadorNulo);
		System.out.println("O total de votos em branco foi de: " + contadorBranco);
		System.out.println(
				"A porcentagem de votos nulos sobre o total de votos foi de: " + contadorNulo / totalVotos * 100 + "%");
		System.out.println("A porcentagem de votos em branco sobre o total de votos foi de: "
				+ contadorBranco / totalVotos * 100 + "%");

	}

}
