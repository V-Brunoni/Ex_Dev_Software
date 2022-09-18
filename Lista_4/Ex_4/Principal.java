package Lista_4.Ex_4;

public class Principal {
	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo(2013, "Gol 1.0", "Prata", 15000);
		
		v1.verificarManutencao();
		v1.exibirCor();
		v1.mudarCor("Vermelho");
		v1.exibirCor();
		
		
		
	}

}
