package br.com.appAnimal;

import br.com.appAnimal.service.Estoque;
import br.com.appAnimal.view.Atendente;

public class Main {
	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int escolhaMenu;

		do {
			escolhaMenu = atendente.menuPrincipal();
			estoque.gerenciarAnimais(escolhaMenu, atendente);
		} while (escolhaMenu != 5);
	}

}
