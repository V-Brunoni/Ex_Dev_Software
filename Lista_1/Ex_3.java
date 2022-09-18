package Lista_1;

import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			String genero;
			
			System.out.println("Informe o genero: M para Masculino/F para Feminino");
			genero = sc.next();
			
			if(genero.equals("M")) {
				System.out.println("Genero Masculino");
			}else {
			if(genero.equals("F")) {
				System.out.println("Genero Feminino");
			}else {
				System.out.println("ERRO!");
			}
				
			}
		}
		
		
	}

}
