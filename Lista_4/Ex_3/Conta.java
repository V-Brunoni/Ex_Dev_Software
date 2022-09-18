package Lista_4.Ex_3;

public class Conta {
	
	double numeroConta;
	String tipoConta;
	String titularConta;
	double saldo;
	
	
	public Conta(double numeroConta, String tipoConta, String titularConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.titularConta = titularConta;
		this.saldo = saldo;
	}
	
	
	public void depositar(double valor) {
		saldo = valor + saldo;
		//System.out.println("Saldo: "+saldo);		
	}
	
	public void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Erro! Valor inserido maior que o saldo.");
		}else {
			saldo = saldo - valor;
			//System.out.println("Saldo: "+saldo);
		}	
	}
	
	public void verificarSaldo(){
		System.out.println("\nNumero da Conta: "+numeroConta);
		System.out.println("Tipo da Conta: "+tipoConta);
		System.out.println("Nome do Titular da Conta: "+titularConta);
		System.out.println("Saldo Atual: R$"+saldo);
		
	}
	

}
