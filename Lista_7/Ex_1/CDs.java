package Lista_7.Ex_1;

public class CDs extends Produto{
	
	private int n_faixas;

	public int getN_faixas() {
		return n_faixas;
	}

	public void setN_faixas(int n_faixas) {
		this.n_faixas = n_faixas;
	}
	
	public void dados(String nome, double preco, int n_faixas){
		super.dados(nome, preco);
		this.n_faixas = n_faixas;
	}
	
	public String toString(){
		return super.toString() + "\nNumero de faixas: " + this.n_faixas;	
	}
	
	

}
