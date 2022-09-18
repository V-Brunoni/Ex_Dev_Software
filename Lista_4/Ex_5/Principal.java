package Lista_4.Ex_5;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		CadernoAnotacoes c1 = new CadernoAnotacoes();
		
		Scanner sc = new Scanner(System.in);
		
		int c =0;
		String anotacao;
		
		
		while(c != 4) {	
			System.out.println("1 Adicionar Anotacao\r\n"
				+ "2 Visualizar Caderno de Anotacoes\r\n"
				+ "3 Apagar Anotacoes\r\n"
				+ "4 Sair");
			c=sc.nextInt();
		
			switch(c) {
				case 1:
					System.out.println("Escreva suas anotacoes: ");
					anotacao=sc.next();
					c1.adicionarAnotacao(anotacao);
					break;
				case 2:
					//System.out.println("As suas anotacoes são: ");
					c1.visualizarAnotacoes();
					break;
				case 3:
					System.out.println("Apagando Anotacoes...");
					c1.apagarAnotacoes();
					break;
				case 4:
					break;
				
		}
		
		}
		
	}
	

}
