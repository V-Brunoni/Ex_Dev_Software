package Lista_2;

import java.util.Scanner;

public class Ex_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Informe seu nome: ");
		nome = sc.next();
		
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
		
		if(idade < 16) {
			System.out.println(nome+" Não pode votar!");
		}else {
			System.out.println(nome+" Apto para votar!");
		}
		
		
		
	}

}
