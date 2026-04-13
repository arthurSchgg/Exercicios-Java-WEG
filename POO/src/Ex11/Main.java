package Ex11;

public class Main {
	public static void main(String[] args) {

		Produto produto = new Produto();

		produto.setNome("Aura Buds Pro");
		produto.setDescricao("Fones de ouvido sem fio com cancelamento de ruído.");
		produto.setQuantidadeEstoque(150);

		System.out.println("Nome do produto: " + produto.getNome());
		System.out.println("Descricao do produto: " + produto.getDescricao());
		System.out.println("Quantidade de estoque do produto: " + produto.getQuantidadeEstoque());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Produto produto1 = new Produto("Arroz Agulhinha (Pacote 5kg)", "Tipo 1, grãos selecionados, não precisa lavar",
				1200);

		produto1.setNome("Café \"Alvorada\"");
		produto1.setDescricao("Café gourmet 100% arábica, torra média.");
		produto1.setQuantidadeEstoque(450);

		System.out.println("Nome do produto: " + produto1.getNome());
		System.out.println("Descricao do produto: " + produto1.getDescricao());
		System.out.println("Quantidade de estoque do produto: " + produto1.getQuantidadeEstoque());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Produto produto2 = new Produto("Camiseta Básica Gola V (Branca, M)", "100% Algodão, Malha Penteada Fio 30.1",
				350);

		produto2.setNome("Caderno \"Infinito\"");
		produto2.setDescricao("Bloco de notas reutilizável (apaga com pano úmido).");
		produto2.setQuantidadeEstoque(85);

		System.out.println("Nome do produto: " + produto2.getNome());
		System.out.println("Descricao do produto: " + produto2.getDescricao());
		System.out.println("Quantidade de estoque do produto: " + produto2.getQuantidadeEstoque());

		System.out.println("=-=-=-=-=-=-=-=-=");

		Produto produto3 = new Produto("Fone de Ouvido Bluetooth TWS",
				"Fone sem fio, com cancelamento de ruído, case de recarga", 12);

		produto3.setNome("Garrafa Térmica \"Glacial\"");
		produto3.setDescricao("Mantém a bebida gelada por até 24 horas.");
		produto3.setQuantidadeEstoque(210);

		System.out.println("Nome do produto: " + produto3.getNome());
		System.out.println("Descricao do produto: " + produto3.getDescricao());
		System.out.println("Quantidade de estoque do produto: " + produto3.getQuantidadeEstoque());
	}

}
