package Lista_2;

import java.util.Scanner;

public class Ex_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Informe o primeiro número: ");
		a = sc.nextInt();
		
		System.out.println("Informe o segundo número: ");
		b = sc.nextInt();
		
		if(a > b) {
			System.out.println("O primeiro número é o maior.");
		}else {
		if(a == b) {
			System.out.println("Os números são iguais.");
		}else {
			System.out.println("O segundo número é o maior.");
		}
		}
		
		
	}

}
