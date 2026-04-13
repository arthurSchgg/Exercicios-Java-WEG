package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Livro;
import Model.Revista;

public class Atendente {
	ArrayList<Livro> listaLivros;
	ArrayList<Revista> listaRevistas;
	Scanner sc;

	public Atendente() {

		listaLivros = new ArrayList<>();
		listaRevistas = new ArrayList<>();
		sc = new Scanner(System.in);

	}

	public int menuOpcao() {
		System.out.println("+==============================================+");
		System.out.println("|==========|| Biblioteca do Carlão ||==========|");
		System.out.println("+==============================================+");
		System.out.println("|[1] Cadastrar Livro                           |");
		System.out.println("|[2] Cadastrar Revista                         |");
		System.out.println("|[3] Listar Livros                             |");
		System.out.println("|[4] Listar Revistas                           |");
		System.out.println("|[5] Remover Livro                             |");
		System.out.println("|[6] Remover Revista                           |");
		System.out.println("|[7] Editar Livro                              |");
		System.out.println("|[8] Editar Revista                            |");
		System.out.println("|[9] Buscar Livro                              |");
		System.out.println("|[10] Buscar Revista                           |");
		System.out.println("|[11] Realizar empréstimo (só para livros)     |");
		System.out.println("|[12] Realizar devolução (só para livros)      |");
		System.out.println("|[0] Sair                                      |");
		System.out.println("+==============================================+");
		System.out.print("Escolha uma opção: ");
		int opcao = sc.nextInt();
		sc.nextLine();
		return opcao;

	}

	// Cadastrar Livro

	public String tituloLivro() {
		System.out.print("Escreva o título do livro: ");
		return sc.nextLine();
	}

	public String editoraLivro() {
		System.out.print("Escreva a editora do livro: ");
		return sc.nextLine();
	}

	public String anoPublicacaoLivro() {
		System.out.print("Escreva o ano de publicação do livro (DD/MM/AAAA): ");
		return sc.nextLine();
	}

	public String autorLivro() {
		System.out.print("Escreva o autor do livro: ");
		return sc.nextLine();
	}

	public String isbnLivro() {
		System.out.print("Escreva o ISBN do livro: ");
		return sc.nextLine();
	}

	public double precoLivro() {
		System.out.print("Escreva o preço do livro: R$ ");
		return sc.nextDouble();
	}

	public String generoLivro() {
		sc.nextLine();
		System.out.print("Escreva o genêro do livro: ");
		return sc.nextLine();
	}

	// Cadastrar revista

	public String tituloRevista() {
		System.out.print("Escreva o título do revista: ");
		return sc.nextLine();
	}

	public String editoraRevista() {
		System.out.print("Escreva a editora do revista: ");
		return sc.nextLine();
	}

	public String anoPublicacaoRevista() {
		System.out.print("Escreva o ano de publicação do revista (DD/MM/AAAA): ");
		return sc.nextLine();
	}

	public String mancheteRevista() {
		System.out.print("Escreva a manchete da revista: ");
		return sc.nextLine();
	}

	public String issnRevista() {
		System.out.print("Escreva a ISSN da revista: ");
		return sc.nextLine();
	}

	// Listar livro

	public void visualizarLivro(Livro livro) {

		System.out.println("+======================================+");
		System.out.println("Título do livro: " + livro.getTitulo());
		System.out.println("Editora do livro: " + livro.getEditora());
		System.out.println("Ano de publicação do livro: " + livro.getAnoPublicacao());
		System.out.println("Autor do livro: " + livro.getAutor());
		System.out.println("ISBN do livro: " + livro.getISBN());
		System.out.printf("Preço do livro: R$ %.2f", livro.getPreco());
		System.out.println("\nGenêro do livro: " + livro.getGenero());
		System.out.println("Código do livro: " + livro.getCodigo());
		System.out.println("+======================================+\n");

	}

	// Listar revista

