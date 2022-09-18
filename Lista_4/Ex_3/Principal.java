package Lista_4.Ex_3;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		double valor;
		
		Conta c1 = new Conta(9999999, "Corrente", "Vinicius", 500.00);
		Conta c2 = new Conta(8888888, "Poupança", "Rafael", 100.00);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o valor para deposito: ");
		valor = sc.nextDouble();
		c1.depositar(valor);
		
		System.out.println("Informe o valor para deposito: ");
		valor = sc.nextDouble();
		c2.depositar(valor);
		
		System.out.println("Informe o valor de saque: ");
		valor = sc.nextDouble();
		c1.sacar(valor);
		
		System.out.println("Informe o valor de saque: ");
		valor = sc.nextDouble();
		c2.sacar(valor);
		
		c1.verificarSaldo();
		c2.verificarSaldo();
		
		
		
	}

}
