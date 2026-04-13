package br.com.appTelefone.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appTelefone.model.Telefone;
import br.com.appTelefone.view.Atendente;

public class Estoque {
	List<Telefone> listaTelefones;

	public Estoque() {
		listaTelefones = new ArrayList<>();
	}

	public void GerenciarEstoque(int escolha, Atendente atendente) {
		switch (escolha) {
		case 1 -> {
			String marca = atendente.marcaTelefone();
			String modelo = atendente.modeloTelefone();
			double preco = atendente.precoTelefone();
			double memoria = atendente.memoriaTelefone();
			Telefone novoTelefone = new Telefone(marca, modelo, preco, memoria);
			listaTelefones.add(novoTelefone);
			System.out.println("Telefone cadastrado com sucesso!!");
		}

		case 2 -> {
			if (listaTelefones.isEmpty()) {
				System.out.println("Nenhum telefone encontrado!");
			} else {
				for (Telefone telefone : listaTelefones) {
					atendente.listarTelefones(telefone);
				}
			}
		}

		case 3 -> {
			String modelo = atendente.removerTelefones();
			boolean removido = false;

			for (int indice = 0; indice < listaTelefones.size(); indice++) {
				if (listaTelefones.get(indice).getModelo().equalsIgnoreCase(modelo)) {
					listaTelefones.remove(indice);
					removido = true;
					break;
				}
			}

			if (removido) {
				atendente.vizualizarTelefoneRemovidado(modelo);
			} else {
				atendente.mensagemNaoEncontrado();
			}
		}

		case 4 -> {
			String modeloQuerBuscar = atendente.perguntarModeloBuscar();
			Telefone telefoneEncontrado = atendente.buscarTelefone(listaTelefones, modeloQuerBuscar);

			if (telefoneEncontrado != null) {
				System.out.println("Telefone encontrado!");
				atendente.listarTelefones(telefoneEncontrado);
			} else {
				atendente.mensagemNaoEncontrado();
			}
		}
		}
	}

}
