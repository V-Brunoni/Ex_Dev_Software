package Lista_6.Ex_2;

public class Velho extends Imovel{
	
	public double desconto_preco;

	public double getDesconto_preco() {
		return desconto_preco;
	}

	public void setDesconto_preco(double preco) {
		this.desconto_preco = preco;
	}
	
	
	public void descPreco(double preco) {
		this.desconto_preco = preco * this.preco;
		System.out.println("Preco do Imovel apos Desconto: R$"+ (this.preco-this.desconto_preco));
	}

	
	

}
