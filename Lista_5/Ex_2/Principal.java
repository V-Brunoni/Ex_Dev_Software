package Lista_5.Ex_2;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Elevador e = new Elevador(0,0,0,0);
		
		e.inicializa(10, 4);
		e.entra();
		e.entra();
		e.entra();
		System.out.println("Numero de Pessoas no Elevador: "+e.getPessoas());
		e.sai();
		System.out.println("Numero de Pessoas no Elevador: "+e.getPessoas());
		
		e.sobe();
		e.sobe();
		System.out.println("Numero Atual do Andar: "+e.getAndar());
		e.desce();
		System.out.println("Numero Atual do Andar: "+e.getAndar());
		
	}

}
