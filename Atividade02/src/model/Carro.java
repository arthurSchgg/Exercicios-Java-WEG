package model;

public class Carro extends Veiculo{
	
	private int numDePortas;

	public Carro(String marca, int numDePortas) {
		super(marca);
		this.numDePortas = numDePortas;
	}
	
	@Override
	public String toString() {
		return "Carro: " + marca + " tem " + numDePortas + " portas";
	}
}
