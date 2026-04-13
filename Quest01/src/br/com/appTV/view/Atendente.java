package br.com.appTV.view;

import java.util.List;
import java.util.Scanner;

import br.com.appTV.model.TV;

public class Atendente {
	Scanner sc;

	public Atendente() {
		sc = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("|     Bem vindo a Loja Modo Avião     |");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("| [1] Cadastrar uma TV                |");
		System.out.println("| [2] Lista das TVs                   |");
		System.out.println("| [3] Remover uma TV                  |");
		System.out.println("| [4] Buscar uma TV                   |");
		System.out.println("| [5] Sair                            |");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.print("Escolha uma opção: ");
		int escolha = sc.nextInt();
		sc.nextLine();
		return escolha;
	}

	public String marcaTV() {
		System.out.print("Escreva a marca da TV: ");
		return sc.nextLine();
	}

	public double tamanhoTV() {
		System.out.print("Digite o tamanho da TV: ");
		return sc.nextDouble();
	}

	public String resolucaoTV() {
		sc.nextLine(); 
		System.out.print("Escreva a resolução da TV: ");
		return sc.nextLine();
	} 

	public double precoTV() {
		System.out.print("Escreva o valor da TV: R$");
		return sc.nextDouble();
	}

	public void listarTvs(TV tv) {
		System.out.println("=-=-=-=-=-=-=-=-=");
		System.out.println("Marca: " + tv.getMarca());
		System.out.printf("Tamanho: %.2f\n", tv.getTamanho()); 
		System.out.println("Resolução: " + tv.getResolucao());
		System.out.printf("Preço: R$%.2f\n", tv.getPreco()); 
	}

	public String removerTV() {
		System.out.println("Escolha a marca da TV que você quer remover: ");
		return sc.nextLine();
	}

	public void vizualizarTVRemovido(String marca) {
		System.out.println("A marca '" + marca + "' foi removida.");
	}

	public String perguntaMarcaBuscar() {
		System.out.print("Digite a marca da TV que você deseja buscar: ");
		return sc.nextLine();
	}

	public TV buscarTelefone(List<TV> tvs, String marcaParaBuscar) {

		for (TV tv : tvs) {
			if (tv.getMarca().equalsIgnoreCase(marcaParaBuscar)) {
				return tv;
			}
		}

		return null;
	}

	public void mensagemNaoEncontrado() {
		System.out.println("TV não encontrado.");
	}

	public void finalizarApp() {
		System.out.println("Sistema encerrado.");
	}

}
