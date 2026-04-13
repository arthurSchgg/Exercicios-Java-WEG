package main;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Cachorro;
import model.Gato;

public class Main {
	public static void main(String[] args) {
		List<Animal> pets = new ArrayList<>();
		pets.add(new Animal("Bicho Genérico"));
		pets.add(new Cachorro("Rex"));
		pets.add(new Gato("Mimi"));
		
		for(Animal pet: pets) {
			System.out.println(pet);
		}
		
	}

}
