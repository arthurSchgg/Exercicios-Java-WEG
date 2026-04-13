package model;

public class Cachorro extends Animal{
	
	public Cachorro(String nome) {
		super(nome);
		
	}
	
	@Override
	public String toString() {
		return "Cachorro: " + nome + " late: AU AU!";
	}
	
	public String toString2() {
		return "Cachorro " + nome + " está abanando o rabo.";
	}
}