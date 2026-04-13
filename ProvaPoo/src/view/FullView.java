package view;

import java.util.Scanner;

public class FullView {
	Scanner sc;
	OutputView mensagem = new OutputView();

	public FullView() {
		sc = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("\n");
	    System.out.println("██████████████████████████████████████████");
	    System.out.println("█         BIBLIOTECA DO CHAPOLIN         █");
	    System.out.println("██████████████████████████████████████████");
	    System.out.println("█                                        █");
	    System.out.println("█    ► [1]  CADASTRO / LOGIN             █");
	    System.out.println("█    ► [0]  ENCERRAR                     █");
	    System.out.println("█                                        █");
	    System.out.println("██████████████████████████████████████████");

		int opcao = -1;
		try {
			System.out.print("Escolha uma opção: ");
			opcao = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException erro) {
			mensagem.opcaoIncorreta();
		}

		return opcao;

	}

}
