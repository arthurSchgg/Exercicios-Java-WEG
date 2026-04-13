package model;

public class Moto extends Veiculo{
	
	private boolean temCarenagem;
	
	public Moto(String marca, boolean temCarenagem){
		super(marca);
		this.temCarenagem = temCarenagem;
	}
	
	@Override
	public String toString() {
		if(temCarenagem == true) {
			return "Moto: " + marca + " com Carenagem";
		} else {
			return "Moto: " + marca + " sem Carenagem";
		}
	}

}
