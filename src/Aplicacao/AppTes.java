package Aplicacao;

import java.util.Scanner;

public class AppTes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declarando as variáveis
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//Instanciando a matriz
		int [][] mat = new int [n][m];
		
		//Entrada - Preenchendo a matriz
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0;j<mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Posição = " + i + "," + j + ":");
					if (j>0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i>0) {
						System.out.println("A cima: " + mat[i-1][j]);
					}
					if (j<mat[i].length -1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i<mat.length -1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		
		sc.close();
	}
}
