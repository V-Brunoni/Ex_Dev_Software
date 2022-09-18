package Lista_6.Ex_1;

public class AssistenteAdministrativo extends Assistente{
	
	public double adicionalNoturno() {
		setSalario(getSalario() * 0.5);
		return this.getSalario();
		
	}

}
