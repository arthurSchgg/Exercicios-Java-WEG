package br.com.appCasa;

import br.com.appCasa.service.Estoque;
import br.com.appCasa.view.Atendente;

public class Main {
	public static void main(String[] args) {
		
		Atendente atendente = new Atendente();
		Estoque estoque = new Estoque();
		int escolhaMenu;
		
		do {
			escolhaMenu = atendente.menuPrincipal();
			estoque.gerenciarCasas(escolhaMenu, atendente);
		} while (escolhaMenu != 5);
	}
}
