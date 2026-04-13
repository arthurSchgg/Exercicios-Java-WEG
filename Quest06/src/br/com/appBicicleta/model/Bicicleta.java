package br.com.appBicicleta.model;

public class Bicicleta {

	private String marca;
	private String modelo;
	private double tamanhoQuadro;
	private double preco;

	public Bicicleta() {
		this.marca = "";
		this.modelo = "";
		this.tamanhoQuadro = 0.0;
		this.preco = 0.0;
	}

	public Bicicleta(String marca, String modelo, double tamanhoQuadro, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanhoQuadro = tamanhoQuadro;
		this.preco = preco;
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

	public double getTamanhoQuadro() {
		return tamanhoQuadro;
	}

	public void setTamanhoQuadro(double tamanhoQuadro) {
		this.tamanhoQuadro = tamanhoQuadro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}