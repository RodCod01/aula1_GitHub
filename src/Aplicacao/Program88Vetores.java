package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Ent88Vetores;

public class Program88Vetores {
	public static void main(String[] args) {
		
// Preparando o ambiente com o formato dos n�meros e para pegar as informa��es da tela.		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
// Declarando a vari�vel de repeti��es e instanciando o construtor		
		int n = sc.nextInt();
		Ent88Vetores[] vect = new Ent88Vetores[n];
		
// Coletando N nomes e pre�os, colocando eles no array		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Ent88Vetores(name, price);
		}
		
// Coletando os valores de pre�o no array, somando e adicionando na vari�vel sum
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
// 	Tirando a m�dia a partir das soma da vari�vel sum, dividindo pela quantidade de repeti��es na vari�vel n
		double avg = sum/n;
		
// Mostrando na tela com a forma��o para double
		System.out.printf("Average Price = %.2f%n", avg);
		
		sc.close();
	}

}
