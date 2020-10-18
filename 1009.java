import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String entrada;
		String dados[];
		int[][] matriz = new int [4][4];
		
		while (in.hasNextLine()) {
			entrada = in.nextLine();
			int testeN = Integer.parseInt(entrada);
			for (int i = 0; i<4;i++) {
				entrada = in.nextLine();
				dados = entrada.split(" ");
				for (int j = 0; j<4; j++) {
					matriz[i][j] = Integer.parseInt(dados[j]);
				}
			}
			
			int linhaComMais = 0;
			int linhaComMenos = 0;
			int colunaComMais = 0;
			int colunaComMenos = 0;
			int somaLinha;
			int somaColuna;
			for (int i = 0; i<4;i++) {
				somaLinha = 0;
				somaColuna = 0;
				for (int j = 0; j<4; j++) {
					somaLinha += matriz[i][j];
					somaColuna += matriz[j][i];
					if (j == 3) {
						if (somaLinha == 3) {
							linhaComMais = i+1;
						}
						if (somaLinha == 1) {
							linhaComMenos = i+1;
						}
						if (somaColuna == 3) {
							colunaComMais = i+1;
						}
						if (somaColuna == 1) {
							colunaComMenos = i+1;
						}
					}
					
				}
			}
			
			if (linhaComMais != 0) {
				System.out.println("Caso "+ testeN + ": MOVER CANGURU DE ("+linhaComMais+","+colunaComMais+") PARA ("+
			linhaComMenos+","+colunaComMenos+")");
			} else {
				System.out.println("Caso "+testeN+": CORRETO");
			}
		}
		
}
}