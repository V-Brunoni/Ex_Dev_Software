package Lista_7.Ex_2;

public class Funcionario_Superior extends Funcionario{
	
	private String universidade;

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	
	public void dados(String nome, int cod, String universidade){
		super.dados(nome, cod);
		this.universidade = universidade;
	}

}