	public void visualizarRevista(Revista revista) {

		System.out.println("+======================================+");
		System.out.println("Título da revista: " + revista.getTitulo());
		System.out.println("Editora da revista: " + revista.getEditora());
		System.out.println("Ano de publicação da revista: " + revista.getAnoPublicacao());
		System.out.println("Manchete da revista: " + revista.getManchete());
		System.out.println("ISSN do livro: " + revista.getISSN());
		System.out.println("Código da revista: " + revista.getCodigo());
		System.out.println("+======================================+\n");

	}

	// Remover livro

	public String removerLivro() {
		System.out.println("Escreva o título de um livro para excluir: ");
		return sc.nextLine();
	}

	public void mensagemLivroRemovido(String titulo) {
		System.out.println("O livro '" + titulo + "' foi removido!");
	}

	// Remover revista

	public String removerRevista() {
		System.out.println("Escreva o título de uma revista para excluir: ");
		return sc.nextLine();
	}

	public void mensagemRevistaRemovida(String titulo) {
		System.out.println("A revista '" + titulo + "' foi removida!");
	}

	// Editar livro

	public int menuEditarLivro() {
		System.out.println("+=======|| O que você deseja alterar no Livro? ||=======+");
		System.out.println("|[1] Título                                             |");
		System.out.println("|[2] Editora                                            |");
		System.out.println("|[3] Autor                                              |");
		System.out.println("|[4] ISBN                                               |");
		System.out.println("|[5] Genêro                                             |");
		System.out.println("|[6] Preço                                              |");
		System.out.println("|[0] Cancelar                                           |");
		System.out.println("+=======================================================+");
		System.out.println("Escolha uma opção: ");
		int opcaoLivro = sc.nextInt();
		sc.nextLine();
		return opcaoLivro;
	}
	
	//Editar revista
	
	public int menuEditarRevista() {
		System.out.println("+=======|| O que você deseja alterar na Revista? ||=======+");
		System.out.println("|[1] Título                                               |");
		System.out.println("|[2] Editora                                              |");
		System.out.println("|[3] Manchete                                             |");
		System.out.println("|[4] ISSN                                                 |");
		System.out.println("|[0] Cancelar                                             |");
		System.out.println("+=========================================================+");
		System.out.println("Escolha uma opção: ");
		int opcaoRevista = sc.nextInt();
		sc.nextLine();
		return opcaoRevista;
	}
	
	//Buscar livro
	
	public String perguntaParaBuscarLivro() {
		System.out.println("Escreva o título do livro que você quer achar: ");
		return sc.nextLine();
	}
	
	//Buscar revista
	
	public String perguntaParaBuscarRevista() {
		System.out.println("Escreva o título da revista que você quer achar: ");
		return sc.nextLine();
	}
	
	//Empréstimo livro
	
	public String emprestimoLivro() {
		System.out.println("Escreva o título do livro que você deseja fazer o empréstimo: ");
		return sc.nextLine();
	}
	
	//Devolução livro
	
	public void devolucaoLivro(String titulo) {
		 System.out.println("O livro '" + titulo + "' foi devolvido do empréstimo!");
	}
	
	//Mensagem de livro não encontrado
	
	public void mensagemNaoEncontradoLivro(String titulo) {
		System.out.println("O livro '" + titulo + "' não foi encontrado");
	}
	
	//Mensagem de revista não encontrada
	
	public void mensagemNaoEncontradaRevista(String titulo) {
		System.out.println("A revista '" + titulo + "' não foi encontrada");
	}
	
	//Mensagem lista vazia
	
	public void mensagemListaVazia() {
		System.out.println("A lista está vazia!");
	}
	
	//Mensagem de fim do programa
	
	public void fimPrograma() {
		System.out.println("Saindo do programa...");
	}
	
	//Mensagem que os dados foram atualizados com sucesso
	
	public void mensagemSucessoEdicao() {
		System.out.println("Dados atualizados com sucesso!!");
	}
	
	//Mensagem quando a opção escolhida é errada
	
	public void mensagemOpcaoInvalida() {
		System.out.println("Opção inválida! Tente de novo.");
	}
	
}
