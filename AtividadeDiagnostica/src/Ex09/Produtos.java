package Ex09;

public class Produtos {

	private String nome;
	private double preco;
	private int quantidadeEstoque;

	public Produtos() {

		this.nome = "Motor Elétrico";
		this.preco = 2650.80;
		this.quantidadeEstoque = 100;
	}

	public Produtos(String nome, Double preco, int quantidadeEstoque) {

		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public void Estoque() {
		if (quantidadeEstoque > 1) {
			System.out.println("Estoque de produtos da WEG atualizado com sucesso!");
		} else {
			System.out.println("Estoque não atualizado");
		}

	}
}
