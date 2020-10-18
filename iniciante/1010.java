import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in);
		String entrada = in.nextLine();
		int testes = Integer.parseInt(entrada);
		
		for (int t = 1; t<=testes; t++) {
			entrada = in.nextLine();
			int produtos = Integer.parseInt(entrada);
			int subtotal = 0;
			int dinheiro, troco;
			for (int i = 1; i<=produtos; i++) {
				entrada = in.nextLine();
				String dados [] = entrada.split(" ");
				int qtd = Integer.parseInt(dados[0]);
				int valor = Integer.parseInt(dados[1]);
				subtotal += qtd*valor;
			}
			entrada = in.nextLine();
			dinheiro = Integer.parseInt(entrada);
			troco = dinheiro - subtotal;
			if (troco <0) {
				System.out.println("DINHEIRO INSUFICIENTE");
			}
			else {
				System.out.println(troco);
			}
			}
		
		
		
}
}