package Lista_4.Ex_1;

import java.util.Scanner;

public class Calculadora {
	
	double n1;
	double n2;
	double r;
	Scanner sc = new Scanner(System.in);
	
	public void somar(double n1,double n2) {
		System.out.println("Informe o primeiro numero: ");
		n1 = sc.nextDouble();
		System.out.println("Informe o segundo numero: ");
		n2 = sc.nextDouble();
		r = n1 + n2;
		System.out.println("O resultado da soma foi: "+r);	
	}
	public void subtrair(double n1,double n2) {
		System.out.println("Informe o primeiro numero: ");
		n1 = sc.nextDouble();
		System.out.println("Informe o segundo numero: ");
		n2 = sc.nextDouble();
		r = n1 - n2;
		System.out.println("O resultado da subtracao foi: "+r);	
	}
	public void multiplicar(double n1,double n2) {
		System.out.println("Informe o primeiro numero: ");
		n1 = sc.nextDouble();
		System.out.println("Informe o segundo numero: ");
		n2 = sc.nextDouble();
		r = n1 * n2;
		System.out.println("O resultado da multiplicacao foi: "+r);	
	}
	public void dividir(double n1,double n2) {
		System.out.println("Informe o primeiro numero: ");
		n1 = sc.nextDouble();
		System.out.println("Informe o segundo numero: ");
		n2 = sc.nextDouble();
		r = n1 / n2;
		System.out.println("O resultado da divisao foi: "+r);	
	}

}
