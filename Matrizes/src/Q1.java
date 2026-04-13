public class Q1 {                                                            
   public static void main(String[] args) {          
    int[][] matriz = {                                          
      {1, 2, 3},                                                      
      {4, 5, 6}                                                       
    };                                                                                  
    int soma = 0;                                                     

 
    String separador = "+-------+-------+-------------+--------+";
    String cabecalho = "| i     | j     | mat[i][j]   | soma   |";

    System.out.println("--- Tabela de Rastreamento (Estilo 9) ---");
    System.out.println(separador);
    System.out.println(cabecalho);
    System.out.println(separador);
    

    System.out.printf("| %-5s | %-5s | %-11s | %-6d |\n", "-", "-", "-", soma);

    for (int i = 0; i < matriz.length; i++) {                          
      for (int j = 0; j < matriz[i].length; j++) {   
        
        soma += matriz[i][j];
        

        System.out.printf("| %-5d | %-5d | %-11d | %-6d |\n", i, j, matriz[i][j], soma);
      }                                                                  
    }

    System.out.println(separador);
    System.out.println("A soma total é = " + soma);
   }                                                                                
}