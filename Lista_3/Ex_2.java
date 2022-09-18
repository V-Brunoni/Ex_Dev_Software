package Lista_3;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		
		int[] v1 = new int[5];
		int[] v2 = new int[5];
		int[] v3 = new int[5];
		int c; 
		
		Scanner sc = new Scanner(System.in);
		
		for(c = 0; c <= 4; c++) {
			System.out.println("Digite 5 numeros para o vetor 1: ");
			v1[c] = sc.nextInt();
		}
		for(c = 0; c <= 4; c++) {
			System.out.println("Digite 5 numeros para o vetor 2: ");
			v2[c] = sc.nextInt();
		}	
		
		System.out.println("Vetor 1: ");
		for(c = 0; c <= 4; c++) {
			System.out.println(v1[c]);
		}
		System.out.println("Vetor 2: ");
		for(c = 0; c <= 4; c++) {
			System.out.println(v2[c]);
		}
		System.out.println("Vetor 3: ");
		for(c = 0; c <= 4; c++) {
			v3[c] = v1[c] + v2[c];
			System.out.println(v3[c]);
		}
		
		
		
		
		
		
	}

}
