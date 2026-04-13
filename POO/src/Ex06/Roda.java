package Ex06;

public class Roda {

	private String modelo;
	private String marca;
	private int aro;

	public Roda() {
		this.modelo = "Volcano";
		this.marca = "Santa Monica";
		this.aro = 15;
	}

	public Roda(String modelo, String marca, int aro) {
		this.modelo = modelo;
		this.marca = marca;
		this.aro = aro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}
}
