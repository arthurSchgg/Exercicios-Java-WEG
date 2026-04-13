package model;

public class Notebook extends Dispositivo{
	
	private int tamPolegadas;
	
	public Notebook(String marca, int tamPolegadas) {
		super(marca);
		this.tamPolegadas = tamPolegadas;
	}
	
	@Override
	public String toString() {
		return "Notebook: " + nome + " - Tela: " + tamPolegadas + " polegadas";
	}

}
