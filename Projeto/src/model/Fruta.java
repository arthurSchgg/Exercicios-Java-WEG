package model;

public class Fruta extends Produto{
	
	private double peso;
	private final int codigo;
	private static int codigoFruta;
	
	public Fruta() {
		
		super();
		this.peso = 0.0;
		this.codigo = codigoFruta++;
		
	}
	
	public Fruta(String nome, double preco, int quantidade, double peso) {
		super(nome, preco, quantidade);
		this.peso = peso;
		this.codigo = codigoFruta++;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}