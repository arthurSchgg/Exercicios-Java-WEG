package main;

import java.util.ArrayList;
import java.util.List;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		contas.add(new Conta("1212321"));
		contas.add(new ContaCorrente("2132322", 12000.0));
		contas.add(new ContaPoupanca("5322132", 5));
		
		for(Conta conta: contas) {
			System.out.println(conta);
		}
	}

}
