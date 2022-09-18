package Lista_6.Ex_1;

public class Funcionario {
	
	String nome;
	double salario;
	
	public void addAumento(double valor) {
		setSalario(getSalario() + valor);
		System.out.println("O salario do Funcionario com o aumento sera: R$"+getSalario());
	}
	
	public void ganhoAnual() {
		setSalario(getSalario() * 12);
		System.out.println("O Ganho Anual do Funcionario e: R$"+getSalario());
	}
	
	public void exibeDados() {
		System.out.println("Nome: "+getNome());
		System.out.println("Salario: R$"+getSalario());
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	

	

}
