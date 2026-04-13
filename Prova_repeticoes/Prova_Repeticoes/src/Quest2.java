import java.util.Scanner;

public class Quest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pessoasMasculino = 0;
		int pessoasFeminino = 0;

		for (int i = 0; i <= 56; i++) {
			System.out.print("\nDigite o seu nome: ");
			String nome = sc.next();

			System.out.print("\nColque seu gênero: \n[1]Masculino\n[2]Feminino\nEscolha: ");
			int escolha = sc.nextInt();

			if (escolha == 1) {
				System.out.print("Seu gênero é masculino");
				pessoasMasculino++;
			} else if (escolha == 2) {
				System.out.print("Seu gênero é feminino");
				pessoasFeminino++;
			} else {
				System.out.print("Saindo...");
				break;
			}
		}

		System.out.print("O total de homens é de: " + pessoasMasculino);
		System.out.print("\nO total de mulheres é de: " + pessoasFeminino);

		sc.close();

	}

}
