import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao = -1;
		boolean continuar = true;

		do {
			System.out.println("+====================+");
			System.out.println("|=====|| Menu ||=====|");
			System.out.println("+====================+");
			System.out.println("|[1] Cadastrar       |");
			System.out.println("|[2] Listar          |");
			System.out.println("|[0] Cadastrar       |");
			System.out.println("+====================+");
			try {
				System.out.print("Escolha: ");
				opcao = Integer.parseInt(sc.nextLine());

				switch (opcao) {
				case 1 -> System.out.println("Cadastrando...");
				case 2 -> System.out.println("Listando...");
				case 0 -> {
					System.out.println("Encerrando...");
					continuar = false;
				}
				default -> System.out.println("Opção incorreta!");
				}
			} catch (Exception erro) {
				System.out.println("Ocorreu um erro! Tente novamente");
			}
		} while (continuar);

	}

}
