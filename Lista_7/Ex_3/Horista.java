package Lista_7.Ex_3;

public class Horista extends Empregado {
	
	private double precoHora;
	private double horasTrabalhadas;
	
	
	public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas) {
		super(nome, sobrenome, cpf);
		this.setPrecoHora(precoHora);
		this.setHorasTrabalhadas(horasTrabalhadas);
	}


	public double getPrecoHora() {
		return precoHora;
	}


	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}


	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	
	public double vencimento() {
		return precoHora * horasTrabalhadas;
	}
	

}
