package Lista_2;

import java.util.Scanner;

public class Ex_8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x; int y; int p = 1;
		
		System.out.println("Informe o valor de x(base): ");
		x = sc.nextInt();
		
		System.out.println("Informe o valor de y(expoente): ");
		y = sc.nextInt();
		
		
		for(; y >= 1; y--) {
			p = p * x;		
		}
		
		System.out.println("O Resultado é: "+p);
		
		
		
	}

}
