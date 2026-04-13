package br.com.appBicicleta.view;

import java.util.Scanner;
import br.com.appBicicleta.model.Bicicleta;

public class Atendente {
	Scanner sc;

	public Atendente() {
		sc = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("---------------------------------------");
		System.out.println("|==========|| VendaBikes ||===========|");
		System.out.println("|-------------------------------------|");
		System.out.println("| [1] Cadastrar bicicleta             |");
		System.out.println("| [2] Listar bicicletas               |");
		System.out.println("| [3] Remover bicicleta (pelo modelo) |");
		System.out.println("| [4] Buscar bicicleta (pelo modelo)  |");
		System.out.println("| [5] Sair                            |");
		System.out.println("|-------------------------------------|");
		System.out.print("Escolha uma opção: ");

		int opcao = sc.nextInt();
		sc.nextLine();
		return opcao;
	}

	public String marcaBicicleta() {
		System.out.print("Escreva a MARCA da bicicleta: ");
		return sc.nextLine();
	}

	public String modeloBicicleta() {
		System.out.print("Escreva o MODELO da bicicleta: ");
		return sc.nextLine();
	}

	public double tamanhoQuadroBicicleta() {
		System.out.print("Escreva o TAMANHO DO QUADRO: ");
		double tamanho = sc.nextDouble();
		sc.nextLine();
		return tamanho;
	}

	public double precoBicicleta() {
		System.out.print("Escreva o PREÇO: ");
		double preco = sc.nextDouble();
		sc.nextLine();
		return preco;
	}

	public void visualizar(Bicicleta bicicleta) {
		System.out.println("=-=-=-=-=-=-=-=-=-=");
		System.out.println("Marca: " + bicicleta.getMarca());
		System.out.println("Modelo: " + bicicleta.getModelo());
		System.out.println("Quadro: " + bicicleta.getTamanhoQuadro() + "\"");
		System.out.printf("Preço: R$ %.2f\n", bicicleta.getPreco());
		System.out.println("=-=-=-=-=-=-=-=-=-=\n");
	}

	public String perguntaBicicletaRemover() {
		System.out.print("Escreva o MODELO da bicicleta que deseja remover: ");
		return sc.nextLine();
	}

	public void mensagemBicicletaRemovida(String modelo) {
		System.out.println("A bicicleta modelo '" + modelo + "' foi removida!");
	}

	public String perguntaParaBuscar() {
		System.out.print("Escreva o MODELO da bicicleta que deseja buscar: ");
		return sc.nextLine();
	}

	public void mensagemNaoEncontrada(String modelo) {
		System.out.println("A bicicleta modelo '" + modelo + "' não foi encontrada.");
	}

	public void mensagemListaVazia() {
		System.out.println("Ainda não há bicicletas cadastradas.");
	}

	public void mensagemSucessoCadastro() {
		System.out.println("Bicicleta cadastrada com sucesso!");
	}
}