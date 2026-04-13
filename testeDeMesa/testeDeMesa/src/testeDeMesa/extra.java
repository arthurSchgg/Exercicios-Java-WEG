package testeDeMesa;

import java.util.Scanner;

public class extra {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Digite um número: ");
		int num = leia.nextInt();
		
		num = num * 2 - 1;
		
		if ( num %2 == 0) {
			System.out.println(" É par");							
		} else {
			System.out.println(" É impar");
		}
						
		leia.close();
	}

}
 