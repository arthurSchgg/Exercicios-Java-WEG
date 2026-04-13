package Ex02;

public class Main {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setMarca("BYD");
		carro.setModelo("Dolphin");
		carro.setAno(2025);
		
		System.out.println("Marca: " + carro.getMarca());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano: " + carro.getAno());
		
		System.out.println("=-=-=-=-=-=-=-=-=");

		
		Carro carro1 = new Carro("Mitsubishi", "Eclipse", 2025);
		
		carro1.setMarca("Mitsubishi");
		carro1.setModelo("Eclipse");
		carro1.setAno(2005);
		
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Ano: " + carro1.getAno());
		
		System.out.println("=-=-=-=-=-=-=-=-=");
		
		Carro carro2 = new Carro("Honda", "Civic", 2010);
		
		carro2.setMarca("Honda");
		carro2.setModelo("Civic");
		carro2.setAno(2000);

		
		System.out.println("Marca: " + carro2.getMarca());
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Ano: " + carro2.getAno());
		
	}

}
