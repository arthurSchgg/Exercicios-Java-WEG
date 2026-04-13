package main;

import Service.Estoque;
import View.Atendente;

public class Main {
	public static void main(String[] args) {
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int escolhaMenu;

		do {
			escolhaMenu = atendente.menuOpcao();
			estoque.gerenciarEstoque(escolhaMenu, atendente);
		} while (escolhaMenu != 0);

		atendente.fimPrograma();

	}

}
