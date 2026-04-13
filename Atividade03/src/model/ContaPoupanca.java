package model;

public class ContaPoupanca extends Conta{
	
	private int taxaJuros;

	public ContaPoupanca(String numero, int taxaJuros) {
		super(numero);
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public String toString() {
		return "Conta poupança número: " + numero + " - Juros: " + taxaJuros + "%";
	}
}
