package Lista_1;

import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float valor_hora;
		float horas_trabalhadas;
		float salario;
		
		System.out.println("Informe o valor por hora trabalhada: ");
		valor_hora = sc.nextFloat();
		
		System.out.println("Informe as horas trabalhadas no mês: ");
		horas_trabalhadas = sc.nextFloat();
		
		salario = valor_hora * horas_trabalhadas;
		
		System.out.println("O seu salario e de R$ "+salario);
		
		
		
		
		
		
	}

}
