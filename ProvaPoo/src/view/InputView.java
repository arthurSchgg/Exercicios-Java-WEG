package view;

import java.util.Scanner;
import model.usuario.NivelAcesso.nivelAcesso;

public class InputView {
	Scanner sc;

	OutputView mensagem;

	public InputView() {
		sc = new Scanner(System.in);
		mensagem = new OutputView();
	}
	
	// Cadastro do usuário
	public int subMenuCadastrar() {
		System.out.println("+===========================+");
		System.out.println("[1] Cadastrar");
		System.out.println("[2] Fazer o login");
		System.out.print("Escolha uma opção: ");
		int opcao = sc.nextInt();
		sc.nextLine();
		return(opcao);
	}
	
	public String nomeUsuario() {
		System.out.print("Digite o seu nome: ");
		return sc.nextLine();
	}

	public String cpfUsuario() {
		System.out.print("Digite o seu CPF (Exatamente 11 números): ");
		return sc.nextLine();
	}

	public String emailUsuario() {
		System.out.print("Digite o seu email (obrigatório o @): ");
		return sc.nextLine();
	}

	public String senhaUsuario() {
		System.out.print("Digite a sua senha (no minímo 7 dígitos): ");
		return sc.nextLine();
	}

	public nivelAcesso escolherNivelAcesso() {
		System.out.println("+===========================+");
		System.out.print("Qual o seu nivel de acesso?\n");

		nivelAcesso[] niveis = nivelAcesso.values();

		for (int i = 0; i < niveis.length; i++) {
			System.out.println("[" + (i + 1) + "] " + niveis[i]);
		}

		int escolha = -1;

		while (true) {
			try {
				System.out.print("Escolha uma opção: ");
				escolha = Integer.parseInt(sc.nextLine());

				if (escolha > 0 && escolha <= niveis.length) {
					return niveis[escolha - 1];
				} else {
					mensagem.opcaoIncorreta();
				}
			} catch (NumberFormatException erro) {
				mensagem.opcaoIncorreta();
			}
		}
	}
	
	public String emailConfirmacao() {
		System.out.print("Entre com o seu email cadastrado: ");
		return sc.nextLine();
	}
	
	public String senhaConfirmacao() {
		System.out.print("Entre com a sua senha cadastrada: ");
		return sc.nextLine();
	}
}
