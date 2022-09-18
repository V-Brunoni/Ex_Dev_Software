package Lista_4.Ex_4;

public class Veiculo {
	
	int ano;
	String modelo;
	String cor;
	double km;
	
	public Veiculo(int ano, String modelo, String cor, double km) {
		super();
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
		this.km = km;	
	}
	
	public void verificarManutencao() {
		if(km < 25000) {
			System.out.println("Tudo ok!");
		}else if(km >= 25000 && km <= 75000) {
			System.out.println("Realizar revisão parcial!");
		}else {
			System.out.println("Realizar revisão completa!");
		}
	}
	
	public void mudarCor(String cor) {
		this.cor = cor;
	}
	
	public void exibirCor() {
		System.out.println("Cor: "+cor);
	}

}
