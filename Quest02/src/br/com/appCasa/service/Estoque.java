package br.com.appCasa.service;

import java.util.ArrayList;
import java.util.List;
import br.com.appCasa.model.Casa;
import br.com.appCasa.view.Atendente;

public class Estoque {
	private List<Casa> listaCasas;
	
	public Estoque() {
		listaCasas = new ArrayList<>();
	}
	
	public void gerenciarCasas(int opcao, Atendente atendente) {
		switch(opcao) {
		
		case 1 -> {
			String enderecoCasa = atendente.enderecoCasa();
			double areaCasa = atendente.areaCasa();
			int numerosQuartosCasa = atendente.numerosQuartosCasa();
			double precoCasa = atendente.precoCasa();
			
			Casa casa = new Casa(enderecoCasa, areaCasa, numerosQuartosCasa, precoCasa);
			listaCasas.add(casa);
		}
		
		case 2 -> {

			if(listaCasas.isEmpty()) {
				System.out.println("Nenhuma casa cadastrada");
			} else {
				for(Casa casa: listaCasas) {
					atendente.vizualizar(casa);
				}
			}
		}
		
		case 3 -> {
			String endereco = atendente.perguntaParaRemover();
			boolean removido = false;
			
			for (int indice = 0; indice < listaCasas.size(); indice++) {
				if (listaCasas.get(indice).getEndereco().equalsIgnoreCase(endereco)) {
					listaCasas.remove(indice);
					removido = true;
					break;
				}
			}

			if (removido) {
				atendente.mensagemCasaRemovida(endereco);
			} else {
				atendente.mensagemNaoEncontrada(endereco);
			}
			
		}
		
		case 4 -> {
			String buscar = atendente.perguntaParaBuscar();
			if(listaCasas.isEmpty()) {
				atendente.mensagemNaoEncontrada(buscar);
			} else {
				for(Casa casa: listaCasas) {
					atendente.vizualizar(casa);
				}
			}
			
		}
		}
	}

}
