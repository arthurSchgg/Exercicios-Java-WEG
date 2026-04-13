package br.com.appTelefone;

import br.com.appTelefone.service.Estoque;
import br.com.appTelefone.view.Atendente;

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
