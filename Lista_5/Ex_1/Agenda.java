package Lista_5.Ex_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	
		Pessoa p1 = new Pessoa();
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> l = new ArrayList<>();
		
		void armazenaPessoa(String nome, int idade, double altura) {
			p1.setNome(nome);
			p1.setIdade(idade);
			p1.setAltura(altura);
			System.out.println("Nome: "+p1.getNome());
			System.out.println("Idade: "+p1.getIdade());
			System.out.println("Altura: "+p1.getAltura());		
		}
		
		void removePessoa(String nome) {
		
			
		}
		
		int buscaPessoa(String nome) {
			return 0;		
		}
		
		
		void imprimeAgenda() {
			
		}
		
		void imprimePessoa(int index) {
			
		}
}
