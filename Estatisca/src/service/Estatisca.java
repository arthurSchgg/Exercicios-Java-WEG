package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Estatisca {

	private List<Integer> listaNumeros;

	public Estatisca() {
		this.listaNumeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		this.listaNumeros.add(numero);
	}

	public List<Integer> getNumeros() {
		return new ArrayList<>(listaNumeros);
	}

	public double calcularMedia() {
		if (listaNumeros.isEmpty()) {
			return 0.0;
		}

		double soma = 0.0;

		for (Integer numeros : listaNumeros) {
			soma = soma + numeros;
		}

		return soma / listaNumeros.size();

	}

	public double calcularMediana() {
		if (listaNumeros.isEmpty()) {
			return 0.0;
		}

		List<Integer> ordenada = new ArrayList<>(listaNumeros);
		Collections.sort(listaNumeros);

		int tamanho = ordenada.size();
		int meio = tamanho / 2;

		if (tamanho % 2 == 1) {
			return ordenada.get(meio);
		} else {
			return (ordenada.get(meio - 1) + ordenada.get(meio)) / 2.0;
		}
	}

	public List<Integer> calcularModa() {
	    Map<Integer, Integer> modas = new HashMap<>();

	    for(Integer numero : listaNumeros) {
	        int contagemAtual = modas.getOrDefault(numero, 0) + 1;
	        modas.put(numero, contagemAtual);
	    }

	    int maisRepetido = 0;
	    for(Integer contagem : modas.values()) {
	        if(contagem > maisRepetido) {
	            maisRepetido = contagem;
	        }
	    }

	    List<Integer> numerosMaisRepetidos = new ArrayList<>();

	    if (maisRepetido > 1) { 
	        for(Map.Entry<Integer, Integer> linha : modas.entrySet()) {
	            if(linha.getValue() == maisRepetido) {
	                numerosMaisRepetidos.add(linha.getKey());
	            }
	        }
	    }
	    
	    return numerosMaisRepetidos;
	}

	public double calcularVariancia() {
		if (listaNumeros.isEmpty()) {
			return 0.0;
		}

		double media = calcularMedia();
		double somaDiferenca = 0.0;

		for (Integer num : listaNumeros) {
			somaDiferenca += Math.pow(num - media, 2);
		}

		return somaDiferenca / listaNumeros.size();
	}

	public double calcularDesvioPadrao() {
		return Math.sqrt(calcularVariancia());
	}

}
