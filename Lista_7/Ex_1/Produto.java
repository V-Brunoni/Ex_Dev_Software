package Lista_7.Ex_1;

public class Produto {
	
	private String nome;
	private double preco;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public void dados(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}	
		
	public String toString(){
		return "\nNome: " + this.nome +
				"\nPreco: R$" + this.preco;	
	}
	

}
