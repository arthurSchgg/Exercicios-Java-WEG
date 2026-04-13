package main;

import java.util.ArrayList;
import java.util.List;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class Main {
	public static void main(String[] args) {
		List<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(new Veiculo("Veículo genérico"));
		veiculos.add(new Carro("Lancer", 4));
		veiculos.add(new Moto("KTM", true));
		
		for(Veiculo veiculo : veiculos) {
			System.out.println(veiculo);
		}
	}

}
