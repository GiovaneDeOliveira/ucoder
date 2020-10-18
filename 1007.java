import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		float euler = 0;
		int fatorial = 0;
		while (num != -1) {
			euler = 0;
			for (int i = 0; i<=num;i++) {
				if (i == 0) {
					fatorial = 1;
				}
				else {
					fatorial = fatorial * i;
				}
				
				euler = euler + (float) 1/fatorial;
			}
			System.out.printf("%.6f\n", euler);
			num = in.nextInt();
		}
}
}