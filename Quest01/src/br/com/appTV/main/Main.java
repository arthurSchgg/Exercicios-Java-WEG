package br.com.appTV.main;

import br.com.appTV.service.Estoque;
import br.com.appTV.view.Atendente;

public class Main {
	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int escolhaMenu = 1;

		do {
			escolhaMenu = atendente.menuPrincipal();
			estoque.GerenciarEstoque(escolhaMenu, atendente);
		} while (escolhaMenu != 5);

		atendente.finalizarApp();
	}

}
