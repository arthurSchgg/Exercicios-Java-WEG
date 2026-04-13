package br.com.appCasa.model;

public class Casa {
	
	private String endereco;
	private double area;
	private int numerosQuartos;
	private double preco;
	
	public Casa () {
		
		this.endereco = "";
		this.area = 0.0;
		this.numerosQuartos = 0;
		this.preco = 0.0;
		
	}
	
	public Casa (String endereco, double area, int numerosQuartos, double preco) {
		
		this.endereco = endereco;
		this.area = area;
		this.numerosQuartos = numerosQuartos;
		this.preco = preco;
		
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getNumerosQuartos() {
		return numerosQuartos;
	}

	public void setNumerosQuartos(int numerosQuartos) {
		this.numerosQuartos = numerosQuartos;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
