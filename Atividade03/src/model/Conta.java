package model;

public class Conta {
	
	protected String numero;
	
	public Conta(String numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Conta número: " + numero;
	}

}
