package Service;

import java.util.ArrayList;
import java.util.List;

import Model.Livro;
import Model.Revista;
import View.Atendente;

public class Estoque {
	private List<Livro> listaLivros;
	private List<Revista> listaRevistas;

	public Estoque() {

		listaLivros = new ArrayList<>();
		listaRevistas = new ArrayList<>();

	}

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch (opcao) {
		case 1 -> {
			String titulo = atendente.tituloLivro();
			String editora = atendente.editoraLivro();
			String anoPublicacao = atendente.anoPublicacaoLivro();
			String autor = atendente.autorLivro();
			String ISBN = atendente.isbnLivro();
			double preco = atendente.precoLivro();
			String genero = atendente.generoLivro();

			Livro livro = new Livro(titulo, editora, anoPublicacao, autor, ISBN, genero, preco);
			listaLivros.add(livro);
		}
		
		case 2 -> {
			String titulo = atendente.tituloRevista();
			String editora = atendente.editoraRevista();
			String anoPublicacao = atendente.anoPublicacaoRevista();
			String manchete = atendente.mancheteRevista();
			String ISSN = atendente.issnRevista();
			
			Revista revista = new Revista(titulo, editora, anoPublicacao, manchete, ISSN);
			listaRevistas.add(revista);
		}
		
		case 3 -> {
			
			for(Livro livro: listaLivros) {
				if(listaLivros.isEmpty()) {
					atendente.mensagemListaVazia();
				} else {
					atendente.visualizarLivro(livro);
				}
			}
		}
		
		case 4 -> {
			
			for(Revista revista: listaRevistas) {
				if(listaRevistas.isEmpty()) {
					atendente.mensagemListaVazia();
				} else {
					atendente.visualizarRevista(revista);
				}
			}
		}
		
		case 5 -> {
			String titulo = atendente.removerLivro();
			boolean removido = false;
			
			for(int indice = 0; indice < listaLivros.size(); indice++) {
				if(listaLivros.get(indice).getTitulo().equalsIgnoreCase(titulo)) {
					listaLivros.remove(indice);
					removido = true;
				}
			}
			
			if(removido) {
				atendente.mensagemLivroRemovido(titulo);
			} else {
				atendente.mensagemNaoEncontradoLivro(titulo);
			}
		}
		
		case 6 -> {
			String titulo = atendente.removerRevista();
			boolean removido = false;
			
			for(int indice = 0; indice < listaRevistas.size(); indice++) {
				if(listaRevistas.get(indice).getTitulo().equalsIgnoreCase(titulo)) {
					listaRevistas.remove(indice);
					removido = true;
				}
			}
			
			if(removido) {
				atendente.mensagemRevistaRemovida(titulo);
			} else {
				atendente.mensagemNaoEncontradaRevista(titulo);
			}
		}
		
		case 7 -> {
			String tituloBusca = atendente.tituloLivro();
			boolean achado = false;
			
			for(Livro livro: listaLivros) {
				if(livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
					
				}
			}
		}

		}
	}

}
