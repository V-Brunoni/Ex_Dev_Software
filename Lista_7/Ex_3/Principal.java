package Lista_7.Ex_3;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Empregado a = new Assalariado("Vinicius","Brunoni","999999",2000);			
		a.exibirDados();
		System.out.println("Salario Assalariado: R$"+a.vencimento()+"\n");
		
		Empregado c = new Comissionado("Joao","Silva","888888",10000,0.10);
		c.exibirDados();
		System.out.println("Salario Comissionado: R$"+c.vencimento()+"\n");
		
		Empregado h = new Horista("Rafael","Oliveira","111111",12,180);
		h.exibirDados();
		System.out.println("Salario Horista: R$"+h.vencimento());
		
		
	}

}
