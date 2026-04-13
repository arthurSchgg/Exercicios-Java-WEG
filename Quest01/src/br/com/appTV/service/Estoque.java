package br.com.appTV.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appTV.model.TV;
import br.com.appTV.view.Atendente;

public class Estoque {
	List<TV> listaTvs;

	public Estoque() {
		listaTvs = new ArrayList<>();
	}

	public void GerenciarEstoque(int escolha, Atendente atendente) {
		switch (escolha) {
		case 1 -> {
			String marca = atendente.marcaTV();
			double tamanho = atendente.tamanhoTV();
			String resolucao = atendente.resolucaoTV();
			double preco = atendente.precoTV();
			TV tv = new TV(marca, tamanho, resolucao, preco);
			listaTvs.add(tv);
			System.out.println("TV cadastrada com sucesso!!");
		}
		
		case 2 -> {
			if(listaTvs.isEmpty()) {
				System.out.println("Nenhuma TV encontrada");
			} else {
				for(TV tv : listaTvs){
					atendente.listarTvs(tv);
				}
			}
		}
		case 3 -> {
			String marcaRemover = atendente.marcaTV();
			boolean removida = listaTvs.removeIf(tv -> tv.getMarca().equalsIgnoreCase(marcaRemover));
			if (removida) {
				System.out.println("TV removida com sucesso!");
			} else {
				System.out.println("Nenhuma TV encontrada com a marca: " + marcaRemover);
			}
		}

		case 4 -> {
			
				String marcaBuscada = atendente.marcaTV();
				boolean encontrada = false;
				for (TV tv : listaTvs) {
					if (tv.getMarca().equalsIgnoreCase(marcaBuscada)) {
						atendente.buscarTelefone(listaTvs, marcaBuscada);
						encontrada = true;
					}
				}
				if (!encontrada) {
					System.out.println("Nenhuma TV encontrada com a marca: " + marcaBuscada);
				}
			}
		}
		}
	}