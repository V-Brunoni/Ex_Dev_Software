package Lista_3;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<>();
		int c; 
		Scanner sc = new Scanner(System.in);
		
		for(c = 0; c <= 9; c++) {
			System.out.println("Informe 10 numeros: ");
			l1.add(sc.nextInt());
		}
		System.out.println("O maior numero da lista é: "+Collections.max(l1));
		System.out.println("O menor numero da lista é: "+Collections.min(l1));
		
		
		
		
	}

}
