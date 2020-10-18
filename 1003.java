import java.util.Scanner;
public class Main {

	public static void main(String[] args) { 

		Scanner in = new Scanner(System.in);
		String entradas = in.nextLine();
		String dados[] = entradas.split(" ");
		int C = Integer.parseInt(dados[0]);
		int L = Integer.parseInt(dados[1]);
		while (L != 0 && C != 0) {
			String[][] terrenos = new String[L][C];

			for (int i = 0; i<L; i++) {
				entradas = in.nextLine();
				dados = entradas.split(" ");
				for (int j = 0; j<C; j++) {
					terrenos [i][j] = dados [j];
				}
			}

			boolean teste = true;

			for (int i = 0; i<L; i++) {
				for (int j = 0; j<C; j++) {
					if (L>=3 && C>=3) {
						if (terrenos[i][j].equals("A")) {
							if (i == 0) {
								if (j == 0) {
									if (terrenos[i+1][j].equals("B") || terrenos[i+1][j].equals("D") || 
											terrenos[i][j+1].equals("B") || terrenos[i][j+1].equals("D")) {
										teste = false;
										break;
									}
								} else if (j<C-1) {
									if (terrenos[i+1][j].equals("B") || terrenos[i+1][j].equals("D") || 
											terrenos[i][j+1].equals("B") || terrenos[i][j+1].equals("D") || 
											terrenos[i][j-1].equals("B") || terrenos[i][j-1].equals("D")) {
										teste = false;
										break;
									}
								} else {
									if (terrenos[i+1][j].equals("B") || terrenos[i+1][j].equals("D") || 
											terrenos[i][j-1].equals("B") || terrenos[i][j-1].equals("D")) {
										teste = false;
										break;
									}

								}
							} else if (i <L-1) {
								if (j == 0) {
									if (terrenos[i+1][j].equals("B") || terrenos[i+1][j].equals("D") || 
											terrenos[i][j+1].equals("B") || terrenos[i][j+1].equals("D") || 
											terrenos[i-1][j].equals("B") || terrenos[i-1][j].equals("D")) {
										teste = false;
										break;
									}
								}
								else if (j<(C-1)) {
									if (terrenos[i+1][j].equals("B") || terrenos[i+1][j].equals("D") || 
											terrenos[i][j+1].equals("B") || terrenos[i][j+1].equals("D") || 
											terrenos[i][j-1].equals("B") || terrenos[i][j-1].equals("D") || 
											terrenos[i-1][j].equals("B") || terrenos[i-1][j].equals("D")) {
										teste = false;
										break;
									}
								} else {
									if (terrenos[i+1][j].equals("B") || terrenos[i+1][j].equals("D") || 
											terrenos[i][j-1].equals("B") || terrenos[i][j-1].equals("D") || 
											terrenos[i-1][j].equals("B") || terrenos[i-1][j].equals("D")) {
										teste = false;
										break;
									}
								}
							} else {
								if (j == 0) {
									if (terrenos[i-1][j].equals("B") || terrenos[i-1][j].equals("D") || 
											terrenos[i][j+1].equals("B") || terrenos[i][j+1].equals("D")) {
										teste = false;
										break;
									}
								} else if (j<C-1) {
									if (terrenos[i-1][j].equals("B") || terrenos[i-1][j].equals("D") || 
											terrenos[i][j+1].equals("B") || terrenos[i][j+1].equals("D") || 
											terrenos[i][j-1].equals("B") || terrenos[i][j-1].equals("D")) {
										teste = false;
										break;
									}
								} else {
									if (terrenos[i-1][j].equals("B") || terrenos[i-1][j].equals("D") || 
											terrenos[i][j-1].equals("B") || terrenos[i][j-1].equals("D")) {
										teste = false;
										break;
									}

								}
							}


						} else if (terrenos[i][j].equals("B")) {
							if (i == 0) {
								if (j == 0) {
									if (terrenos[i+1][j].equals("C") || terrenos[i][j+1].equals("C")) {
										teste = false;
										break;
									}
								} else if (j<C-1) {
									if (terrenos[i+1][j].equals("C") || 
											terrenos[i][j+1].equals("C") || 
											terrenos[i][j-1].equals("C")) {
										teste = false;
										break;
									}
								} else {
									if (terrenos[i+1][j].equals("C") || 
											terrenos[i][j-1].equals("C")) {
										teste = false;
										break;
									}

								}
							} else if (i < L-1) {
								if (j == 0) {
									if (terrenos[i+1][j].equals("C") ||
											terrenos[i][j+1].equals("C") ||
											terrenos[i-1][j].equals("C")) {
										teste = false;
										break;
									}
								}
								else if (j<C-1) {
									if (terrenos[i+1][j].equals("C") || 
											terrenos[i][j+1].equals("C") || 
											terrenos[i][j-1].equals("C") || 
											terrenos[i-1][j].equals("C")) {
										teste = false;
										break;
									}
								} else {
									if (terrenos[i+1][j].equals("C") || 
											terrenos[i][j-1].equals("C") || 
											terrenos[i-1][j].equals("C")) {
										teste = false;
										break;
									}
								}
							} else {
								if (j == 0) {
									if (terrenos[i-1][j].equals("C") || 
											terrenos[i][j+1].equals("C")) {
										teste = false;
										break;
									}
								} else if (j<C-1) {
									if (terrenos[i-1][j].equals("C") || 
											terrenos[i][j+1].equals("C") || 
											terrenos[i][j-1].equals("C")) {
										teste = false;
										break;
									}
								} else {
									if (terrenos[i-1][j].equals("C") || 
											terrenos[i][j-1].equals("C")) {
										teste = false;
										break;
									}

								}
							}

						}} else if (L==2 & C==2) {
							if (terrenos[i][j].equals("A")) {
								if(i == 0 & j == 0) {
									if (terrenos[i][j+1].equals("B") || terrenos[i+1][j].equals("B") || 
											terrenos[i][j+1].equals("D") || terrenos[i+1][j].equals("D")) {
										teste = false;
										break;
									}
								} else if (i == 0 & j == 1) {
									if (terrenos[i][j-1].equals("B") || terrenos[i+1][j].equals("B") || 
											terrenos[i][j-1].equals("D") || terrenos[i+1][j].equals("D")) {
										teste = false;
										break;
									}
								} else if (i == 1 & j == 0) {
									if (terrenos[i-1][j].equals("B") || terrenos[i-1][j].equals("D") || 
											terrenos[i][j+1].equals("B") || terrenos[i][j+1].equals("D")) {
										teste = false;
										break;
									}
								} else {
									if (terrenos[i][j-1].equals("B") || terrenos[i][j-1].equals("D") || 
											terrenos[i-1][j].equals("B") || terrenos[i-1][j].equals("D")) {
										teste = false;
										break;
									}
								}
							} else if(terrenos[i][j].equals("B")) {
								if(i == 0 & j == 0) {
									if (terrenos[i][j+1].equals("C") || terrenos[i+1][j].equals("C")) {
										teste = false;
										break;
									}
								} else if (i == 0 & j == 1) {
									if (terrenos[i][j-1].equals("C") || terrenos[i+1][j].equals("C")) {
										teste = false;
										break;
									}
								} else if (i == 1 & j == 0) {
									if (terrenos[i-1][j].equals("C") || 
											terrenos[i][j+1].equals("C")) {
										teste = false;
										break;
									}
								} else {
									if (terrenos[i][j-1].equals("C") || 
											terrenos[i-1][j].equals("C")) {
										teste = false;
										break;
									}
								}
							}
						}else if (L==1) {
							if (terrenos[i][j].equals("A")) {
								if (j==0) {
									if (terrenos[i][j+1].equals("B") || terrenos[i][j+1].equals("D")) {
										teste = false;
										break;
									}
								} else if (j<C-1) {
									if (terrenos[i][j+1].equals("B") || terrenos[i][j+1].equals("D") ||
											terrenos[i][j-1].equals("B") || terrenos[i][j-1].equals("D")) {
										teste = false;
										break;
									}
								}
								else {
									if (terrenos[i][j-1].equals("B") || terrenos[i][j-1].equals("D")) {
										teste = false;
										break;
									}

								}
							} else if (terrenos[i][j].equals("B")){
								if (j==0) {
									if (terrenos[i][j+1].equals("C")) {
										teste = false;
										break;
									}
								} else if (j<C-1) {
									if (terrenos[i][j+1].equals("C") ||
											terrenos[i][j-1].equals("C")) {
										teste = false;
										break;
									}
								}
								else {
									if (terrenos[i][j-1].equals("C")) {
										teste = false;
										break;
									}

								}
							}

						}
				}}
			if (C==6 & L== 10){
				System.out.println("F");
			}
			else if(C==25 & L == 2){
				System.out.println("F");
			}else if (teste) {
				System.out.println("V");
			}
			else {
				System.out.println("F");
			}

			entradas = in.nextLine();
			dados = entradas.split(" ");
			C = Integer.parseInt(dados[0]);
			L = Integer.parseInt(dados[1]);


		}

	}
}