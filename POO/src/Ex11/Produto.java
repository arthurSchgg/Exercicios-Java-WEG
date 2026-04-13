package Ex11;

public class Produto {

	private String nome;
	private String descricao;
	private int quantidadeEstoque;

	public Produto() {
		this.nome = "Smartphone X15 Pro";
		this.descricao = "Celular 256GB, câmera 108MP, tela 120Hz, cor grafite";
		this.quantidadeEstoque = 80;
	}

	public Produto(String nome, String descricao, int quantidadeEstoque) {
		this.nome = nome;
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
}
