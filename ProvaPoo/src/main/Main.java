package main;

import service.principal.GerenciadorBiblioteca;
import view.FullView;

public class Main {
	public static void main(String[] args) {
		FullView atendente = new FullView();
		GerenciadorBiblioteca estoque = new GerenciadorBiblioteca();
		int opcaoMenu;
		
		do {
			opcaoMenu = atendente.menuPrincipal();
			estoque.gerenciarBiblioteca(opcaoMenu, atendente);
		} while(opcaoMenu != 0);
	}

}
