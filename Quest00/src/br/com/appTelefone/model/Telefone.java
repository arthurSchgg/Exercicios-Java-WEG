package br.com.appTelefone.model;

public class Telefone {
	
	private String marca;
	private String modelo;
	private double preco;
	private double memoria;
	
	public Telefone () {
		this.marca = "";
		this.modelo = "";
		this.preco = 0.0;
		this.memoria = 0.0;
	}
	
	public Telefone (String marca, String modelo, Double preco, Double memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.memoria = memoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
}
