package br.com.appAnimal.service;

import java.util.ArrayList;
import java.util.List;
import br.com.appAnimal.model.AnimalEstimacao;
import br.com.appAnimal.view.Atendente;

public class Estoque {
	List<AnimalEstimacao> listaAnimais;

	public Estoque() {
		listaAnimais = new ArrayList<>();
	}

	public void gerenciarAnimais(int opcao, Atendente atendente) {
		switch (opcao) {

		case 1 -> {
			String especie = atendente.especieAnimal();
			String raca = atendente.racaAnimal();
			int idade = atendente.idadeAnimal();
			double peso = atendente.pesoAnimal();

			AnimalEstimacao animal = new AnimalEstimacao(especie, raca, idade, peso);
			listaAnimais.add(animal);
		}

		case 2 -> {
			if (listaAnimais == null || listaAnimais.isEmpty()) {
				atendente.mensagemListaVazia();
			} else {
				for (AnimalEstimacao animal : listaAnimais) {
					atendente.vizualizar(animal);
				}
			}
		}

		case 3 -> {
			String especie = atendente.perguntaAnimalRemover();
			boolean removido = false;

			for (int indice = 0; indice < listaAnimais.size(); indice++) {
				if (listaAnimais.get(indice).getEspecie().equalsIgnoreCase(especie)) {
					listaAnimais.remove(indice);
					removido = true;
					break;
				}
			}

			if (removido) {
				atendente.mensagemAnimalRemovido(especie);
			} else {
				atendente.mensagemNaoencontrado(especie);
			}
		}

		case 4 -> {
			String especieBusca = atendente.perguntaParaBuscar();
			AnimalEstimacao animalEncontrado = null;

			for (AnimalEstimacao animal : listaAnimais) {
				if (animal.getEspecie().equalsIgnoreCase(especieBusca)) {
					animalEncontrado = animal;
					break;
				}
			}
			
			if(animalEncontrado != null) {
				atendente.vizualizar(animalEncontrado);
			} else {
				atendente.mensagemNaoencontrado(especieBusca);
			}
		}

		case 5 -> {
			System.out.println("Saindo do sistema... Até logo!");
		}

		
		}
	}

}