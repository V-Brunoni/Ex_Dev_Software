package Lista_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		int c; 
		Scanner sc = new Scanner(System.in);
		
		for(c = 0; c <= 4; c++) {
			System.out.println("Informe 5 numeros: ");
			l1.add(sc.nextInt());
		}
		
		Collections.sort(l1);
		System.out.println("Ordem Crescente: "+l1);
		
		Collections.reverse(l1);
		System.out.println("Ordem Decrescente: "+l1);
		
		
		
		
				
		
		
		
	}

}
