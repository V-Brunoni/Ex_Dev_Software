package Lista_7.Ex_3;

public class Assalariado extends Empregado {
	
	private double salario;

	public Assalariado(String nome, String sobrenome,String cpf,double salario) {
		super(nome, sobrenome, cpf);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double vencimento() {
		return salario;
	}
	
	


}
