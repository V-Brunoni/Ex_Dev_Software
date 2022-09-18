package Lista_6.Ex_1;

public class Assistente extends Funcionario{


	int matricula;
	
	
	
	
	public int getMatricula() {
		return matricula;
	}




	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}




	public void exibeDados() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Salario: R$"+getSalario());
		System.out.println("Matricula: "+getMatricula());
		
	}

}
