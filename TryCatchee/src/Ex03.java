import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomeProduto;
		double preco = 0;
		boolean precoInvalido = true;
		
		System.out.print("Informe o nome do produto: ");
		nomeProduto = sc.nextLine();
		
		while(precoInvalido) {
			System.out.print("Informe o preço do produto: R$ ");
			String texto =  sc.nextLine();
			
			try {
				preco = Double.parseDouble(texto);
				precoInvalido = false;
			} catch (NumberFormatException erro) {
				System.out.println("Valor inválido! Use apenas números Ex: 10.00");
			}
		}
		
		System.out.println("Produto cadastrado:");
		System.out.println("+=====================+");
		System.out.println("Nome: " + nomeProduto);
		System.out.println("Preço: R$ " + preco);
	}
}
