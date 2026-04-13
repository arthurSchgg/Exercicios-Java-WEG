package br.com.appAnimal.model;

public class AnimalEstimacao {
	
	private String especie;
	private String raca;
	private int idade;
	private double peso;
	
	public AnimalEstimacao () {
		
		this.especie = "";
		this.raca = "";
		this.idade = 0;
		this.peso = 0.0;
		
	}
	
	public AnimalEstimacao (String especie, String raca, int idade, double peso) {
		
		this.especie = especie;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
		
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
