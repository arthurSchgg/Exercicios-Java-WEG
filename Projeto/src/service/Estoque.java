package service;

import java.util.List;
import java.util.ArrayList;
import model.Fruta;
import model.Produto;
import model.Verdura;
import view.Atendente;

public class Estoque {
	private List<Fruta> listaFruta;
	private List<Verdura> listaVerdura;
	private List<Produto> listaProduto;

	public Estoque() {
		listaFruta = new ArrayList<>();
		listaVerdura = new ArrayList<>();
		listaProduto = new ArrayList<>();
	}

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch (opcao) {
		case 1 -> {
			String nome = atendente.frutaNome();
			double preco = atendente.frutaPreco();
			int quantidade = atendente.frutaQuantidade();
			double peso = atendente.frutaPeso();

			Fruta fruta = new Fruta(nome, preco, quantidade, peso);
			listaFruta.add(fruta);
		}
		
		case 2 -> {
			String nome = atendente.verduraNome();
			double preco = atendente.verduraPreco();
			int quantidade = atendente.verduraQuantidade();
			String tipo = atendente.verduraTipo();
			
			Verdura verdura = new Verdura(nome, preco, quantidade, tipo);
			listaVerdura.add(verdura);
		}

		case 3 -> {
			for (Fruta fruta : listaFruta) {
				atendente.visualizarFruta(fruta);
			}
		}
		
		case 4 -> {
			for (Verdura verdura : listaVerdura) {
				atendente.visualizarVerdura(verdura);
			}
		}
		
		case 5 -> {
			String fruta = atendente.perguntaParaBuscarFruta();
			boolean encontrado = false;
			
			for(int indice = 0; indice <listaFruta.size(); indice++) {
				if(listaFruta.get(indice).getNome().equalsIgnoreCase(fruta)) {
					atendente.visualizarFruta(listaFruta.get(indice));
					encontrado = true;
				}
			} 
			
			if(!encontrado) {
				atendente.mensagemNaoEncontrado();
			}
		}
		
		case 6 -> {
			String verdura = atendente.perguntaParaBuscarVerdura();
			boolean encontrado = false;
			
			for(int indice = 0; indice <listaVerdura.size(); indice++) {
				if(listaVerdura.get(indice).getNome().equalsIgnoreCase(verdura)) {
					atendente.visualizarVerdura(listaVerdura.get(indice));
					encontrado = true;
				}
			} 
			
			if(!encontrado) {
				atendente.mensagemNaoEncontrado();
			}
		}

		case 7 -> {
			String nome = atendente.removerFruta();
			boolean removido = false;

			for (int indice = 0; indice < listaFruta.size(); indice++) {
				if (listaFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
					listaFruta.remove(indice);
					removido = true;
				}
			}

			if (removido) {
				atendente.visualizarFrutaRemovidada(nome);
			} else {
				atendente.mensagemNaoEncontrado();
			}
		}
		
		case 8 -> {
			String nome = atendente.removerVerdura();
			boolean removido = false;
			
			for (int indice = 0; indice < listaVerdura.size(); indice++) {
				if (listaVerdura.get(indice).getNome().equalsIgnoreCase(nome)) {
					listaVerdura.remove(indice);
					removido = true;
					break;
				}
			}
			
			if (removido) {
				atendente.vizualizarVerduraRemovidada(nome);
			} else {
				atendente.mensagemNaoEncontrado();
			}
		}
		
		case 9 -> {
			int contador = 0;
			
			for(Produto produto: listaFruta) {
				if(produto instanceof Fruta fruta) {
					contador++;
					System.out.println("O total de frutas é de: " + contador);
				}

			}
		}
		case 10 -> {
			int contador = 0;
			
			for(Produto produto: listaVerdura) {
				if(produto instanceof Verdura verdura) {
					contador++;
					System.out.println("O total de frutas é de: " + contador);
				}
				
			}
		}
		
		case 0 -> {
			atendente.finalizarApp();
		}
		
		default -> {
			atendente.erro();
		}
		}
	}
}