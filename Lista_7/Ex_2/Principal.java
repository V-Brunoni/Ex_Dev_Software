package Lista_7.Ex_2;

public class Principal {
	public static void main(String[] args) {
		
		
		Funcionario f = new Funcionario();
		f.dados("Luiz", 654654);
		
		Funcionario_Basico fb = new Funcionario_Basico();
		fb.dados("Ana", 654654, "Nelson Pedrini");
		
		Funcionario_Medio fm = new Funcionario_Medio();
		fm.dados("Paulo", 56465, "IFC");
		
		Funcionario_Superior fs = new Funcionario_Superior();
		fs.dados("Vinicius", 878654, "Unoesc");
	}

}
