package Lista_3;

import java.util.Scanner;

public class Ex_5 {
	
	static int maior, menor, n;
	public static void m() {	
		
	Scanner sc = new Scanner(System.in);	
			
			for(int c = 1; c <= 5; c++) {
				System.out.println("Informe 5 numeros: ");
				n = sc.nextInt();
				if(n > maior) {
					maior = n;
				}
			}
			menor = maior;
			for(int b = 1; b <= 5;b++) {
				if(n < menor) {
					menor = n;
				}		
			}		
			System.out.println("O maior numero e: "+maior);
			System.out.println("O menor numero e: "+menor);
	}
	
	public static void main(String[] args) {
		m();
		
		
		
		
	}
	
}
