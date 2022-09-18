package Lista_4.Ex_2;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		double n1, n2, n3;
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno("Vinicius", 21, 10);
		
		
		System.out.println("Informe a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.println("Informe a terceira nota: ");
		n3 = sc.nextDouble();
		
		
		aluno.calcularMedia(n1, n2, n3);
		aluno.verificarAprovacao();
		
		
		
		
	}

}
