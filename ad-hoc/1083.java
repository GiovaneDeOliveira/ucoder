import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     	Scanner in = new Scanner(System.in);
    	
     	while (in.hasNextLine()) {
     		
     	//numero total de participantes
    	String entrada = in.nextLine();
    	int num = Integer.parseInt(entrada);
    	
    	//nomes de cada participantes
    	entrada = in.nextLine();
    	String nomes[] = entrada.split(" ");
    	
    	//avançar
    	entrada = in.nextLine();
    	int avancar = Integer.parseInt(entrada);
    	
    	int rodadas = 0;
    	int posicao = 0;
    	int contador = 0;
    	posicao = avancar;
    	
	    	while (contador<(num-1)) {
	    		rodadas++;
	    		while (posicao > num-1) {
	    			posicao = posicao - num;
	    		}
	    		
	    		if (nomes[posicao].equals("")) {
	    			//nada acontece
	    		}
	    		else {
	    			nomes[posicao] = "";
	    			for (int i = 0; i<num; i++) {
	    			//	System.out.println(nomes[i]);
	    			}
	    			boolean continua = true;
	    			int controle = num;
	    			int posicao2 = posicao;
	    			while (controle >1) {
	    				if (posicao2 >= 1 && posicao2<=(num-1)) {
	    					nomes[posicao2] = nomes[posicao2-1];
	        				nomes[posicao2-1] = "";
	        				posicao2 = posicao2-1;
	    				}
	    				else if (posicao2 == 0) {
	    					nomes[posicao2] = nomes[num-1];
	        				nomes[num-1] = "";
	        				posicao2 = num-1;
	    				}
	    				controle--;
	    			}
	        	
	    		}
	    		contador = 0;
	    		for (int i = 0; i<num; i++) {
	    			//System.out.println(nomes[i]);
	    			if (nomes[i].equals("")) {
	    				contador++;
	    			}
	    		}
	    		//System.out.println("contador " + contador);
	    		
	    		posicao = posicao + avancar;
	    	}
    	
	    for (int i = 0; i<num; i++) {
	    	if (nomes[i].equals("")) {
	    		
	    	}
	    	else {
	    		System.out.println("apos " + rodadas + " rodadas quem levou a bolada foi " + nomes[i]);
	    	}
	    }
    	
     	}
    	    	
    }
 
}