package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Ent88Vetores;

public class Program88Vetores {
	public static void main(String[] args) {
		
// Preparando o ambiente com o formato dos números e para pegar as informações da tela.		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
// Declarando a variável de repetições e instanciando o construtor		
		int n = sc.nextInt();
		Ent88Vetores[] vect = new Ent88Vetores[n];
		
// Coletando N nomes e preços, colocando eles no array		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Ent88Vetores(name, price);
		}
		
// Coletando os valores de preço no array, somando e adicionando na variável sum
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
// 	Tirando a média a partir das soma da variável sum, dividindo pela quantidade de repetições na variável n
		double avg = sum/n;
		
// Mostrando na tela com a formação para double
		System.out.printf("Average Price = %.2f%n", avg);
		
		sc.close();
	}

}
