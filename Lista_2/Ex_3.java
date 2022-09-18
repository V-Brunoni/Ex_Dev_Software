package Lista_2;

import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a; //número de anos fumando
		int b; //número de cigarros fumados por dia
		float preco;
		
		System.out.println("Informe o número de anos fumando: ");
		a = sc.nextInt();
		
		System.out.println("Informe o número de cigarros fumados por dia: ");
		b = sc.nextInt();
		
		System.out.println("Informe o preço da carteira de cigarro: ");
		preco = sc.nextFloat();
		
		a = a * 365; //tempo em dias fumando
		b = b *a; 
		preco = preco * b/20;
		
		System.out.println("O valor gasto foi de R$"+preco);
		
		
		
		
		
		
		
	}

}
