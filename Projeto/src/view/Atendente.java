package view;

import java.util.Scanner;
import model.Fruta;
import model.Verdura;

public class Atendente {
	Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("+==============================================+");
		System.out.println("|===========|| Frutaria do Seu Zé ||===========|");
		System.out.println("+==============================================+");
		System.out.println("|[1] Cadastrar fruta                           |");
		System.out.println("|[2] Cadastrar verdura                         |");
		System.out.println("|[3] Listar frutas                             |");
		System.out.println("|[4] Listar verduras                           |");
		System.out.println("|[5] Pesquisar fruta                           |");
		System.out.println("|[6] Pesquisar verdura                         |");
		System.out.println("|[7] Remover fruta                             |");
		System.out.println("|[8] Remover verdura                           |");
		System.out.println("|[9] Verificar total de frutas                 |");
		System.out.println("|[10] Verificar todal de verduras              |");
		System.out.println("|[0] Sair                                      |");
		System.out.println("+==============================================+");
		System.out.print("Escolha uma opção: ");
		int opcao = input.nextInt();
		input.nextLine();
		return opcao;
	}

	public String frutaNome() {
		System.out.print("Digite o nome da fruta: ");
		return input.nextLine();
	}

	public double frutaPreco() {
		System.out.print("Digite o preço da fruta: ");
		return input.nextDouble();
	}

	public int frutaQuantidade() {
		System.out.print("Digite a quantidade: ");
		return input.nextInt();
	}

	public double frutaPeso() {
		System.out.print("Digite o peso da fruta: KG ");
		return input.nextDouble();
	}

	public String verduraNome() {
		System.out.print("Digite o nome da verdura: ");
		return input.nextLine();
	}

	public double verduraPreco() {
		System.out.print("Digite o preço da verdura: R$");
		return input.nextDouble();
	}

	public int verduraQuantidade() {
		System.out.print("Digite a quantidade de verduras: ");
		return input.nextInt();
	}

	public String verduraTipo() {
		input.nextLine();
		System.out.print("Digite o tipo da verdura: ");
		return input.nextLine();
	}

	public void visualizarFruta(Fruta fruta) {
		System.out.println("+==============================================+");
		System.out.println("Nome: " + fruta.getNome());
		System.out.printf("Preço: R$ %.2f", fruta.getPreco());
		System.out.println("\nQuantidade: " + fruta.getQuantidade());
		System.out.printf("Peso: KG %.2f", fruta.getPeso());
		System.out.println("\nCódigo da fruta: " + fruta.getCodigo());
		System.out.println("+==============================================+\n");
	}

	public void visualizarVerdura(Verdura verdura) {
		System.out.println("+==============================================+");
		System.out.println("Nome: " + verdura.getNome());
		System.out.printf("Preço: R$  %.2f", verdura.getPreco());
		System.out.println("\nQuantidade: " + verdura.getQuantidade());
		System.out.println("Tipo: " + verdura.getTipo());
		System.out.println("Código da verdura: " + verdura.getCodigo());
		System.out.println("+==============================================+\n");
	}

	public String removerFruta() {
		System.out.print("Digite o nome da fruta a remover: ");
		return input.nextLine();
	}

	public void visualizarFrutaRemovidada(String nome) {
		System.out.println("A fruta '" + nome + "' foi removida.");
	}

	public String removerVerdura() {
		System.out.print("Digite o nome da verdura a remover: ");
		return input.nextLine();
	}

	public void vizualizarVerduraRemovidada(String nome) {
		System.out.println("A verdura '" + nome + "' foi removida.");
	}

	public void mensagemNaoEncontrado() {
		System.out.println("Fruta não encontrada.");
	}
	
	public String perguntaParaBuscarFruta() {
		System.out.print("Escreva o nome de uma fruta para buscar: ");
		return input.nextLine();
	}
	
	public String perguntaParaBuscarVerdura() {
		System.out.print("Escreva o nome de uma verdura para buscar: ");
		return input.nextLine();
	}

	public void finalizarApp() {
		System.out.println("Sistema encerrado...");
	}
	
	public void erro() {
		System.out.println("Opção incorreta...");
	}
}
