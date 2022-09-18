package Lista_6.Ex_1;

public class AssistenteTecnico extends Assistente{
	
	
	public double bonusSalarial() {
		setSalario(getSalario() * 0.2);
		return this.getSalario();
	}

}
