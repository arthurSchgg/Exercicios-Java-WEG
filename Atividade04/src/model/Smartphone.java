package model;

public class Smartphone extends Dispositivo{
	
	private String sistemaOperacional;

	public Smartphone(String nome, String sistemaOperacional) {
		super(nome);
		this.sistemaOperacional = sistemaOperacional;
	}
	
	@Override
	public String toString() {
		return "Smartphone: " + nome + " - SO: " + sistemaOperacional;
	}
}
