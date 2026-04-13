package main;

import java.util.ArrayList;
import java.util.List;

import model.Dispositivo;
import model.Notebook;
import model.Smartphone;

public class Main {
	public static void main(String[] args) {
		List<Dispositivo> dispositivos = new ArrayList<>();
		dispositivos.add(new Dispositivo("Dispositivo genérico"));
		dispositivos.add(new Smartphone("Iphone 14", "IOS"));
		dispositivos.add(new Notebook("Lenovo", 27));
		
		for(Dispositivo dispositivo: dispositivos) {
			System.out.println(dispositivo);
		}
		
	}

}
