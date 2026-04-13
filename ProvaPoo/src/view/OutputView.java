package view;

import model.livro.Livro;

public class OutputView {

	public void LivroNaoEncontrado(Livro livro) {
		System.out.println("O livro '" + livro + "' não foi encontrado!");
	}

	public void EstoqueVazio() {
		System.out.println("O estoque está vazio!");
	}

	public void EstoqueAtualizado() {
		System.out.println("O estoque foi atualizado!");
	}

	public void opcaoIncorreta() {
		System.out.println("Opção incorreta! Tente novamente");
	}

	public void emailIncorreto() {
		System.out.println("E-mail incorreto! Tente novamente");
	}

	public void cpfIncorreto() {
		System.out.println("CPF incorreto! Tente novamente");
	}

	public void senhaCurtaDemais() {
		System.out.println("A sua senha é muito curta! Tente novamente");
	}

	public void loginConcluido() {
		System.out.println("Login fetio com sucesso!!");
	}

	public void senhaIncorreta() {
		System.out.println("Senha incorreta! Tente novamente");
	}

	public void encerrandoPrograma() {
		System.out.println("\n");
		System.out.println("╔═══════════════════════════════════════╗");
		System.out.println("║          SESSÃO FINALIZADA            ║");
		System.out.println("╠═══════════════════════════════════════╣");
		System.out.println("║   Obrigado por utilizar nosso sistema ║");
		System.out.println("║          Volte sempre, craque!        ║");
		System.out.println("╚═══════════════════════════════════════╝");
	}
}
