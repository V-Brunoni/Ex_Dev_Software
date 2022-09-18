package Lista_7.Ex_1;

public class DVDs extends Produto{
	
	private double duracao;

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	public void dados(String nome, double preco, double duracao){
		super.dados(nome, preco);
		this.duracao = duracao;
	}
	
	public String toString(){
		return super.toString() + "\nDuracao: " + this.duracao;	
	}
	

}
