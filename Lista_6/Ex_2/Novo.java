package Lista_6.Ex_2;

public class Novo extends Imovel{
	
	public double adicional_preco;

	public double getAdicional_preco() {
		return adicional_preco;
	}

	public void setAdicional_preco(double preco) {
		this.adicional_preco = preco;
	}
	
	public void addPreco(double preco) {
		this.adicional_preco = preco * this.preco;
		System.out.println("Preco do Imovel apos Adicional: R$"+ (this.adicional_preco+this.preco));
	}

}
