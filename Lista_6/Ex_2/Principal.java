package Lista_6.Ex_2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		Imovel i = new Imovel();
		Novo n = new Novo();
		Velho v = new Velho();
		
		int c;
		
		System.out.println("Informe 1 para um Imovel Novo e 2 para um Imovel Velho.");
		c = sc.nextInt();
		
		switch(c) {
			case 1:
				n.setAdicional_preco(0.10);
				n.setPreco(300000);
				n.addPreco(n.getAdicional_preco());
				break;
			case 2:
				v.setDesconto_preco(0.10);
				v.setPreco(150000);
				v.descPreco(v.getDesconto_preco());
				break;
		}
		
		
		
		
		
	}

}
