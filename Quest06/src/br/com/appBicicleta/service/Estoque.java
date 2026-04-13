package br.com.appBicicleta.service;

import java.util.ArrayList;
import java.util.List;
import br.com.appBicicleta.model.Bicicleta;
import br.com.appBicicleta.view.Atendente;

public class Estoque {
	List<Bicicleta> listaBicicletas;

	public Estoque() {
		listaBicicletas = new ArrayList<>();
	}

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		switch (opcao) {

		case 1 -> {
			String marca = atendente.marcaBicicleta();
			String modelo = atendente.modeloBicicleta();
			double quadro = atendente.tamanhoQuadroBicicleta();
			double preco = atendente.precoBicicleta();

			Bicicleta bicicleta = new Bicicleta(marca, modelo, quadro, preco);
			listaBicicletas.add(bicicleta);
			atendente.mensagemSucessoCadastro();
		}

		case 2 -> {
			if (listaBicicletas == null || listaBicicletas.isEmpty()) {
				atendente.mensagemListaVazia();
			} else {
				for (Bicicleta bike : listaBicicletas) {
					atendente.visualizar(bike);
				}
			}
		}

		case 3 -> {
			String modelo = atendente.perguntaBicicletaRemover();
			boolean removido = false;

			for (int indice = 0; indice < listaBicicletas.size(); indice++) {
				if (listaBicicletas.get(indice).getModelo().equalsIgnoreCase(modelo)) {
					listaBicicletas.remove(indice);
					removido = true;
					break;
				}
			}

			if (removido) {
				atendente.mensagemBicicletaRemovida(modelo);
			} else {
				atendente.mensagemNaoEncontrada(modelo);
			}
		}

		case 4 -> {
			String modeloBusca = atendente.perguntaParaBuscar();
			Bicicleta bikeEncontrada = null;

			for (Bicicleta bike : listaBicicletas) {
				if (bike.getModelo().equalsIgnoreCase(modeloBusca)) {
					bikeEncontrada = bike;
					break;
				}
			}

			if (bikeEncontrada != null) {
				atendente.visualizar(bikeEncontrada);
			} else {
				atendente.mensagemNaoEncontrada(modeloBusca);
			}
		}

		case 5 -> {
			System.out.println("Saindo do sistema... Até logo!");
		}

		}

	}
}