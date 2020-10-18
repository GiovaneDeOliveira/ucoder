import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     	Scanner in = new Scanner(System.in);
    	
    	String entrada = in.nextLine();
    	int num = Integer.parseInt(entrada);
    	
    	for (int i = 0; i<num; i++) {
    		int matriz = in.nextInt();
    		int total = matriz * matriz;
    		int zeros = total;
    		zeros -= matriz;
    		zeros -= ((matriz-1)*2);
    		if (zeros > (total/2)) {
    			System.out.println("S " + zeros);
    		}
    		else {
    			System.out.println("N " + zeros);
    		}
    	}
    	
    	
    }
 
}