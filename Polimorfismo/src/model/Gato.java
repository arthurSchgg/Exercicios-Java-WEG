package model;

public class Gato extends Animal{
	
	public Gato(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		return "Gato: " + nome + " Mia MIAU!";
	}
	
	public String toString2() {
		return "Gato: " + nome + " está arranhando os móveis.";
	}

}
