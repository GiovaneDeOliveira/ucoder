import java.io.IOException;
import java.util.Scanner;
import java.text.ParseException;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
	public static void main(String[] args) throws IOException {
 
       
     	Scanner in = new Scanner(System.in);
     	int diaM = 1;
     	int mesM = 1;
     	String entrada = in.nextLine();
     	String dados[] = entrada.split(" ");
     	diaM = Integer.parseInt(dados[0]);
     	mesM = Integer.parseInt(dados[1]);
     	do {
     		
         	
         	//encerrar com diaM = 0; mesM = 0;
         	
         	entrada = in.nextLine();
         	int num = Integer.parseInt(entrada);
         	boolean encontrado = false;
         	for (int i = 0; i<num;i++) {
         		entrada = in.nextLine();
         		dados = entrada.split(" ");
         		if (Integer.parseInt(dados[0]) == diaM && Integer.parseInt(dados[1]) == mesM) {
         			encontrado = true;
         		}
         	}
         	if (encontrado) {
         		System.out.println("S");
         	}
         	else {
         		System.out.println("N");
         	}
     	
     	
     	entrada = in.nextLine();
     	dados = entrada.split(" ");
     	diaM = Integer.parseInt(dados[0]);
     	mesM = Integer.parseInt(dados[1]);
     	}
     	while(diaM != 0 && mesM != 0);
     	
     }
  
 }

/* */