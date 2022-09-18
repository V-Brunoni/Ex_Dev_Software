package Lista_1;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float custo_fabrica;
		double custo_final;
		
		System.out.println("Informe o custo de fabrica do carro: ");
		custo_fabrica = sc.nextFloat();
		
		custo_final = (custo_fabrica * 0.28) + (custo_fabrica * 0.45) + custo_fabrica;
		
		System.out.println("O custo final ao consumido e de R$ "+custo_final);
		
		
	}

}
