package Algoritmo;

import java.util.Scanner;

public class AlgTeste {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println();
		System.out.println(nome + ", Hello World!");
		
		
		
		sc.close();
	}
	

}
