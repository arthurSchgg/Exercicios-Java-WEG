package main;

import java.util.Scanner;

import service.Estatisca;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estatisca estatisca = new Estatisca();

		System.out.println("+=================================================+");
		System.out.println("|============|| Análise Estatística ||============|");
		System.out.println("+=================================================+");
		System.out.println("");

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
			int num = sc.nextInt();
			estatisca.adicionarNumero(num);
		}
		System.out.println("+=================================================+");
		System.out.println("|=================|| Resultados ||================|");
		System.out.println("+=================================================+");
		System.out.println("");
		System.out.printf("A média é: %.2f\n" ,estatisca.calcularMedia());
		System.out.printf("A mediana é: %.2f\n" ,estatisca.calcularMediana());
		System.out.println("A moda é: " + estatisca.calcularModa());
		System.out.printf("O desvio padrão é: %.2f\n" ,estatisca.calcularDesvioPadrao());
		System.out.printf("A variância é: %.2f\n" ,estatisca.calcularVariancia());

	}

}
