package br.com.appTelefone.view;

import java.util.List;
import java.util.Scanner;

import br.com.appTelefone.model.Telefone;

public class Atendente {
	Scanner sc;

	public Atendente() {
		sc = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("|     Bem vindo a Loja Modo Avião     |");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("| [1] Cadastrar um Celular            |");
		System.out.println("| [2] Lista dos Celulares             |");
		System.out.println("| [3] Remover um Celular              |");
		System.out.println("| [4] Buscar um Celular               |");
		System.out.println("| [5] Sair                            |");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.print("Escolha uma opção: ");
		int escolha = sc.nextInt();
		sc.nextLine();
		return escolha;
	}

	public String marcaTelefone() {
		System.out.print("Escreva a marca do telefone: ");
		return sc.nextLine();
	}

	public String modeloTelefone() {
		System.out.print("Escreva o modelo do telefone: ");
		return sc.nextLine();
	}

	public double precoTelefone() {
		System.out.print("Digite o valor do telefone: R$");
		return sc.nextDouble();
	}

	public double memoriaTelefone() {
		System.out.print("Digite o tamanho da memoria do celular (GB): ");
		return sc.nextDouble();
	}

	public void listarTelefones(Telefone telefone) {
		System.out.println("=-=-=-=-=-=-=-=-=");
		System.out.println("Marca: " + telefone.getMarca());
		System.out.println("Modelo: " + telefone.getModelo());
		System.out.printf("Preco: R$%.2f", telefone.getPreco());
		System.out.printf("Memoria: %.2f GB", telefone.getMemoria());
	}

	public String removerTelefones() {
		System.out.print("Digite o modelo do telefone que você deseja remover: ");
		return sc.nextLine();
	}

	public void vizualizarTelefoneRemovidado(String modelo) {
		System.out.println("O modelo '" + modelo + "' foi removida.");
	}

	public String perguntarModeloBuscar() {
		System.out.print("Digite o modelo do telefone que você deseja buscar: ");
		return sc.nextLine();
	}

	public Telefone buscarTelefone(List<Telefone> telefones, String modeloParaBuscar) {

		for (Telefone telefone : telefones) {
			if (telefone.getModelo().equalsIgnoreCase(modeloParaBuscar)) {
				return telefone;
			}
		}

		return null;
	}

	public void mensagemNaoEncontrado() {
		System.out.println("Telefone não encontrado.");
	}

	public void finalizarApp() {
		System.out.println("Sistema encerrado.");
	}

}
