package Ex07;

public class Animal {

	private String nome;
	private String raca;
	private double idade;

	public Animal() {
		this.nome = "Sargento Bigode";
		this.raca = "Gato Siamês";
		this.idade = 14;
	}

	public Animal(String nome, String raca, Double idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}
}
