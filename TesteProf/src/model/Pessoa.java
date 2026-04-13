package model;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double peso;
	
	public Pessoa(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		
	}
	
	@Override
	
	public String toString() {
		return nome + " tem " + idade + " anos e " + peso + " KG";
	}
	

}
