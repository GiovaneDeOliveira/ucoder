import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) throws IOException {

     	Scanner in = new Scanner(System.in);
     	
     	while (in.hasNextLine()) {
     		String entrada = in.nextLine();
     		String dados[] = entrada.split(" ");
     		int colunas = Integer.parseInt(dados[0]);
     		int linhas = Integer.parseInt(dados[1]);
     		
     		int obra [][] = new int [14][14];
     		
     		for (int i = 0; i<linhas; i++) {
     			entrada = in.nextLine();
     			dados = entrada.split(" ");
     			for (int j = 0; j<colunas; j++) {
     				obra[i][j] = Integer.parseInt(dados[j]);
     			}
     		}
     		int numObras = 0;
     		for (int i = 0; i<linhas; i++) {
     			for (int j = 0; j<colunas; j++) {
     				if (obra[i][j] == 1) {
     					obra[i][j] = 2;
     					numObras++;
     					existe(i, j, obra);
     					}
     		
     			}}
     		
     		System.out.println(numObras);
     	}
     	
     	
     	
     }

	private static void existe(int a, int b, int obra[][]) {
		int colunas = 14;
		int linhas = 14;
 		
 			if (a == 0 & b == 0) {
 					if (obra[a][b+1] == 1) {
 						obra[a][b+1] = 2;
 						existe (a, b+1, obra);
 					}
 					if (obra[a+1][b] == 1) {
 						 obra[a+1][b] = 2;
 						 existe (a+1, b, obra);
 					}
 				}
 						
 			//linha 0 e coluna >0 e menor que ultima posição
 			else if (a == 0 & b > 0 && b<colunas-1) {
 				if (obra[a][b+1] == 1) {
 					obra[a][b+1] = 2;
 					existe (a, b+1, obra);
 				}
 				if (obra[a+1][b] == 1) {
 					obra[a+1][b] = 2;
 					existe (a+1, b, obra);
 				}
 				if (obra[a][b-1] == 1) {
 					obra[a][b-1] = 2;
 					existe (a, b-1, obra);
 				}
 			}
 			
 			//linha 0 e coluna >0 e menor que ultima posição
 			else if (a == 0 & b == colunas-1) {
 				if (obra[a][b-1] == 1) {
 					obra[a][b-1] = 2;
 					existe (a, b-1, obra);
 				}
 				if (obra[a+1][b] == 1) {
 					obra[a+1][b] = 2;
 					existe (a+1, b, obra);
 				}
 			}
 			
 			//linha > 0 e coluna = 0
 			else if (a > 0 && a<linhas-1 && b == 0) {
 				if (obra[a-1][b] == 1) {
 					obra[a-1][b] = 2;
 					existe (a-1, b, obra);
 				}
 				if (obra[a][b+1] == 1) {
 					obra[a][b+1] = 2;
 					existe (a, b+1, obra);
 				}
 				if (obra[a+1][b] == 1) {
 					obra[a+1][b] = 2;
 					existe (a+1, b, obra);
 				}
 			}
 			
 			//linha > 0 e coluna > 0 e menor que num maximo
 			else if (a > 0 && a<linhas-1 && b > 0 && b<colunas-1) {
 				
 				if(obra[a][b-1] == 1) {
 					obra[a][b-1] = 2;
 					existe (a, b-1, obra);
 				}
 				if (obra[a][b+1] == 1) {
 					obra[a][b+1] = 2;
 					existe (a, b+1, obra);
 				}
 				if (obra[a-1][b] == 1) {
 					obra[a-1][b] = 2;
 					existe (a-1, b, obra);
 				}
 				if (obra [a+1][b] == 1) {
 					obra [a+1][b] = 2;
 					existe (a+1, b, obra);
 				}
 			}
 			
 			//linha > 0 e coluna = num máximo
 			else if (a > 0 && a<linhas-1 && b == colunas-1) {
 				if (obra[a-1][b] == 1) {
 					obra[a-1][b] = 2;
 					existe (a-1, b, obra);
 				}
 				if (obra[a+1][b] == 1) {
 					obra[a+1][b] = 2;
 					existe (a+1, b, obra);
 				}
 				if (obra[a][b-1] == 1) {
 					obra[a][b-1] = 2;
 					existe (a, b-1, obra);
 				}
 				
 			}
 			//linha = num maximo e coluna = 0
 			else if (a == linhas-1 && b == 0) {
 				if (obra[a-1][b] == 1) {
 					obra[a-1][b] = 2;
 					existe (a-1, b, obra);
 				}
 				if (obra[a][b+1] == 1) {
 					obra[a][b+1] = 2;
 					existe (a, b+1, obra);
 				}	
 			}
 			//linha = num maximo e coluna > 0 e <nummaximo
 			else if (a == linhas-1 && b > 0 && b<colunas-1) {
 				if (obra[a][b-1] == 1) {
 					obra[a][b-1] = 2;
 					existe (a, b-1, obra);
 				}
 				if (obra[a][b+1] == 1) {
 					obra[a][b+1] = 2;
 					existe (a, b+1, obra);
 				}
 				if (obra[a-1][b] == 1) {
 					obra[a-1][b] = 2;
 					existe (a-1, b, obra);
 				}
 			}
 			else if (a == linhas-1 && b == colunas-1) {
 				if (obra[a][b-1] == 1) {
 					obra[a][b-1] = 2;
 					existe (a, b-1, obra);
 				}
 				if (obra[a-1][b] == 1) {
 					obra[a-1][b] = 2;
 					existe (a-1, b, obra);
 				}
 			}
	}  
 }

/* */