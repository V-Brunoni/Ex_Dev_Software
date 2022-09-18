package Lista_6.Ex_1;

public class Principal {
	public static void main(String[] args) {
		
		AssistenteAdministrativo aa = new AssistenteAdministrativo();
		AssistenteTecnico at = new AssistenteTecnico();
		
		aa.setNome("Vinicius");
		aa.setSalario(2000);
		aa.setMatricula(5555);
		aa.exibeDados();
		
		
		at.setNome("Rodrigo");
		at.setSalario(5000);
		at.setMatricula(8888);
		at.exibeDados();
	}

}
