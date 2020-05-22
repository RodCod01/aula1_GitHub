package Aplicacao;

import java.util.Scanner;

public class P96Matriz {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
// Para criar uma matriz tem de instanciar e percorrer a matriz		
		int [] [] mat = new int [n] [n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat [i] [j] = sc.nextInt();
			}
		}
		
// Para ler a diagonal principal
// Pode substituir o i < n por i < lenght para percorrer as linhas na matriz
// Pode substituir o i < n por i < mat[i].lenght para percorrer as colunas na matriz		
		System.out.println("Main diagonal: ");
		for (int i  = 0; i< n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

// Quantidade de números negativos
		int count = 0;
		for(int i = 0; i < n; i++ ) {
			for(int j = 0; j < n; j++) {
				if (mat[i][j] < 0){
					count++;
					
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		
		sc.close();
	}
}
