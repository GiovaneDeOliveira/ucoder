import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in);
		String entrada = in.nextLine();
		int testes = Integer.parseInt(entrada);
		
		for (int t = 1; t<=testes; t++) {
			entrada = in.nextLine();
			String dados[] = entrada.split(" ");
			int meses = Integer.parseInt(dados[1]);
			int produtos = Integer.parseInt(dados[0]);
			
			int[][] qtdxm = new int [meses][produtos];
			
			for (int i = 0; i<meses;i++) {
				entrada = in.nextLine();
				dados = entrada.split(" ");
				for (int j = 0; j<produtos; j++) {
					qtdxm[i][j] = Integer.parseInt(dados[j]);
				}
			}
			
			int[][] prodCP = new int [produtos][2];
			for (int i = 0; i<produtos;i++) {
				entrada = in.nextLine();
				dados = entrada.split(" ");
				for (int j = 0; j<2; j++) {
					prodCP[i][j] = Integer.parseInt(dados[j]);
				}
			}
			
			int[][] resultado = new int [meses][2];
			for (int i = 0; i<meses;i++) {
				for (int j = 0; j<2; j++) {
					for (int k = 0; k<produtos; k++) {
						if (j == 0) {
							resultado[i][j] += qtdxm[i][k] * prodCP[k][j];
						}
						else {
							resultado[i][j] += qtdxm[i][k] * prodCP[k][j];
						}
					}				
				}
			}
			
			System.out.println("Case " + t + ":");
			for (int i = 0; i<meses;i++) {
				for (int j = 0; j<2; j++) {
						if (j==0) {
							System.out.print(resultado[i][j] + " ");
						}
						else {
							System.out.println(resultado[i][j]);
						}
						
						
					}				
				
				}
			}
		
		
		
}
}