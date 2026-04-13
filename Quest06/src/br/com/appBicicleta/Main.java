package br.com.appBicicleta;

import br.com.appBicicleta.service.Estoque;
import br.com.appBicicleta.view.Atendente;

public class Main {
	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int escolhaMenu;

		do {
			escolhaMenu = atendente.menuPrincipal();
			estoque.gerenciarEstoque(escolhaMenu, atendente);
		} while (escolhaMenu != 5);
	}

}
