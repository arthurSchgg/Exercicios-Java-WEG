import java.util.Random;

public class SimuladorDados {
	public static void main(String[] args) {
		Random random =  new Random();
		
		int rodadas = 90000000;
		
		int somaSete = 0;
		int somaMaiorQueNove = 0;
		int dadosIguais = 0;
		
		System.out.println("+=============================================+");
		System.out.println("|============|| Simulação Dados ||============|");
		System.out.println("+=============================================+\n");
		
		for(int i = 0; i < rodadas; i++) {
			int dado1 = random.nextInt(6) + 1;
			int dado2 = random.nextInt(6) + 1;
			int soma = dado1 + dado2;
			
			if(soma == 7) {
				somaSete++;
			} 
			if(soma > 9) {
				somaMaiorQueNove++;
			}
			
			if(dado1 == dado2) {
				dadosIguais++;
			}
		}
		
		System.out.println("Total de lançamentos: " + rodadas);
		
		System.out.println("+================================================+");
        
        System.out.printf("| Soma 7: %.2f%%                                 |%n", (somaSete * 100.0) / rodadas);
            
        System.out.printf("| Soma > 9: %.2f%%                               |%n", (somaMaiorQueNove * 100.0) / rodadas);
            
        System.out.printf("| Dados Iguais: %.2f%%                           |%n", (dadosIguais * 100.0) / rodadas);
        
		System.out.println("+================================================+");
		
	}

}
