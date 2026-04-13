import java.util.Scanner;

public class Quest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade = 0;
		int opiniao = 0;
		int contadorIdade = 0;
		int contadorRegular = 0;
		int contadorBom = 0;
		int contadorOtimo = 0;
		int mediaIdade = 0;

		for (int i = 1; i <= 15; i++) {
			System.out.print("Escreva a sua idade: ");
			idade = sc.nextInt();

			System.out.print("Resposta " + i + "º");
			System.out.print("\n[1]Regular");
			System.out.print("\n[2]Bom");
			System.out.print("\n[3]Ótimo");
			System.out.print("\nDeixe a sua opinião sobre o filme: ");
			opiniao = sc.nextInt();

			if (opiniao == 3) {
				contadorIdade += idade;
				contadorOtimo++;
				contadorIdade++;
			}
			if (opiniao == 2) {
				contadorBom++;
			}
			if (opiniao == 1) {
				contadorRegular++;
			}
			if (opiniao > 3) {
				System.out.print("Escolha incorreta!");
				break;
			}
		}

		mediaIdade = idade / contadorOtimo;

		if (contadorOtimo == 0) {
			System.out.print("\nA idade média de pessoas que responderam ótimo foi de: 0");
			System.out.print("\nA quantidade de pessoas que responderam regular foi: " + contadorRegular);
			System.out.print("\nA porcentagem de pessoas que responderam bom foi: " + (contadorBom * 100) / 15 + "%");
		} else {
			System.out.print("\nA idade média de pessoas que responderam ótimo foi de: " + mediaIdade);
			System.out.print("\nA quantidade de pessoas que responderam regular foi: " + contadorRegular);
			System.out.print("\nA porcentagem de pessoas que responderam bom foi: " + (contadorBom * 100) / 15 + "%");
		}

		sc.close();

	}

}
