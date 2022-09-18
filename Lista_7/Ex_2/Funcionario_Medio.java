package Lista_7.Ex_2;

public class Funcionario_Medio extends Funcionario{
	
	private String escola;

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}
	
	public void dados(String nome, int cod, String escola){
		super.dados(nome, cod);
		this.escola = escola;
	}

}
